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
class Sidedishf : Fragment()  {
//    private var recyclerView: RecyclerView? = null
//    lateinit var gridLayoutManager: GridLayoutManager
//    lateinit var foodList: ArrayList<FooditemsModel>
//    lateinit var foodiesAdapters: FooditemsAdapter  //繼承FooditemsAdapter
//
//    ////////////////////////////////////////////////array////////////////////////////////////////////////
//    private val titles = arrayOf(
//        "麻婆豆腐", "醬燒嫩豆腐", "日式滑蛋豆腐", "可樂肉醬", "德式香腸炒洋芋佐芥末籽醬", "醬燒南瓜",
//        "香料鹽洋芋", "馬鈴薯鮪魚煎餅", "蔬菜煎餅", "金針菇煎餅", "月見蔥爆豆芽菜蛋餅", "蔥油餅", "金沙春筍",
//        "螞蟻上樹", "豆干肉絲", "紅燒豆干", "蔥蒜香炒豆皮", "醬燒豬肉豆皮捲", "肉末蒸蛋", "茄汁馬鈴薯",
//        "奶油香煎馬鈴薯", "古早味碰皮白滷",  "黑胡椒炒豆芽", "韓式雜菜", "咖哩炒三色", "醬油金針煮", "肉絲筍片",
//        "櫻花蝦炒蘿蔔絲", "日式涼拌小黃瓜豆腐", "涼拌豆皮蔬菜", "涼拌干絲", "涼拌黑木耳", "涼拌菇菇醬"
//    )
//
//    private val images = arrayOf(
//        R.drawable.sidedish1, R.drawable.sidedish8, R.drawable.sidedish27, R.drawable.sidedish2,
//        R.drawable.sidedish7, R.drawable.sidedish10, R.drawable.sidedish11,  R.drawable.sidedish22,
//        R.drawable.sidedish23, R.drawable.sidedish24, R.drawable.sidedish25,  R.drawable.sidedish12,
//        R.drawable.sidedish13,  R.drawable.sidedish16, R.drawable.sidedish17, R.drawable.sidedish18,
//        R.drawable.sidedish15,  R.drawable.sidedish19, R.drawable.sidedish20, R.drawable.sidedish14,
//        R.drawable.sidedish29, R.drawable.sidedish31, R.drawable.sidedish32, R.drawable.sidedish33,
//        R.drawable.sidedish26, R.drawable.sidedish21, R.drawable.sidedish3, R.drawable.sidedish5,
//        R.drawable.sidedish28, R.drawable.sidedish30, R.drawable.sidedish6, R.drawable.sidedish9, R.drawable.sidedish4
//    )
//
//    private val DetailsSteps = arrayOf(
//        "麻婆豆腐", "醬燒嫩豆腐", "日式滑蛋豆腐", "可樂肉醬", "德式香腸炒洋芋佐芥末籽醬", "醬燒南瓜",
//        "香料鹽洋芋", "馬鈴薯鮪魚煎餅", "蔬菜煎餅", "金針菇煎餅", "月見蔥爆豆芽菜蛋餅", "蔥油餅", "金沙春筍",
//        "螞蟻上樹", "豆干肉絲", "紅燒豆干", "蔥蒜香炒豆皮", "醬燒豬肉豆皮捲", "肉末蒸蛋", "茄汁馬鈴薯",
//        "奶油香煎馬鈴薯", "古早味碰皮白滷",  "黑胡椒炒豆芽", "韓式雜菜", "咖哩炒三色", "醬油金針煮", "肉絲筍片",
//        "櫻花蝦炒蘿蔔絲", "日式涼拌小黃瓜豆腐", "涼拌豆皮蔬菜", "涼拌干絲", "涼拌黑木耳", "涼拌菇菇醬"
//    )
//    ////////////////////////////////////////////////array////////////////////////////////////////////////
//
//    //(第一發生)顯示sidedish_layout的介面
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fooditems_layout, container, false)
//    }
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
