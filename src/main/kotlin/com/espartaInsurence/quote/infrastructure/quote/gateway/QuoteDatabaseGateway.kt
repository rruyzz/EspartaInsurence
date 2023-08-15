package com.espartaInsurence.quote.infrastructure.quote.gateway

import com.espartaInsurence.quote.entity.gateway.QuoteGateway
import com.espartaInsurence.quote.entity.model.Car
import com.espartaInsurence.quote.entity.model.Quote
import com.espartaInsurence.quote.entity.model.toQuoteSchema
import com.espartaInsurence.quote.infrastructure.config.db.repository.QuoteRepository
import org.springframework.stereotype.Component

@Component
class QuoteDatabaseGateway(
    private val repository: QuoteRepository
) : QuoteGateway {
    override fun create(quote: Quote) {
        repository.save(quote.toQuoteSchema())
    }
    override fun get(): Quote {
//        val quoteSchema = repository.findById(213)
//        PARSE
        return Quote(car = Car("Volks", "Tiguan", "21332"), value = "value", id = 213312)
    }
    override fun update(quote: Quote) {
        if(repository.existsById(quote.id).not()) throw Exception()
        repository.save(quote.toQuoteSchema())
    }

    override fun delete(id: Int) {
        if(repository.existsById(id).not()) throw Exception()
        repository.deleteById(id)
    }

    override fun findById(id: Int): Quote {
        val quoteSchema = repository.findById(id).orElseThrow()
        val car = Car(quoteSchema.car.brand, quoteSchema.car.model, quoteSchema.car.chassi)
        return Quote(car, quoteSchema.value, quoteSchema.id)
    }

    override fun searchByName(nameFragment: String?): List<Quote> {
        return listOf()
    }
}