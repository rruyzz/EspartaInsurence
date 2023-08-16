package com.espartaInsurence.quote.infrastructure.quote.request

import com.espartaInsurence.quote.entity.model.Quote

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

fun QuoteRequest.toQuote() = Quote(
    id = this.id,
    insuredData = this.insuredData.toInsurenceData(),
    car = this.car.toCar(),
    driver = this.driver.toDriver(),
    isRenovation = this.isRenovation,
    insurerRenovation = this.insurerRenovation,
    bonus = this.bonus,
    zipNight = this.zipNight,
    hasRiskPersonLivingWith = this.hasRiskPersonLivingWith,
    hasRiskPersonAsDrive = this.hasRiskPersonAsDrive,
    hasGarage = this.hasGarage,
    carUse = this.carUse,
)