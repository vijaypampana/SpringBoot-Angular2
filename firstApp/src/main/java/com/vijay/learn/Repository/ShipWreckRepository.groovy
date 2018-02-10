package com.vijay.learn.Repository

import com.vijay.learn.Controller.Shipwreck
import org.springframework.data.jpa.repository.JpaRepository

interface ShipWreckRepository extends JpaRepository<Shipwreck, Long> {

}