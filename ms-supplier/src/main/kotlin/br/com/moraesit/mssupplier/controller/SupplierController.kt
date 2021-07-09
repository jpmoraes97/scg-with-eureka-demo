package br.com.moraesit.mssupplier.controller

import br.com.moraesit.mssupplier.model.Supplier
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/suppliers")
class SupplierController {

    @GetMapping
    fun findAll(): List<Supplier> {
        val sup1 = Supplier(1L).apply { name = "Samsung" }
        val sup2 = Supplier(2L).apply { name = "Sony" }
        return listOf(sup1, sup2)
    }
}