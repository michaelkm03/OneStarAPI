package com.onestar.onestarapi.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.validation.constraints.NotBlank

@Entity
data class Clothing_Shoes_And_Jewelry (
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long = 0,

        @get: NotBlank
        val overall: String = "",

        @get: NotBlank
        val verified: String = "",

        @get: NotBlank
        val reviewtime: String = "",

        @get: NotBlank
        val asin: String = "",
        @get: NotBlank
        val style_size: String = "",

        @get: NotBlank
        val style_color: String = "",

        @get: NotBlank
        val style: String = "",

        @get: NotBlank
        val reviewername: String = "",

        @get: NotBlank
        val reviewtext: String = "",

        @get: NotBlank
        val summary: String = "",

        @get: NotBlank
        val unixreviewtime: String = "",

        @get: NotBlank
        val vote: String = "",

        @get: NotBlank
        val image: String = ""
)