package fikri.kotlinrestfulapi.controller

import fikri.kotlinrestfulapi.entity.Dummy
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/")
    fun index(@RequestParam("name") name: String) = "Hello $name!"

    @GetMapping("/list")
    fun index() = listOf(
            Dummy("1", "Munawir"),
            Dummy("2", "Fikri"),
            Dummy("3", "Al-akbari"),
    )
}


