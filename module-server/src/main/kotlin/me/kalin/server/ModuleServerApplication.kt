package me.kalin.server

import me.kalin.core.util.YamlPropertySourceFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.PropertySource

@ComponentScan(
    basePackages = [
        "me.kalin",
        "me.kalin.core"
    ]
)
@PropertySource(value = ["application-core.yaml"], factory = YamlPropertySourceFactory::class)
@SpringBootApplication
class ModuleServerApplication

fun main(args: Array<String>) {
    runApplication<ModuleServerApplication>(*args)
}