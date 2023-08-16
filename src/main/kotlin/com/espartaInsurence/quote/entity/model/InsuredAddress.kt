package com.espartaInsurence.quote.entity.model

import com.espartaInsurence.quote.infrastructure.config.db.schema.InsuredAddressSchema

data class InsuredAddress(
    val id: Int? = null,
    val zip: String,
    val street: String,
    val neighborhood: String,
    val number: String,
    val complement: String,
)


fun InsuredAddress.toInsuredAddressSchema() = InsuredAddressSchema(
    id = this.id,
    zip = this.zip,
    street = this.street,
    neighborhood = this.neighborhood,
    number = this.number,
    complement = this.complement,
)