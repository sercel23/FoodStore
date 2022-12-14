package com.serapercel.foodstore.data.repo

import com.serapercel.foodstore.data.datasource.FoodDatasource
import com.serapercel.foodstore.data.entity.CartFood
import com.serapercel.foodstore.data.entity.Food
import com.serapercel.foodstore.data.entity.User

class FoodRepository(var fds: FoodDatasource) {

    suspend fun addCartList(user: User, yemek_siparis_adet: Int, food: Food) =
        fds.addCartList(user, yemek_siparis_adet, food)

    suspend fun removeFood(sepet_yemek_id: Int, kullanici_adi: String) =
        fds.removeFood(sepet_yemek_id, kullanici_adi)

    suspend fun getFoods(): List<Food> = fds.getFoods()

    suspend fun getCartFoods(kullanici_adi: String): List<CartFood> =
        fds.getCartFoods(kullanici_adi)

    suspend fun updateCartFood(user: User, yemek_siparis_adet: Int, cartFood: CartFood) =
        fds.updateCartFood(user, yemek_siparis_adet, cartFood)

}
