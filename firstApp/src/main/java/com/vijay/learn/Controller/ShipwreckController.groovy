package com.vijay.learn.Controller

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1")
class ShipwreckController {

    @RequestMapping(value="shipwrecks", method = RequestMethod.GET)
    List<Shipwreck> list() {
        return ShipwreckStub.list()
    }

    @RequestMapping(value="shipwrecks", method = RequestMethod.POST)
    Shipwreck create(@RequestBody Shipwreck shipwreck) {
        return ShipwreckStub.create(shipwreck)
    }

    @RequestMapping(value="shipwrecks/{id}", method = RequestMethod.GET)
    Shipwreck get(@PathVariable long  id) {
        return ShipwreckStub.get(id)
    }

    @RequestMapping(value="shipwrecks/{id}", method = RequestMethod.PUT)
    Shipwreck update(@PathVariable long  id, @RequestBody Shipwreck shipwreck) {
        return ShipwreckStub.update(id, shipwreck)
    }

    @RequestMapping(value="shipwrecks/{id}", method = RequestMethod.DELETE)
    Shipwreck delete(@PathVariable long  id) {
        return ShipwreckStub.delete(id)
    }


}
