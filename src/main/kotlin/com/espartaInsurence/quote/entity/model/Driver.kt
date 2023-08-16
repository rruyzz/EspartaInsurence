package com.espartaInsurence.quote.entity.model

import com.espartaInsurence.quote.infrastructure.config.db.schema.DriverSchema

data class Driver(
    val name: String,
    val document: String,
    val dataOfBirth: String,
)

fun Driver.toDriverSchema() = DriverSchema(
    name = this.name,
    document = this.document,
    dataOfBirth = this.dataOfBirth,
)