package com.espartaInsurence.quote.infrastructure.config.db.schema

import com.espartaInsurence.quote.entity.model.InsuredData
import jakarta.persistence.*

@Entity(name = "insuredData")
data class InsuredDataSchema(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null,
    @Column
    val insuredName: String,
    @Column
    val document: String,
    @Column
    val email: String,
    @Column
    val phone: String,
    @Column
    val dataOfBirth: String,
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    val insuredAddress: InsuredAddressSchema
)

fun InsuredDataSchema.toInsuredData() = InsuredData(
    insuredName = this.insuredName,
    document = this.document,
    email = this.email,
    phone = this.phone,
    dataOfBirth = this.dataOfBirth,
    insuredAddress = this.insuredAddress.toInsuredAddress(),
)