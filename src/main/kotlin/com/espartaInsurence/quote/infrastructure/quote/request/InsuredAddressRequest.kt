package com.espartaInsurence.quote.infrastructure.quote.request

import com.espartaInsurence.quote.entity.model.InsuredAddress

data class InsuredAddressRequest(
    val zip: String,
    val street: String,
    val neighborhood: String,
    val number: String,
    val complement: String,
)

fun InsuredAddressRequest.toInsuredAddress() = InsuredAddress(
    zip = this.zip,
    street = this.street,
    neighborhood = this.neighborhood,
    number = this.number,
    complement = this.complement,
)