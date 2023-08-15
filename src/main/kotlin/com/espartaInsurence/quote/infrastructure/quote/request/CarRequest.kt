package com.espartaInsurence.quote.infrastructure.quote.request

import com.espartaInsurence.quote.entity.model.Car
import com.espartaInsurence.quote.entity.model.Quote

data class CarRequest(
    val brand: String,
    val model: String,
    val chassi: String,
)

fun CarRequest.toCar() = Car(
    brand = this.brand,
    model = this.model,
    chassi = this.chassi,
)