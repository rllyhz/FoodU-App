package id.rllyhz.fooduapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import id.rllyhz.fooduapp.R
import id.rllyhz.fooduapp.data.Food

class FoodAdapter(private val context: Context, private var foods: ArrayList<Food>) :
    RecyclerView.Adapter<FoodAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_food, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = foods.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvFoodTitle = itemView.findViewById<TextView>(R.id.tv_item_food_title)
        val tvFoodOwner = itemView.findViewById<TextView>(R.id.tv_item_food_owner)
        val tvFoodLocation = itemView.findViewById<TextView>(R.id.tv_item_food_location)
        val tvFoodDistance = itemView.findViewById<TextView>(R.id.tv_item_food_distance)
        val tvFoodCost = itemView.findViewById<TextView>(R.id.tv_item_food_cost)
        val rbFoodRating = itemView.findViewById<RatingBar>(R.id.rb_item_food_rating)
        val ivFoodCover = itemView.findViewById<ImageView>(R.id.iv_item_food_cover)
        val btnFoodCta = itemView.findViewById<Button>(R.id.btn_item_food_cta)
    }

    interface OnItemClickCallback {
        fun ctaItemClicked(food: Food)
    }

    private var onItemClickCallback: OnItemClickCallback? = null

    fun setOnItemClickCallback(callback: OnItemClickCallback) {
        onItemClickCallback = callback
    }
}