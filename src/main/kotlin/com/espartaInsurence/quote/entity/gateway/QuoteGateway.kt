package com.espartaInsurence.quote.entity.gateway

import com.espartaInsurence.quote.entity.model.Quote

interface QuoteGateway {
    fun create(quote: Quote)
    fun get(): Quote
    fun update(quote: Quote)
    fun delete(id: Int)
    fun findById(id: Int): Quote
    fun searchByName(nameFragment: String?): List<Quote>
}