package br.com.moraesit.msproduct

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class MsProductApplication

fun main(args: Array<String>) {
    runApplication<MsProductApplication>(*args)
}
