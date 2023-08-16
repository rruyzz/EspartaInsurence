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
    override fun create(quote: Quote) {
        println(quote)
//        repository.save(quote.toQuoteSchema())
    }
    override fun get(): Quote {
//        val quoteSchema = repository.findById(213)
//        PARSE
        val car = Car("Volks", "Tiguan", "21332", licensePlate = "CFR6188", yearManufacture = "2023", yearModel = "2023")
        val insuredAddress = InsuredAddress(zip = "04161-060", street = "Rua democracia", neighborhood = "Vila Brasilina", number = "516", complement = "complemente")
        val insuredData = InsuredData(insuredName = "Mirian Ruiz", document = "03836624869", email = "mirian@gmail.com", phone = "958527442", dataOfBirth = "01-11-1957", insuredAddress = insuredAddress)
        val driver = Driver("Rodolfo RUiz", "36647042822", dataOfBirth = "02-01-1998")
        val quote = Quote(
            car = car,
            insuredData = insuredData,
            driver = driver,
            isRenovation = true,
            insurerRenovation = "Azul",
            bonus = 8,
            zipNight = "04161-060",
            hasRiskPersonLivingWith = false,
            hasRiskPersonAsDrive = false,
            hasGarage = true,
            carUse = 1
        )
        return quote
    }
    override fun update(quote: Quote) {
        if(repository.existsById(quote.id ?: 0).not()) throw Exception()
        repository.save(quote.toQuoteSchema())
    }

    override fun delete(id: Int) {
        if(repository.existsById(id).not()) throw Exception()
        repository.deleteById(id)
    }

    override fun findById(id: Int): Quote {
        val quoteSchema = repository.findById(id).orElseThrow()
        return quoteSchema.toQuote()
    }

    override fun searchByName(nameFragment: String?): List<Quote> {
        return listOf()
    }
}