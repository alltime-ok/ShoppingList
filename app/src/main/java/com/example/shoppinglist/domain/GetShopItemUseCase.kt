package com.example.shoppinglist.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {
    fun getShopItem(shoItemId: Int): ShopItem{
       return shopListRepository.getShopItem(shoItemId)
    }
}