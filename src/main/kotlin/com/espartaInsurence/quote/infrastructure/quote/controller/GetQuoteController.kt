package com.espartaInsurence.quote.infrastructure.quote.controller

import com.espartaInsurence.quote.entity.model.QuoteDto
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
    fun get(): QuoteDto {
        return getQuoteUseCase()
    }
}