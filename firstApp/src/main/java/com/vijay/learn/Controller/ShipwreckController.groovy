package com.vijay.learn.Controller

import com.vijay.learn.Repository.ShipWreckRepository
import org.springframework.beans.BeanUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1")
class ShipwreckController {

    @Autowired
    private ShipWreckRepository shipWreckRepository

    @RequestMapping(value="shipwrecks", method = RequestMethod.GET)
    List<Shipwreck> list() {
        return shipWreckRepository.findAll()
    }

    @RequestMapping(value="shipwrecks", method = RequestMethod.POST)
    Shipwreck create(@RequestBody Shipwreck shipwreck) {
        return shipWreckRepository.saveAndFlush(shipwreck)
    }

    @RequestMapping(value="shipwrecks/{id}", method = RequestMethod.GET)
    Shipwreck get(@PathVariable long  id) {
        return shipWreckRepository.findOne(id)
    }

    @RequestMapping(value="shipwrecks/{id}", method = RequestMethod.PUT)
    Shipwreck update(@PathVariable long  id, @RequestBody Shipwreck shipwreck) {
        Shipwreck existingShipwreck = shipWreckRepository.findOne(id)
        BeanUtils.copyProperties(shipwreck, existingShipwreck)
        return shipWreckRepository.saveAndFlush(existingShipwreck)
    }

    @RequestMapping(value="shipwrecks/{id}", method = RequestMethod.DELETE)
    Shipwreck delete(@PathVariable long  id) {
        Shipwreck existingShipwreck = shipWreckRepository.findOne(id)
        shipWreckRepository.delete(existingShipwreck)
        return existingShipwreck
    }


}
