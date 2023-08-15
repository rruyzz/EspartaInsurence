package com.espartaInsurence.quote.infrastructure.config.db.schema

import jakarta.persistence.*

@Entity(name = "quote")
data class QuoteSchema(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Int,
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    val car: CarSchema,
    @Column
    val value: String,
)