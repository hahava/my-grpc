package me.kalin.client

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ModuleClientApplication

fun main(args: Array<String>) {
    runApplication<ModuleClientApplication>(*args)
}
