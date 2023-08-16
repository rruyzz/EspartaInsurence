package com.espartaInsurence.quote.usecase

import com.espartaInsurence.quote.entity.gateway.QuoteGateway
import com.espartaInsurence.quote.entity.model.QuoteDto
import org.springframework.stereotype.Service

@Service
class GetQuoteUseCase(
    private val quoteGateway: QuoteGateway
) {
    operator fun invoke(): QuoteDto {
        return quoteGateway.get()
    }
}