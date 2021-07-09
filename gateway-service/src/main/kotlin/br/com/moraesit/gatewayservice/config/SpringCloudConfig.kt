package br.com.moraesit.gatewayservice.config

import org.springframework.cloud.gateway.route.RouteLocator
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SpringCloudConfig {

    @Bean
    fun routes(builder: RouteLocatorBuilder): RouteLocator {
        return builder.routes()
            .route { r ->
                r.path("/products/**")
                    .uri("lb://MS-PRODUCT")
            }

            .route { r ->
                r.path("/suppliers/**")
                    .uri("lb://MS-SUPPLIER")
            }
            .build()
    }
}