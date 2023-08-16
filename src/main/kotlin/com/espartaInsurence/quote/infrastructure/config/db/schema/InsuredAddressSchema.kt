package com.espartaInsurence.quote.infrastructure.config.db.schema

import com.espartaInsurence.quote.entity.model.InsuredAddress
import jakarta.persistence.*

@Entity(name = "insuredAddress")
data class InsuredAddressSchema(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int? = null,
    @Column
    val zip: String,
    @Column
    val street: String,
    @Column
    val neighborhood: String,
    @Column
    val number: String,
    @Column
    val complement: String,
)


fun InsuredAddressSchema.toInsuredAddress() = InsuredAddress(
    id = this.id,
    zip = this.zip,
    street = this.street,
    neighborhood = this.neighborhood,
    number = this.number,
    complement = this.complement,
)