package com.rosprom.truckapi

import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "trucks", path = "trucks")
interface TruckRepository: PagingAndSortingRepository<Truck, Long> {
    fun findByName(@Param("name") name: String): List<Truck>
}