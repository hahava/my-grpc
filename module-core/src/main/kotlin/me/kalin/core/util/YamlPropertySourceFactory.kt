package me.kalin.core.util

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean
import org.springframework.core.env.PropertiesPropertySource
import org.springframework.core.env.PropertySource
import org.springframework.core.io.support.EncodedResource
import org.springframework.core.io.support.PropertySourceFactory
import java.util.*

/*
* properties 가 아닌 yaml을 인식하기 위함
* */
class YamlPropertySourceFactory : PropertySourceFactory {
    override fun createPropertySource(
        name: String?,
        resource: EncodedResource
    ): PropertySource<*> {
        val yamlProperties: Properties = loadYamlProperties(resource)
        val sourceName = resource.resource.filename!!

        return PropertiesPropertySource(sourceName, yamlProperties)
    }

    private fun loadYamlProperties(resource: EncodedResource) =
        YamlPropertiesFactoryBean()
            .apply { setResources(resource.resource) }
            .`object`!!
}