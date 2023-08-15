package com.espartaInsurence.quote.entity.model

import com.espartaInsurence.quote.infrastructure.config.db.schema.QuoteSchema

data class Quote(
    val car: Car,
    val value: String,
    val id: Int,
)

fun Quote.toQuoteSchema() = QuoteSchema(
    id = this.id,
    car = this.car.toCarSchema(),
    value = this.value
)