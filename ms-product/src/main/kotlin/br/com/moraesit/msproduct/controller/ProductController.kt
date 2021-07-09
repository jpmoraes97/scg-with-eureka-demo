package br.com.moraesit.msproduct.controller

import br.com.moraesit.msproduct.model.Product
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.math.BigDecimal

@RestController
@RequestMapping("/products")
class ProductController {

    @GetMapping
    fun findAll(): List<Product> {

        val p1 = Product(1L).apply {
            name = "Smartphone"
            description = "128GB Black"
            price = BigDecimal.valueOf(2400.00)
        }

        val p2 = Product(1L).apply {
            name = "PS5"
            description = "825GB"
            price = BigDecimal.valueOf(5450.05)
        }

        return listOf(p1, p2)
    }
}