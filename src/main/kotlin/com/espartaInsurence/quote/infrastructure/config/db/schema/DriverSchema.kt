package com.espartaInsurence.quote.infrastructure.config.db.schema

import com.espartaInsurence.quote.entity.model.DriverDto
import jakarta.persistence.*

@Entity(name = "driverData")
data class DriverSchema(
    @Id
    val document: String,
    @Column
    val name: String,
    @Column
    val dataOfBirth: String,
)

fun DriverSchema.toDriver() = DriverDto(
    name = this.name,
    document = this.document,
    dataOfBirth = this.dataOfBirth,
)