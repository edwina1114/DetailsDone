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
class Dessertf : Fragment() {
//    private var recyclerView: RecyclerView? = null
//    lateinit var gridLayoutManager: GridLayoutManager
//    lateinit var foodList: ArrayList<FooditemsModel>
//    lateinit var foodiesAdapters: FooditemsAdapter  //繼承FooditemsAdapter
//
//    ////////////////////////////////////////////////array////////////////////////////////////////////////
//    private val titles = arrayOf(
//        "布丁(小美冰淇淋版本)", "檸檬醋", "蔬果綠拿鐵", "金黃芝麻地瓜", "水果小冰棒", "微笑香蕉蛋糕",
//        "蜂蜜檸檬梅漬小番茄", "法式蘋果克拉芙緹", "巧克力夏威夷豆餅乾", "髒髒派", "迷你優格牛奶司康"
//    )
//
//    private val images = arrayOf(
//        R.drawable.dessert1, R.drawable.dessert2, R.drawable.dessert3, R.drawable.dessert4,
//        R.drawable.dessert5, R.drawable.dessert6, R.drawable.dessert7, R.drawable.dessert8,
//        R.drawable.dessert9, R.drawable.dessert10, R.drawable.dessert11
//    )
//
//    private val DetailsSteps = arrayOf(
//        "布丁(小美冰淇淋版本)", "檸檬醋", "蔬果綠拿鐵", "金黃芝麻地瓜", "水果小冰棒", "微笑香蕉蛋糕",
//        "蜂蜜檸檬梅漬小番茄", "法式蘋果克拉芙緹", "巧克力夏威夷豆餅乾", "髒髒派", "迷你優格牛奶司康"
//    )
//    ////////////////////////////////////////////////array////////////////////////////////////////////////
//
//    //(第二發生)顯示dessert_layout的介面
//    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
//                              savedInstanceState: Bundle?): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fooditems_layout, container, false)
//    }
//
//    //(第三發生)initialize recyclerView and layout manager
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
