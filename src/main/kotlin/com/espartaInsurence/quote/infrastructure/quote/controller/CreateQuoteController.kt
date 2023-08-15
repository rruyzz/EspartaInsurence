package com.espartaInsurence.quote.infrastructure.quote.controller

import com.espartaInsurence.quote.infrastructure.quote.request.QuoteRequest
import com.espartaInsurence.quote.infrastructure.quote.request.toQuote
import com.espartaInsurence.quote.usecase.CreateQuoteUseCase
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/quote")
class CreateQuoteController(
    private val createQuoteUseCase: CreateQuoteUseCase
) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody quoteRequest: QuoteRequest) {
        createQuoteUseCase(quoteRequest.toQuote())
    }
}