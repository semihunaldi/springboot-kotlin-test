package com.semihunaldi.kotlin.springbootkotlintest.config

import com.semihunaldi.kotlin.springbootkotlintest.config.properties.AppProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean

@Configuration
@EnableConfigurationProperties(AppProperties::class)
class AppConfig {
    @Bean
    fun sessionFactory(): HibernateJpaSessionFactoryBean {
        return HibernateJpaSessionFactoryBean()
    }
}
