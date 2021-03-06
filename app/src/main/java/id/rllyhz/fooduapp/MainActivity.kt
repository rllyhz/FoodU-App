package id.rllyhz.fooduapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.RecyclerView
import id.rllyhz.fooduapp.adapter.FoodAdapter
import id.rllyhz.fooduapp.data.Food
import id.rllyhz.fooduapp.helper.DataHelper

class MainActivity : AppCompatActivity(), FoodAdapter.OnItemClickCallback {
    private lateinit var rvFoodList: RecyclerView
    private lateinit var foodAdapter: FoodAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_FoodUApp)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        setContentView(R.layout.activity_main)

        initUI()
    }

    private fun initUI() {
        // rvFoodList = findViewById(R.id.rv_food_list)
        // foodAdapter = FoodAdapter(this, DataHelper.foodList)
    }

    override fun ctaItemClicked(food: Food) {
        //
    }
}