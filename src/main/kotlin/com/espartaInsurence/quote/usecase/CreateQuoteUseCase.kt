package com.espartaInsurence.quote.usecase

import com.espartaInsurence.quote.entity.gateway.QuoteGateway
import com.espartaInsurence.quote.entity.model.Quote
import com.espartaInsurence.quote.infrastructure.quote.request.QuoteRequest
import org.springframework.stereotype.Service

@Service
class CreateQuoteUseCase(
    private val quoteGateway: QuoteGateway
) {
    operator fun invoke(quote: Quote) {
        quoteGateway.create(quote)
    }
}