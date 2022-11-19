package com.example.lunchtray.model

import java.text.NumberFormat

/**
 * Data class for menu items
 */
data class MenuItem(
    var name: String,
    var description: String,
    var price: Double,
    var type: Int
) {
    /**
     * Getter method for price.
     * Includes formatting.
     */
    fun getFormattedPrice(): String = NumberFormat.getCurrencyInstance().format(price)
}
