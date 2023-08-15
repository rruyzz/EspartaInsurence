package com.espartaInsurence.quote.usecase

import com.espartaInsurence.quote.entity.gateway.QuoteGateway
import com.espartaInsurence.quote.entity.model.Quote
import org.springframework.stereotype.Service

@Service
class GetQuoteUseCase(
    private val quoteGateway: QuoteGateway
) {
    operator fun invoke(): Quote {
        return quoteGateway.get()
    }
}