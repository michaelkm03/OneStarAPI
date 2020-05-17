package com.onestar.onestarapi.model

data class Item(
        var by : String? = "",
        var descendants: Long? = null,
        var id: Long? = null,
        var score: Long? = null,
        var time: Long? = null,
        var title: String? = "",
        var type: String? = "",
        var url: String? = ""
)
