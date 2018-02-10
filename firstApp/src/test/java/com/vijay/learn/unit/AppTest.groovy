package com.vijay.learn.unit

import com.vijay.learn.services.home.WelcomeService
import org.junit.Test
import static org.junit.Assert.*


class AppTest {

    WelcomeService wservice = new WelcomeService()

    @Test
    void testApp() {

        String result = wservice.retrieveWelcomeMessage()
        assertEquals( result, "Good Morning!")

    }
}
