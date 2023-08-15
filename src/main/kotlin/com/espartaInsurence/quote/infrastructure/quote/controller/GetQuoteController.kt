package com.espartaInsurence.quote.infrastructure.quote.controller

import com.espartaInsurence.quote.entity.model.Quote
import com.espartaInsurence.quote.infrastructure.quote.request.QuoteRequest
import com.espartaInsurence.quote.infrastructure.quote.request.toQuote
import com.espartaInsurence.quote.usecase.CreateQuoteUseCase
import com.espartaInsurence.quote.usecase.GetQuoteUseCase
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/quote")
class GetQuoteController (
    private val getQuoteUseCase: GetQuoteUseCase
) {

    @GetMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun get(): Quote {
        return getQuoteUseCase()
    }
}