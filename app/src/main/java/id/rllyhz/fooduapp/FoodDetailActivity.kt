package id.rllyhz.fooduapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FoodDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        initUI()
    }

    private fun initUI() {
        TODO("Not yet implemented")
    }
}