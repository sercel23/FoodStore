package com.serapercel.foodstore.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.serapercel.foodstore.data.repo.FoodRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CartViewModel : ViewModel() {
    var frepo = FoodRepository()

    fun removeFood(sepet_yemek_id: Int, kullanici_adi: String) {
        CoroutineScope(Dispatchers.Main).launch {
            frepo.removeFood(sepet_yemek_id, kullanici_adi)
        }
    }

    fun removeCount(sepet_yemek_id: Int, kullanici_adi: String) {
        CoroutineScope(Dispatchers.Main).launch {
            frepo.removeCount(sepet_yemek_id, kullanici_adi)

        }
    }

    fun addCount(sepet_yemek_id: Int, kullanici_adi: String) {
        CoroutineScope(Dispatchers.Main).launch {
            frepo.addCount(sepet_yemek_id, kullanici_adi)
        }
    }
}