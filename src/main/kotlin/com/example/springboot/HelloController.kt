package com.example.springboot

import jakarta.annotation.PostConstruct
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class HelloController {

    @Value("\${hello.greetings:-}")
    lateinit var helloGreetings: String

    @Value("\${hello.c:-}")
    lateinit var helloC: String

    @PostConstruct
    fun init() {
        println("Hello World!")
        println(helloGreetings)
        println(helloC)
        println("Bye...")
    }
}
