package me.kalin.server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ModuleServerApplication

fun main(args: Array<String>) {
    runApplication<ModuleServerApplication>(*args)
}
