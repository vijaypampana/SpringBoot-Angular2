package com.vijay.learn.Controller.Home

import com.vijay.learn.services.home.WelcomeService
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@Slf4j
class WelcomeController {

    @Autowired
    private WelcomeService wservice


    @RequestMapping(method = RequestMethod.GET,value = '/welcomenew')
    String welcomeMessage() {
        log.trace("Calling /welcomenew GET")
        return wservice.retrieveWelcomeMessage()
    }

    @RequestMapping(method = RequestMethod.GET,value = '/')
    String HomeMessage() {
        log.trace("Calling /welcomenew GET")
        return wservice.retrieveWelcomeMessage()
    }
}