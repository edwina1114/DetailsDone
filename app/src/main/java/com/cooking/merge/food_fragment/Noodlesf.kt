package com.cooking.merge.food_fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.cooking.merge.R
import com.cooking.merge.adapters.FooditemsAdapter
import com.cooking.merge.adapters.OnFoodItemClickListener
import com.cooking.merge.model.FooditemsModel
import kotlinx.android.synthetic.main.fooditems_layout.view.*
//, OnFoodItemClickListener
class Noodlesf : Fragment()  {
//    private var recyclerView: RecyclerView? = null
//    lateinit var gridLayoutManager: GridLayoutManager
//    lateinit var foodList: ArrayList<FooditemsModel>
//    lateinit var foodiesAdapters: FooditemsAdapter  //繼承FooditemsAdapter
//
//    ////////////////////////////////////////////////array////////////////////////////////////////////////
//    private val titles = arrayOf(
//        "日式豬肉炒麵", "日式烏龍麵佐洋蔥燉雞", "XO醬炒泡麵", "酸辣泰式打拋豬拌炒泡麵",
//        "絲瓜蛋麵線", "媽媽私房炒米粉", "肉絲炒麵", "雞絲燜米粉", "培根蛋奶義大利麵", "番茄雞蛋麵",
//        "中日海陸烏龍乾麵", "家常肉末蛋米線", "冬日雨季小資男暖心湯麵", "越式涼拌米粉", "肉末冬粉"
//    )
//
//    private val images = arrayOf(
//        R.drawable.noodles1, R.drawable.noodles2, R.drawable.noodles3, R.drawable.noodles4, R.drawable.noodles5,
//        R.drawable.noodles6, R.drawable.noodles7, R.drawable.noodles8, R.drawable.noodles9, R.drawable.noodles10,
//        R.drawable.noodles11, R.drawable.noodles12, R.drawable.noodles13, R.drawable.noodles14, R.drawable.noodles15
//    )
//
//    private val DetailsSteps = arrayOf(
//        "日式豬肉炒麵", "日式烏龍麵佐洋蔥燉雞", "XO醬炒泡麵", "酸辣泰式打拋豬拌炒泡麵",
//        "絲瓜蛋麵線", "媽媽私房炒米粉", "肉絲炒麵", "雞絲燜米粉", "培根蛋奶義大利麵", "番茄雞蛋麵",
//        "中日海陸烏龍乾麵", "家常肉末蛋米線", "冬日雨季小資男暖心湯麵", "越式涼拌米粉", "肉末冬粉"
//    )
//    ////////////////////////////////////////////////array////////////////////////////////////////////////
//
//    //(第一發生)顯示breakfast_layout的介面
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fooditems_layout, container, false)
//    }
//
//    //(第二發生)initialize recyclerView and layout manager
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        recyclerView = view.my_recycler_view
//
//        // design the gridlayout & set recyclerview
//        gridLayoutManager = GridLayoutManager(
//            requireContext(), 3,
//            LinearLayoutManager.VERTICAL, false
//        )
//        recyclerView?.layoutManager = gridLayoutManager
//        recyclerView?.setHasFixedSize(true)
//        // design the gridlayout & set recyclerview
//
//        foodList = ArrayList()      //將foodList作為一個arraylist
//        foodList = addfood()        //foodList存放圖片及名稱
//
//        foodiesAdapters = FooditemsAdapter(requireContext(), this, foodList )   //adapter按照位置擺放foodlist裡的所有物品
//        recyclerView?.adapter = foodiesAdapters
//    }
//
//    fun addfood(): ArrayList<FooditemsModel> {
//        val addlist: ArrayList<FooditemsModel> = ArrayList()
//        for (i in titles.indices) {
//            val model = FooditemsModel(images[i], titles[i],DetailsSteps[i])
//            addlist.add(model)
//        }
//        return addlist
//    }
//
//
//    override fun onItemClick(item: FooditemsModel, position: Int)
//    {
//        val intent = Intent(context, BreakfastDetailsf::class.java)
//        intent.putExtra("FOODIMAGE", item.iconsChar.toString())
//        intent.putExtra("FOODNAME", item.alphaChar)
//        intent.putExtra("FOODSTEP", item.detailsstep)
//
//        startActivity(intent)
//    }

}
