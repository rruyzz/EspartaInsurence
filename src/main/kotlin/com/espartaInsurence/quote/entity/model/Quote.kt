package com.espartaInsurence.quote.entity.model

import com.espartaInsurence.quote.infrastructure.config.db.schema.QuoteSchema

data class Quote(
    val id: Int? = null,
    val insuredData: InsuredData,
    val car: Car,
    val driver: Driver,
    val isRenovation: Boolean,
    val insurerRenovation: String,
    val bonus: Int,
    val zipNight: String,
    val hasRiskPersonLivingWith: Boolean,
    val hasRiskPersonAsDrive: Boolean,
    val hasGarage: Boolean,
    val carUse: Int,
)

fun Quote.toQuoteSchema() = QuoteSchema(
    id = this.id,
    insuredData = this.insuredData.toInsuredDataSchema(),
    car = this.car.toCarSchema(),
    driver = driver.toDriverSchema(),
    isRenovation = this.isRenovation,
    insurerRenovation = this.insurerRenovation,
    bonus = this.bonus,
    zipNight = this.zipNight,
    hasRiskPersonLivingWith = this.hasRiskPersonLivingWith,
    hasRiskPersonAsDrive = this.hasRiskPersonAsDrive,
    hasGarage = this.hasGarage,
    carUse = this.carUse,
)