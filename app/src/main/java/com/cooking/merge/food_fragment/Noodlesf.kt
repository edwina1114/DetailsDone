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

class Noodlesf : Fragment(), OnFoodItemClickListener  {
    private var recyclerView: RecyclerView? = null
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var foodList: ArrayList<FooditemsModel>
    lateinit var foodiesAdapters: FooditemsAdapter  //繼承FooditemsAdapter

    ////////////////////////////////////////////////array////////////////////////////////////////////////
    private val titles = arrayOf(
        "日式烏龍麵佐洋蔥燉雞", "XO醬炒泡麵", "酸辣泰式打拋豬拌炒泡麵",
        "絲瓜蛋麵線", "媽媽私房炒米粉", "肉絲炒麵", "雞絲燜米粉", "培根蛋奶義大利麵", "番茄雞蛋麵",
        "中日海陸烏龍乾麵", "家常肉末蛋米線", "冬日雨季小資男暖心湯麵", "越式涼拌米粉", "肉末冬粉"
    )

    private val images = arrayOf(
        R.drawable.noodles2, R.drawable.noodles3, R.drawable.noodles4, R.drawable.noodles5,
        R.drawable.noodles6, R.drawable.noodles7, R.drawable.noodles8, R.drawable.noodles9, R.drawable.noodles10,
        R.drawable.noodles11, R.drawable.noodles12, R.drawable.noodles13, R.drawable.noodles14, R.drawable.noodles15
    )

    private val ingredients = arrayOf(
        "洋蔥 1/2切片\n" + "昆布 2條(或海帶芽一碗) \n" + "柴魚粉 1.5匙(或柴魚片一碗)\n" + "烏龍麵 1包\n" + "雞胸 1片\n",
        "泡麵 2包\n" + "蝦仁 6隻\n" + "洋蔥 1/4顆\n" + "韭黃 30克\n" + "雞蛋 1顆\n" + "豆芽菜 30克\n" + "蔥 30克",
        "豬絞肉 150g\n" + "蒜仁(去膜切片) 1瓣\n" + "紅辣椒(去蒂頭切段) 1根\n" + "小蕃茄(切半) 5顆\n" + "九層塔 1手把\n" + "泡麵(事先泡軟) 1片\n" + "雞蛋(不要打散) 1顆",
        "絲瓜 1條\n" + "蝦米 6~8隻\n" + "蔥 3根\n" + "白麵線 2束\n" + "蛋 2顆",
        "米粉 150g\n" + "蝦米 30g\n" + "香菇 6朵\n" + "高麗菜 1/8顆",
        "油麵 1200g\n" + "豬肉絲 150g\n" + "紅蘿蔔 60g\n" + "青蔥 1根\n" + "高麗菜 250g\n" + "洋蔥 100g\n" + "水 450c.c",
        "米粉 100g\n" + "鹽烤雞胸肉 適量\n" + "乾香菇/蝦米 適量\n" + "高麗菜 適量\n" + "紅蘿蔔 適量\n" + "生辣椒 少許",
        "培根 2片\n" + "蛋 2顆\n" + "鮮奶油 3大匙\n" + "義大利麵 1/4包", "牛番茄 1顆\n" + "蛋 2顆\n" + "蒜頭 1瓣\n" + "青蔥 1根\n" + "拉麵 約115g",
        "烏龍麵 依個人食量\n" + "鮮蝦 4~5隻\n" + "豬肉肉片 約3~5片\n" + "青菜 少許",
        "越南澱粉條(細) 80克\n" + "紅蘿蔔 1小塊\n" + "黑木耳 1片\n" + "鴻喜菇 半包\n" + "貢丸 兩顆\n" + "青菜 1株\n" + "雞高湯 500ml\n" + "雞蛋 1顆 ",
        "烏龍麵 依個人食量\n" + "紅蘿蔔 1/2根\n" + "地瓜 1/3顆\n" + "牛肉 150g\n" + "白蘿蔔 1/4根\n" + "芹菜(去腥味用) 些許",
        "越南澱粉條(細) 160克\n" + "紅蘿蔔 1/3條\n" + "小黃瓜 1條\n" + "去皮花生 2大匙\n" + "***雞腿排與肉片擇一即可***\n" + "去骨雞腿排 2片\n" +
        "牛/豬肉片 200克", "豬絞肉 150g\n" + "冬粉 3把\n" + "青蔥 2根\n" + "香菜(可有可無) 適量\n" + "蒜頭 2瓣\n" + "辣椒 0.5~1條"
    )

    private val sauses = arrayOf(
        "日式醬油 4湯匙\n\n", "白胡椒粉 適量\n" + "蠔油 5克 \n" + "糖 2克\n" + "香油 5克\n" + "鹽 2克\n" + "太白粉 2克\n" + "XO醬 15克\n" +
        "水 100克\n" + "醬油 5克\n\n","魚露 1茶匙\n" + "細砂糖 1茶匙\n" + "檸檬汁 1匙\n" + "醬油 1大匙\n" + "蠔油 1匙\n" + "高湯 2大匙\n\n",
        "鹽巴 適量", "醬油膏 3大匙\n" + "黑胡椒粉 適量", "<調味料> \n" + "醬油 3.5大匙\n" + "烏醋 3大匙\n" + "糖 2/3茶匙\n" + "白胡椒粉 少許\n" +
        "鹽 適量"+"<醃料> \n" + "醬油 1/2茶匙\n" + "白胡椒粉 少許\n" + "太白粉 1/2茶匙\n" + "米酒 1茶匙\n\n",
        "油蔥酥 少許\n" + "白芝麻油 少許\n" + "白胡椒粉 少許\n" + "水/高湯 180c.c\n", "粗黑胡椒粉 少許\n" + "鹽 少許\n" + "起司粉 適量\n\n",
        "白胡椒粉 1/16茶匙\n" + "鹽 1/4茶匙\n" + "醬油 2/3大匙\n" + "香油 1茶匙\n" + "番茄醬 1.5大匙\n" + "糖 1/3茶匙\n\n",
        "老干媽 1匙\n" + "冰塊 約一把\n\n","白醋 1小匙 \n" + "鹽 適量\n" + "胡椒 適量\n\n", "鹽巴 適量\n\n",
        "<醃料>\n" + "糖 3大匙\n" + "紅辣椒碎 適量\n" + "新鮮檸檬汁 1顆\n" + "魚露 1.5大匙\n" + "開水 60ml\n\n",
        "醬油 1大匙\n" + "素蠔油/醬油膏 1大匙\n" + "糖 1/4茶匙\n" + "胡椒粉 適量\n" + "水 3米杯"
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

        foodiesAdapters = FooditemsAdapter(requireContext(), this, foodList )   //adapter按照位置擺放foodlist裡的所有物品
        recyclerView?.adapter = foodiesAdapters
    }

    fun addfood(): ArrayList<FooditemsModel> {
        //array的方法 (way1)
        val addlist: ArrayList<FooditemsModel> = ArrayList()
        for (i in titles.indices)
        {
            val model = FooditemsModel(images[i], titles[i], ingredients[i], sauses[i])
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

        startActivity(intent)
    }

}
