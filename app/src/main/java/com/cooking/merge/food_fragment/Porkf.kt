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
// , OnFoodItemClickListener
class Porkf : Fragment(){
//    private var recyclerView: RecyclerView? = null
//    lateinit var gridLayoutManager: GridLayoutManager
//    lateinit var foodList: ArrayList<FooditemsModel>
//    lateinit var foodiesAdapters: FooditemsAdapter  //繼承FooditemsAdapter
//
//    ////////////////////////////////////////////////array////////////////////////////////////////////////
//    private val titles = arrayOf(
//        "照燒金針菇漢堡排", "蜂蜜醬燒五花肉", "蜂蜜芥末籽嫩煎豬排", "番茄燉肉", "韓式燒肉",
//        "打拋豬", "櫛瓜炒肉末", "肉末蒸豆腐", "金針菇味噌肉燥", "古早味肉燥", "咖哩洋蔥炒肉片",
//        "泰式風味炒肉片", "味噌野菜炒肉片", "薑汁豬肉","泰式拌肉"
//    )
//
//    private val images = arrayOf(
//        R.drawable.pork13, R.drawable.pork6, R.drawable.pork8, R.drawable.pork11, R.drawable.pork12,
//        R.drawable.pork9, R.drawable.pork1, R.drawable.pork2, R.drawable.pork10, R.drawable.pork3,
//        R.drawable.pork4, R.drawable.pork5, R.drawable.pork7, R.drawable.pork14, R.drawable.pork15
//    )
//
//    private val DetailsSteps = arrayOf(
//        "照燒金針菇漢堡排", "蜂蜜醬燒五花肉", "蜂蜜芥末籽嫩煎豬排", "番茄燉肉", "韓式燒肉",
//        "打拋豬", "櫛瓜炒肉末", "肉末蒸豆腐", "金針菇味噌肉燥", "古早味肉燥", "咖哩洋蔥炒肉片",
//        "泰式風味炒肉片", "味噌野菜炒肉片", "薑汁豬肉","泰式拌肉"
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
//
//
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