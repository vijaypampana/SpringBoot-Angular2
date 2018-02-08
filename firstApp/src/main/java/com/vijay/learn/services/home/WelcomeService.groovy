package com.vijay.learn.services.home

import org.springframework.stereotype.Component


@Component
class WelcomeService {

    String retrieveWelcomeMessage() {
        return "Good Morning!"
    }
}
