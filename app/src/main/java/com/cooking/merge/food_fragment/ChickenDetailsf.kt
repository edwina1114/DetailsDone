package com.cooking.merge.food_fragment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cooking.merge.R
import kotlinx.android.synthetic.main.fooditems_details.*

class ChickenDetailsf : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fooditems_details)

        //////set data//////
        IV_detailsimage.setImageResource(getIntent().getStringExtra("FOODIMAGE")?.toInt()!!)
        TV_detailsname.text = getIntent().getStringExtra("FOODNAME")
        TV_food_need.text = getIntent().getStringExtra("FOODINGREDIENT")
        TV_sauce.text = getIntent().getStringExtra("FOODSAUCE")
        //////set data//////
    }


}