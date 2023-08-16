package com.espartaInsurence.quote.entity.gateway

import com.espartaInsurence.quote.entity.model.QuoteDto

interface QuoteGateway {
    fun create(quoteDto: QuoteDto)
    fun get(): QuoteDto
    fun update(quoteDto: QuoteDto)
    fun delete(id: Int)
    fun findById(id: Int): QuoteDto
    fun searchByName(nameFragment: String?): List<QuoteDto>
}