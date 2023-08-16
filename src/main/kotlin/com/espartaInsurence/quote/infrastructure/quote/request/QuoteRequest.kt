package com.espartaInsurence.quote.infrastructure.quote.request

import com.espartaInsurence.quote.entity.model.QuoteDto

data class QuoteRequest(
    val id: Int? = null,
    val insuredData: InsuredDataRequest,
    val car: CarRequest,
    val driver: DriverRequest,
    val isRenovation: Boolean,
    val insurerRenovation: String,
    val bonus: Int,
    val zipNight: String,
    val hasRiskPersonLivingWith: Boolean,
    val hasRiskPersonAsDrive: Boolean,
    val hasGarage: Boolean,
    val carUse: Int,
)

fun QuoteRequest.toQuoteDto() = QuoteDto(
    id = this.id,
    insuredDataDto = this.insuredData.toInsurenceDataDto(),
    car = this.car.toCarDto(),
    driverDto = this.driver.toDriverDto(),
    isRenovation = this.isRenovation,
    insurerRenovation = this.insurerRenovation,
    bonus = this.bonus,
    zipNight = this.zipNight,
    hasRiskPersonLivingWith = this.hasRiskPersonLivingWith,
    hasRiskPersonAsDrive = this.hasRiskPersonAsDrive,
    hasGarage = this.hasGarage,
    carUse = this.carUse,
)