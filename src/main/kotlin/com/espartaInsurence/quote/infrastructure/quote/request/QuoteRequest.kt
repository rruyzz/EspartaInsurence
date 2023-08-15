package com.espartaInsurence.quote.infrastructure.quote.request

import com.espartaInsurence.quote.entity.model.Quote

data class QuoteRequest(
    val id: Int,
    val car: CarRequest,
    val value: String,
)

fun QuoteRequest.toQuote() = Quote(
    id = this.id,
    car = this.car.toCar(),
    value = this.value
)