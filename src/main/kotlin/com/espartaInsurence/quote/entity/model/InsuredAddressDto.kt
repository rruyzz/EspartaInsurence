package com.espartaInsurence.quote.entity.model

import com.espartaInsurence.quote.infrastructure.config.db.schema.InsuredAddressSchema

data class InsuredAddressDto(
    val id: Int? = null,
    val zip: String,
    val street: String,
    val neighborhood: String,
    val number: String,
    val complement: String,
)


fun InsuredAddressDto.toInsuredAddressSchema() = InsuredAddressSchema(
    id = this.id,
    zip = this.zip,
    street = this.street,
    neighborhood = this.neighborhood,
    number = this.number,
    complement = this.complement,
)