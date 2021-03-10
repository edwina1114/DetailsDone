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

class Porkf : Fragment(), OnFoodItemClickListener {
    private var recyclerView: RecyclerView? = null
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var foodList: ArrayList<FooditemsModel>
    lateinit var foodiesAdapters: FooditemsAdapter  //繼承FooditemsAdapter

    ////////////////////////////////////////////////array////////////////////////////////////////////////
    private val titles = arrayOf(
        "照燒金針菇漢堡排", "蜂蜜醬燒五花肉", "蜂蜜芥末籽嫩煎豬排", "番茄燉肉", "韓式燒肉",
        "打拋豬", "櫛瓜炒肉末", "肉末蒸豆腐", "金針菇味噌肉燥", "古早味肉燥", "咖哩洋蔥炒肉片",
        "泰式風味炒肉片", "味噌野菜炒肉片", "薑汁豬肉", "泰式拌肉"
    )

    private val images = arrayOf(
        R.drawable.pork13, R.drawable.pork6, R.drawable.pork8, R.drawable.pork11, R.drawable.pork12,
        R.drawable.pork9, R.drawable.pork1, R.drawable.pork2, R.drawable.pork10, R.drawable.pork3,
        R.drawable.pork4, R.drawable.pork5, R.drawable.pork7, R.drawable.pork14, R.drawable.pork15
    )

    private val ingredients = arrayOf(
        "豬絞肉 300克\n" + "金針菇 1包\n" + "蛋 1顆\n" + "葱末 1根\n" + "薑泥 1小塊",
        "五花肉 1條\n" + "蔥 1根\n" + "薑 3片\n" + "米酒 2大匙",
        "全聯豬里肌厚排 2片",
        "豬肉(胛心、梅花、豬腱皆可) 600~800克\n" + "中型洋蔥 1顆\n" + "中型番茄 2顆\n" + "薑末 3片\n" + "蒜末 5瓣",
        "火鍋肉片(牛豬皆可) 200克\n" + "白芝麻(可略) 適量",
        "豬絞肉 300克\n" + "洋蔥 半顆\n" + "蒜末 2瓣\n" + "小番茄 10顆\n" + "九層塔 1把",
        ""

    )

    private val sauses = arrayOf(
        "<調味料> \n" + "醬油 0.5大匙\n" + "麻油 1大匙\n" + "白胡椒粉 適量\n" + "\n<醃料>  \n" + "料理米酒 1大匙\n" + "醬油 1大匙\n" + "味醂 1大匙\n" + "糖 1小匙\n",
        "醬油 1~1.5大匙\n" + "蠔油 1大匙\n" + "蜂蜜 2小匙\n" + "水 50ml\n",
        "<調味料> \n" + "黑胡椒 適量\n" + "玫瑰鹽 適量\n" + "\n<蜂蜜芥末醬> \n" + "顆粒芥末籽醬 2小匙\n" + "醬油 1/2小匙\n" + "蜂蜜 2小匙\n" + "米酒 2大匙\n",
        "米酒 2大匙\n" + "醬油 3大匙\n" + "番茄醬 2大匙\n" + "月桂葉 2片\n" + "水 450~500ml\n" + "糖 適量\n",
        "中型蘋果或水梨 1/4個\n" + "米酒 1大匙\n" + "糖 1小匙\n" + "醬油 1大匙\n" + "麻油 1/2小匙\n" + "蒜泥 1瓣\n",
        "米酒 1大匙\n" + "蠔油 1大匙\n" + "醬油 0.5大匙\n" + "魚露 1/4-1/2小匙\n",
        ""


    )

    private val links = arrayOf(
        "https://icook.tw/recipes/265893", "https://icook.tw/recipes/299276", "https://icook.tw/recipes/297044",
        "https://icook.tw/recipes/278351", "https://icook.tw/recipes/267740",  "https://icook.tw/recipes/290079",
        "https://icook.tw/recipes/259896", "https://icook.tw/recipes/252001", "https://icook.tw/recipes/352634",
        "https://icook.tw/recipes/334362", "https://icook.tw/recipes/322330", "https://icook.tw/recipes/305540",
        "https://icook.tw/recipes/297625", "https://icook.tw/recipes/244672", "https://icook.tw/recipes/242709"
    )
    ////////////////////////////////////////////////array////////////////////////////////////////////////

    //(第一發生)顯示breakfast_layout的介面
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fooditems_layout, container, false)
    }

    //(第二發生)initialize recyclerView and layout manager
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView = view.my_recycler_view

        // design the gridlayout & set recyclerview
        gridLayoutManager = GridLayoutManager(
            requireContext(), 3,
            LinearLayoutManager.VERTICAL, false
        )
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        // design the gridlayout & set recyclerview

        foodList = ArrayList()      //將foodList作為一個arraylist
        foodList = addfood()        //foodList存放圖片及名稱

        foodiesAdapters =
            FooditemsAdapter(requireContext(), this, foodList)   //adapter按照位置擺放foodlist裡的所有物品
        recyclerView?.adapter = foodiesAdapters


    }

    fun addfood(): ArrayList<FooditemsModel> {
        //array的方法 (way1)
        val addlist: ArrayList<FooditemsModel> = ArrayList()
        for (i in titles.indices)
        {
            val model = FooditemsModel(images[i], titles[i], ingredients[i], sauses[i], links[i])
            addlist.add(model)
        }
        return addlist
    }

    override fun onItemClick(item: FooditemsModel, position: Int)
    {
        val intent = Intent(context, FoodDetailsf::class.java)
        intent.putExtra("FOODIMAGE", item.iconsChar.toString())
        intent.putExtra("FOODNAME", item.alphaChar)
        intent.putExtra("FOODINGREDIENT", item.ingredient)
        intent.putExtra("FOODSAUCE", item.sauce)
        intent.putExtra("FOODLINK", item.link)

        startActivity(intent)
    }

}

