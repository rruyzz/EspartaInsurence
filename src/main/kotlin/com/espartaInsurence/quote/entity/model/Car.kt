package com.espartaInsurence.quote.entity.model

import com.espartaInsurence.quote.infrastructure.config.db.schema.CarSchema
import com.espartaInsurence.quote.infrastructure.config.db.schema.QuoteSchema

data class Car(
    val brand: String,
    val model: String,
    val chassi: String,
)

fun Car.toCarSchema() = CarSchema(
    brand = this.brand,
    model = this.model,
    chassi = this.chassi,
)