package com.onestar.onestarapi.repository

import com.onestar.onestarapi.model.MasterJson
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ItemRepository : JpaRepository<MasterJson, Long>