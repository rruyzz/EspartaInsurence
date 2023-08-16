package com.espartaInsurence.quote.infrastructure.quote.request

import com.espartaInsurence.quote.entity.model.InsuredDataDto

data class InsuredDataRequest(
    val insuredName: String,
    val document: String,
    val email: String,
    val phone: String,
    val dataOfBirth: String,
    val insuredAddress: InsuredAddressRequest
)

fun InsuredDataRequest.toInsurenceDataDto() = InsuredDataDto(
    insuredName = this.insuredName,
    document = this.document,
    email = this.email,
    phone = this.phone,
    dataOfBirth = this.dataOfBirth,
    insuredAddressDto = this.insuredAddress.toInsuredAddressDto(),
)