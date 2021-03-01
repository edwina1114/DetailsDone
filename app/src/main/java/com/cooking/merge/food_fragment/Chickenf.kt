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
class Chickenf : Fragment()  {
//    private var recyclerView: RecyclerView? = null
//    lateinit var gridLayoutManager: GridLayoutManager
//    lateinit var foodList: ArrayList<FooditemsModel>
//    lateinit var foodiesAdapters: FooditemsAdapter  //繼承FooditemsAdapter
//
//    ////////////////////////////////////////////////array////////////////////////////////////////////////
//    private val titles = arrayOf(
//        "蔥香味噌雞", "三杯菇菇雞", "安東燉雞", "醬燒雞腿杏鮑菇", "迷迭香黑胡椒馬鈴薯雞", "豉汁彩椒雞球",
//        "洋蔥雞丁", "泰式涼拌柚香雞絲", "豆芽雞絲",  "酥炸雞皮", "啤酒燒雞腿", "蔥燒雞腿", "香滷棒棒腿",
//        "蜜汁雞翅", "蠔油雞翅", "美乃茄醬烤雞翅","咖哩生薑燒雞腿", "咖哩優格烤雞翅", "青檸可樂雞翅腿",
//        "甜辣醬烤雞翅", "咖哩烤雞翅腿", "黑胡椒檸檬醬烤雞翅腿", "起司嫩雞塊", "咖哩美乃滋嫩雞塊",
//        "檸香鹽麴醬烤雞腿排", "嫩煎香料雞胸", "塔香味噌鹽麴烤雞腿排", "紅糟醬烤雞腿排"
//    )
//
//    private val images = arrayOf(
//        R.drawable.ch1, R.drawable.ch21,R.drawable.ch23, R.drawable.ch2, R.drawable.ch3,
//        R.drawable.ch8, R.drawable.ch25, R.drawable.ch24, R.drawable.ch6,R.drawable.ch5,
//        R.drawable.ch4, R.drawable.ch13, R.drawable.ch17, R.drawable.ch9, R.drawable.ch7,
//        R.drawable.ch10, R.drawable.ch11, R.drawable.ch12, R.drawable.ch14, R.drawable.ch22,
//        R.drawable.ch18, R.drawable.ch15, R.drawable.ch19, R.drawable.ch20, R.drawable.ch16,
//        R.drawable.ch26, R.drawable.ch27, R.drawable.ch28
//    )
//
//    private val DetailsSteps = arrayOf(
//        "蔥香味噌雞", "三杯菇菇雞", "安東燉雞", "醬燒雞腿杏鮑菇", "迷迭香黑胡椒馬鈴薯雞", "豉汁彩椒雞球",
//        "洋蔥雞丁", "泰式涼拌柚香雞絲", "豆芽雞絲",  "酥炸雞皮", "啤酒燒雞腿", "蔥燒雞腿", "香滷棒棒腿",
//        "蜜汁雞翅", "蠔油雞翅", "美乃茄醬烤雞翅","咖哩生薑燒雞腿", "咖哩優格烤雞翅", "青檸可樂雞翅腿",
//        "甜辣醬烤雞翅", "咖哩烤雞翅腿", "黑胡椒檸檬醬烤雞翅腿", "起司嫩雞塊", "咖哩美乃滋嫩雞塊",
//        "檸香鹽麴醬烤雞腿排", "嫩煎香料雞胸", "塔香味噌鹽麴烤雞腿排", "紅糟醬烤雞腿排"
//    )
//    ////////////////////////////////////////////////array////////////////////////////////////////////////
//
//    //(第一發生)顯示easy_layout的介面
//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?): View? {
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
//        foodList = ArrayList()
//        foodList = addfood()
//        foodiesAdapters = FooditemsAdapter(requireContext(), this, foodList )   //adapter按照位置擺放foodlist裡的所有物品
//        recyclerView?.adapter = foodiesAdapters
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
