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
class Soupf: Fragment() {}
    /*  {
    private var recyclerView: RecyclerView? = null
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var foodList: ArrayList<FooditemsModel>
    lateinit var foodiesAdapters: FooditemsAdapter  //繼承FooditemsAdapter

    ////////////////////////////////////////////////array////////////////////////////////////////////////
    private val titles = arrayOf(
        "菇菇蘿蔔雞湯", "金沙絲瓜湯", "海帶芽豆腐味噌湯", "鮮蔬豆腐味噌湯", "洋蔥湯",
        "麻油菇菇雞湯", "豚汁蔬菜湯", "蒜頭洋蔥雞湯", "韓式海帶芽排骨湯", "雞茸玉米羮"
    )

    private val images = arrayOf(
        R.drawable.soup1, R.drawable.soup2, R.drawable.soup3, R.drawable.soup4,
        R.drawable.soup5, R.drawable.soup6, R.drawable.soup7, R.drawable.soup8,
        R.drawable.soup9, R.drawable.soup10
    )

    private val DetailsSteps = arrayOf(
        "菇菇蘿蔔雞湯", "金沙絲瓜湯", "海帶芽豆腐味噌湯", "鮮蔬豆腐味噌湯", "洋蔥湯",
        "麻油菇菇雞湯", "豚汁蔬菜湯", "蒜頭洋蔥雞湯", "韓式海帶芽排骨湯", "雞茸玉米羮"
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
    //(第三發生)initialize recyclerView and layout manager
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
        val addlist: ArrayList<FooditemsModel> = ArrayList()
        for (i in titles.indices) {
            val model = FooditemsModel(images[i], titles[i],DetailsSteps[i])
            addlist.add(model)
        }
        return addlist
    }

    override fun onItemClick(item: FooditemsModel, position: Int)
    {
        val intent = Intent(context, BreakfastDetailsf::class.java)
        intent.putExtra("FOODIMAGE", item.iconsChar.toString())
        intent.putExtra("FOODNAME", item.alphaChar)
        intent.putExtra("FOODSTEP", item.detailsstep)

        startActivity(intent)
    }

}
*/