package com.onestar.onestarapi.repository

import com.onestar.onestarapi.model.Clothing_Shoes_And_Jewelry
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ItemRepository : JpaRepository<Clothing_Shoes_And_Jewelry, Long>