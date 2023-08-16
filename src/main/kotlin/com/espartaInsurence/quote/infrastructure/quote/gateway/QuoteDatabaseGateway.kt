package com.espartaInsurence.quote.infrastructure.quote.gateway

import com.espartaInsurence.quote.entity.gateway.QuoteGateway
import com.espartaInsurence.quote.entity.model.*
import com.espartaInsurence.quote.infrastructure.config.db.repository.QuoteRepository
import com.espartaInsurence.quote.infrastructure.config.db.schema.toQuote
import org.springframework.stereotype.Component

@Component
class QuoteDatabaseGateway(
    private val repository: QuoteRepository
) : QuoteGateway {
    override fun create(quoteDto: QuoteDto) {
        println(quoteDto)
        println(quoteDto.toQuoteSchema())
//        repository.save(quote.toQuoteSchema())
    }
    override fun get(): QuoteDto {
//        val quoteSchema = repository.findById(213)
//        PARSE
        val car = CarDto("Volks", "Tiguan", "21332", licensePlate = "CFR6188", yearManufacture = "2023", yearModel = "2023")
        val insuredAddressDto = InsuredAddressDto(zip = "04161-060", street = "Rua democracia", neighborhood = "Vila Brasilina", number = "516", complement = "complemente")
        val insuredDataDto = InsuredDataDto(insuredName = "Mirian Ruiz", document = "03836624869", email = "mirian@gmail.com", phone = "958527442", dataOfBirth = "01-11-1957", insuredAddressDto = insuredAddressDto)
        val driverDto = DriverDto("Rodolfo RUiz", "36647042822", dataOfBirth = "02-01-1998")
        val quoteDto = QuoteDto(
            car = car,
            insuredDataDto = insuredDataDto,
            driverDto = driverDto,
            isRenovation = true,
            insurerRenovation = "Azul",
            bonus = 8,
            zipNight = "04161-060",
            hasRiskPersonLivingWith = false,
            hasRiskPersonAsDrive = false,
            hasGarage = true,
            carUse = 1
        )
        return quoteDto
    }
    override fun update(quoteDto: QuoteDto) {
        if(repository.existsById(quoteDto.id ?: 0).not()) throw Exception()
        repository.save(quoteDto.toQuoteSchema())
    }

    override fun delete(id: Int) {
        if(repository.existsById(id).not()) throw Exception()
        repository.deleteById(id)
    }

    override fun findById(id: Int): QuoteDto {
        val quoteSchema = repository.findById(id).orElseThrow()
        return quoteSchema.toQuote()
    }

    override fun searchByName(nameFragment: String?): List<QuoteDto> {
        return listOf()
    }
}