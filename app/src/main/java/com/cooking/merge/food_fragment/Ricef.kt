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
class Ricef : Fragment()  {
//    private var recyclerView: RecyclerView? = null
//    lateinit var gridLayoutManager: GridLayoutManager
//    lateinit var foodList: ArrayList<FooditemsModel>
//    lateinit var foodiesAdapters: FooditemsAdapter  //繼承FooditemsAdapter
//
//    ////////////////////////////////////////////////array////////////////////////////////////////////////
//    private val titles = arrayOf(
//        "雞肉親子丼", "豆芽雞肉蓋飯", "雞肉豆腐漢堡排飯", "味噌炊飯", "和風白菜雞蛋丼",
//        "鮭魚五穀米炒飯", "麻油菇菇雞飯", "空心菜梗炒飯", "海鮮泡飯", "豆腐飯", "日式豆腐丼",
//        "泰式排骨湯泡飯", "沙茶豬肉燴飯", "低熱量花椰菜炒飯", "高蛋白便當","雞肉蔬菜健康餐", "香芹皮芋粥"
//    )
//
//    private val images = arrayOf(
//        R.drawable.rice1, R.drawable.rice2, R.drawable.rice3, R.drawable.rice4, R.drawable.rice5,
//        R.drawable.rice6, R.drawable.rice7, R.drawable.rice8, R.drawable.rice9, R.drawable.rice10,
//        R.drawable.rice11, R.drawable.rice12, R.drawable.rice13, R.drawable.rice14, R.drawable.rice15,
//        R.drawable.rice16, R.drawable.rice17
//    )
//
//    private val DetailsSteps = arrayOf(
//        "雞肉親子丼", "豆芽雞肉蓋飯", "雞肉豆腐漢堡排飯", "味噌炊飯", "和風白菜雞蛋丼",
//        "鮭魚五穀米炒飯", "麻油菇菇雞飯", "空心菜梗炒飯", "海鮮泡飯", "豆腐飯", "日式豆腐丼",
//        "泰式排骨湯泡飯", "沙茶豬肉燴飯", "低熱量花椰菜炒飯", "高蛋白便當","雞肉蔬菜健康餐", "香芹皮芋粥"
//    )
//    ////////////////////////////////////////////////array////////////////////////////////////////////////
//
//    //(第一發生)顯示rice_layout的介面
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
