package com.onestar.onestarapi.model

import com.onestar.onestarapi.model.ItemList
import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
data class MasterJson (
        @GeneratedValue(strategy = GenerationType.IDENTITY) @Id @NotBlank @Column(name = "id") var id : Long = 0,
        @NotBlank @Column(name = "askstories") var list : String?
        /*
        @NotBlank @Column(name = "beststories") var beststories : String,
        @NotBlank @Column(name = "item") var item : String?,
        @NotBlank @Column(name = "topstories") var topstories : String,
        @NotBlank @Column(name = "newstories") var newstories : String

         */

)