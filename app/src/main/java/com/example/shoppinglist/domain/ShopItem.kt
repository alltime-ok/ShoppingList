package com.example.shoppinglist.domain

//Этот класс является основной нашей бизнес логики
data class ShopItem(
    val id: Int,
    val name: String,
    val count: Int,
    val enabled: Boolean,
)
