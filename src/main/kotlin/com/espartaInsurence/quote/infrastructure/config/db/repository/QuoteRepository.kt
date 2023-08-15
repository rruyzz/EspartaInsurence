package com.espartaInsurence.quote.infrastructure.config.db.repository

import com.espartaInsurence.quote.infrastructure.config.db.schema.QuoteSchema
import org.springframework.data.repository.CrudRepository


interface QuoteRepository : CrudRepository<QuoteSchema, Int> {

//    fun findByNameContaining(name: String): List<QuoteSchema>

}