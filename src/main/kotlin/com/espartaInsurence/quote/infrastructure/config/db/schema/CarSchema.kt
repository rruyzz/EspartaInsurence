package com.espartaInsurence.quote.infrastructure.config.db.schema

import com.espartaInsurence.quote.entity.model.Car
import com.espartaInsurence.quote.entity.model.toCarSchema
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity(name = "carData")
data class CarSchema (
    @Id
    val chassi: String,
    @Column
    val brand: String,
    @Column
    val model: String,
    @Column
    val licensePlate: String,
    @Column
    val yearManufacture: String,
    @Column
    val yearModel: String,
)

fun CarSchema.toCar() = Car(
    brand = this.brand,
    model = this.model,
    chassi = this.chassi,
    licensePlate = this.licensePlate,
    yearManufacture = this.yearManufacture,
    yearModel = this.yearModel,
)