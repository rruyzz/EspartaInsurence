package com.espartaInsurence.quote.infrastructure.quote.request

import com.espartaInsurence.quote.entity.model.CarDto

data class CarRequest(
    val brand: String,
    val model: String,
    val chassi: String,
    val licensePlate: String,
    val yearManufacture: String,
    val yearModel: String,
)

fun CarRequest.toCarDto() = CarDto(
    brand = this.brand,
    model = this.model,
    chassi = this.chassi,
    licensePlate = this.licensePlate,
    yearManufacture = this.yearManufacture,
    yearModel = this.yearModel,
)