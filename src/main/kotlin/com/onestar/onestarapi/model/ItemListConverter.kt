package com.onestar.onestarapi.model

import javax.persistence.AttributeConverter
import javax.persistence.Converter

@Converter
class ItemListConverter : AttributeConverter<ItemList, List<Long>?> {

    override fun convertToDatabaseColumn(item: ItemList?): List<Long>? {
        if (item == null) {
            return null;
        }

        return item.list?.removeSurrounding("[", "]")?.split(",")?.map { it.toLong() }
    }

    override fun convertToEntityAttribute(p0: List<Long>?): ItemList? {
        TODO("Not yet implemented")
    }
}