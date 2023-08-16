package com.espartaInsurence.quote.infrastructure.quote.request

import com.espartaInsurence.quote.entity.model.Driver

data class DriverRequest(
    val name: String,
    val document: String,
    val dataOfBirth: String,
)

fun DriverRequest.toDriver() = Driver(
    name = this.name,
    document = this.document,
    dataOfBirth = this.dataOfBirth,
)