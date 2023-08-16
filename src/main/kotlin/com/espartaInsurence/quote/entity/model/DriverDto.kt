package com.espartaInsurence.quote.entity.model

import com.espartaInsurence.quote.infrastructure.config.db.schema.DriverSchema

data class DriverDto(
    val name: String,
    val document: String,
    val dataOfBirth: String,
)

fun DriverDto.toDriverSchema() = DriverSchema(
    name = this.name,
    document = this.document,
    dataOfBirth = this.dataOfBirth,
)