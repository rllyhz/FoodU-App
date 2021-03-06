package id.rllyhz.fooduapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatDelegate
import androidx.recyclerview.widget.GridLayoutManager
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
        rvFoodList = findViewById(R.id.rv_food_list)
        foodAdapter = FoodAdapter(this, DataHelper.foodList)

        rvFoodList.layoutManager = GridLayoutManager(this, 1)
        rvFoodList.adapter = foodAdapter
    }

    override fun ctaItemClicked(food: Food) {
        //
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        MenuInflater(this).inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_item_about_me -> {
                startActivity(Intent(this@MainActivity, AboutActivity::class.java))
            }
        }

        return super.onOptionsItemSelected(item)
    }
}