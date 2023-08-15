package com.espartaInsurence.quote.infrastructure.config.db.schema

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity(name = "car")
data class CarSchema (
    @Column
    val brand: String,
    @Column
    val model: String,
    @Id
    val chassi: String,
)