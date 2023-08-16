package com.espartaInsurence.quote.infrastructure.config.db.schema

import com.espartaInsurence.quote.entity.model.QuoteDto
import jakarta.persistence.*

@Entity(name = "quoteData")
data class QuoteSchema(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null,
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    val insuredData: InsuredDataSchema,
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    val car: CarSchema,
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    val driver: DriverSchema,
    @Column
    val isRenovation: Boolean,
    @Column
    val insurerRenovation: String,
    @Column
    val bonus: Int,
    @Column
    val zipNight: String,
    @Column
    val hasRiskPersonLivingWith: Boolean,
    @Column
    val hasRiskPersonAsDrive: Boolean,
    @Column
    val hasGarage: Boolean,
    @Column
    val carUse: Int,
)

fun QuoteSchema.toQuote() = QuoteDto(
    id = this.id,
    insuredDataDto = this.insuredData.toInsuredData(),
    car = this.car.toCar(),
    driverDto = driver.toDriver(),
    isRenovation = this.isRenovation,
    insurerRenovation = this.insurerRenovation,
    bonus = this.bonus,
    zipNight = this.zipNight,
    hasRiskPersonLivingWith = this.hasRiskPersonLivingWith,
    hasRiskPersonAsDrive = this.hasRiskPersonAsDrive,
    hasGarage = this.hasGarage,
    carUse = this.carUse,
)