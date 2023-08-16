package com.espartaInsurence.quote.usecase

import com.espartaInsurence.quote.entity.gateway.QuoteGateway
import com.espartaInsurence.quote.entity.model.QuoteDto
import org.springframework.stereotype.Service

@Service
class CreateQuoteUseCase(
    private val quoteGateway: QuoteGateway
) {
    operator fun invoke(quoteDto: QuoteDto) {
        quoteGateway.create(quoteDto)
    }
}