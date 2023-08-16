package com.espartaInsurence.quote.entity.model

import com.espartaInsurence.quote.infrastructure.config.db.schema.InsuredDataSchema

data class InsuredData(
    val insuredName: String,
    val document: String,
    val email: String,
    val phone: String,
    val dataOfBirth: String,
    val insuredAddress: InsuredAddress
)



fun InsuredData.toInsuredDataSchema() = InsuredDataSchema(
    insuredName = this.insuredName,
    document = this.document,
    email = this.email,
    phone = this.phone,
    dataOfBirth = this.dataOfBirth,
    insuredAddress = this.insuredAddress.toInsuredAddressSchema(),
)