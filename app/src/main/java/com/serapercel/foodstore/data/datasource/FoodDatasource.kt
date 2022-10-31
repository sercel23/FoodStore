package com.serapercel.foodstore.data.datasource

import android.util.Log
import com.serapercel.foodstore.data.entity.Food
import com.serapercel.foodstore.data.entity.User

class FoodDatasource {

    suspend fun addCartList(user: User, yemek_siparis_adet: Int, food: Food){
        Log.e("yemek", " sepete yemek ekle $yemek_siparis_adet ${food.yemek_adi} ${user.user_name}")
    }
}