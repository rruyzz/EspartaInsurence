package com.espartaInsurence.quote.entity.model

import com.espartaInsurence.quote.infrastructure.config.db.schema.QuoteSchema

data class QuoteDto(
    val id: Int? = null,
    val insuredDataDto: InsuredDataDto,
    val car: CarDto,
    val driverDto: DriverDto,
    val isRenovation: Boolean,
    val insurerRenovation: String,
    val bonus: Int,
    val zipNight: String,
    val hasRiskPersonLivingWith: Boolean,
    val hasRiskPersonAsDrive: Boolean,
    val hasGarage: Boolean,
    val carUse: Int,
)

fun QuoteDto.toQuoteSchema() = QuoteSchema(
    id = this.id,
    insuredData = this.insuredDataDto.toInsuredDataSchema(),
    car = this.car.toCarSchema(),
    driver = driverDto.toDriverSchema(),
    isRenovation = this.isRenovation,
    insurerRenovation = this.insurerRenovation,
    bonus = this.bonus,
    zipNight = this.zipNight,
    hasRiskPersonLivingWith = this.hasRiskPersonLivingWith,
    hasRiskPersonAsDrive = this.hasRiskPersonAsDrive,
    hasGarage = this.hasGarage,
    carUse = this.carUse,
)