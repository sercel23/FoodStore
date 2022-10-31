package com.serapercel.foodstore.data.repo

import com.serapercel.foodstore.data.datasource.FoodDatasource
import com.serapercel.foodstore.data.entity.Food
import com.serapercel.foodstore.data.entity.User

class FoodRepository {
    var fds = FoodDatasource()
    suspend fun addCartList(user: User, yemek_siparis_adet: Int, food: Food) =
        fds.addCartList(user, yemek_siparis_adet, food)
}