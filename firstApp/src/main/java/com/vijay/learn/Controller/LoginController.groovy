package com.vijay.learn.Controller

import com.vijay.learn.Repository.UserRepository
import com.vijay.learn.common.model.User
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController


@RestController
@Slf4j
class LoginController {

    private UserRepository userRepository

    @Autowired
    LoginController(UserRepository userRepository) {
        this.userRepository = userRepository
    }

    @RequestMapping(value="", method=RequestMethod.GET)
    List<User> getAllUsers() {
        return userRepository.getAll()
    }

}
