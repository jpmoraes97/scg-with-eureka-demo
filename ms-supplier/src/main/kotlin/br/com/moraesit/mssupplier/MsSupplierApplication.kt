package br.com.moraesit.mssupplier

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class MsSupplierApplication

fun main(args: Array<String>) {
    runApplication<MsSupplierApplication>(*args)
}
