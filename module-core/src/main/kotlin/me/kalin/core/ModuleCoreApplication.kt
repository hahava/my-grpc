package me.kalin.core

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@EnableJpaRepositories(basePackages = ["me.kalin.core.repository"])
@EntityScan(basePackages = ["me.kalin.core.entity"])
@SpringBootApplication
class ModuleCoreApplication