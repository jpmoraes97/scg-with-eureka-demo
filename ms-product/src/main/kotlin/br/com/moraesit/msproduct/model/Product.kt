package br.com.moraesit.msproduct.model

import java.math.BigDecimal

data class Product(
    val id: Long? = null
) {
    var name: String? = null
    var description: String? = null
    var price: BigDecimal? = null
}