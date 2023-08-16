package com.espartaInsurence.quote.infrastructure.config.db.schema

import com.espartaInsurence.quote.entity.model.Driver
import com.espartaInsurence.quote.entity.model.InsuredData
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

fun DriverSchema.toDriver() = Driver(
    name = this.name,
    document = this.document,
    dataOfBirth = this.dataOfBirth,
)