package com.onestar.onestarapi.model

import javax.persistence.AttributeConverter
import javax.persistence.Converter

@Converter
class ItemListConverter : AttributeConverter<ItemList, MutableList<Long>?> {

    override fun convertToDatabaseColumn(item: ItemList?): MutableList<Long>? {
        TODO("Not yet implemented")
    }

    override fun convertToEntityAttribute(item: MutableList<Long>?): ItemList? {
        TODO("Not yet implemented")
    }
}