package com.semihunaldi.kotlin.springbootkotlintest.config.properties

import lombok.Data
import org.springframework.boot.context.properties.ConfigurationProperties

@Data
@ConfigurationProperties(prefix = "app.properties")
class AppProperties
{
    var machineHasAccessScriptFullPath : String? = null
    var testProperty : String? = null
    var environment : String? = null
}
