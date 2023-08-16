package com.espartaInsurence.quote.infrastructure.quote.request

import com.espartaInsurence.quote.entity.model.DriverDto

data class DriverRequest(
    val name: String,
    val document: String,
    val dataOfBirth: String,
)

fun DriverRequest.toDriverDto() = DriverDto(
    name = this.name,
    document = this.document,
    dataOfBirth = this.dataOfBirth,
)