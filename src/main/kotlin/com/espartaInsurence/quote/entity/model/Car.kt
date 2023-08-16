package com.espartaInsurence.quote.entity.model

import com.espartaInsurence.quote.infrastructure.config.db.schema.CarSchema

data class Car(
    val brand: String,
    val model: String,
    val chassi: String,
    val licensePlate: String,
    val yearManufacture: String,
    val yearModel: String,
)

fun Car.toCarSchema() = CarSchema(
    brand = this.brand,
    model = this.model,
    chassi = this.chassi,
    licensePlate = this.licensePlate,
    yearManufacture = this.yearManufacture,
    yearModel = this.yearModel,
)