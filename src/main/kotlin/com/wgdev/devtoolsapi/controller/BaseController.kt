package com.wgdev.devtoolsapi.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class BaseController {

    @GetMapping("/dummies")
    fun getDummy(): String {
        return "Hello, It is the developer tools api services"
    }
}