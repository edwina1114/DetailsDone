package com.cooking.merge.food_fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
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


class Breakfastf : Fragment(), OnFoodItemClickListener {
    private var recyclerView: RecyclerView? = null
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var foodList: ArrayList<FooditemsModel>
    lateinit var foodiesAdapters: FooditemsAdapter  //繼承FooditemsAdapter

    ////////////////////////////////////////////////array////////////////////////////////////////////////
    private val titles = arrayOf(
        "燕麥優格杯", "草莓蛋吐司", "培根蛋早餐燕麥粥", "全麥鮪魚蛋吐司", "法式吐司",
        "蔥花蛋捲", "帕瑪森花椰菜煎餅", "酪梨豆腐青醬吐司", "五分鐘咖哩優格鮮蔬三明治",
        "3分鐘微波法式吐司", "5分鐘舒芙蕾起司蛋", "太陽蛋吐司佐辣味焦糖奶油醬",
        "起士菇菇炒蛋盒子", "煎蛋吐司", "起司煎蛋"
    )

    private val images = arrayOf(
        R.drawable.breakfast1, R.drawable.breakfast2, R.drawable.breakfast11,
        R.drawable.breakfast7, R.drawable.breakfast8, R.drawable.breakfast6,
        R.drawable.breakfast9, R.drawable.breakfast10, R.drawable.breakfast12,
        R.drawable.breakfast13, R.drawable.breakfast14, R.drawable.breakfast15,
        R.drawable.breakfast5, R.drawable.breakfast3, R.drawable.breakfast4
    )

    private val ingredients = arrayOf(
        "燕麥、優格、水果(可加可不加)", "草莓果醬、雞蛋",
        "雞蛋 1顆\n" + "洋蔥 1/2顆\n" + "培根 1條\n" + "即食大燕麥片 40g\n" + "高湯塊 1/4顆\n" + "清水 350ml\n" + "青蔥（裝飾用） 少許", "全麥鮪魚蛋吐司", "法式吐司",
        "蔥花蛋捲", "帕瑪森花椰菜煎餅", "酪梨豆腐青醬吐司", "五分鐘咖哩優格鮮蔬三明治",
        "3分鐘微波法式吐司", "5分鐘舒芙蕾起司蛋", "太陽蛋吐司佐辣味焦糖奶油醬",
        "起士菇菇炒蛋盒子", "煎蛋吐司", "起司煎蛋"
    )

    private val sauses = arrayOf(
        "...", "...", "鹽 適量\n" + "黑胡椒 適量", "全麥鮪魚蛋吐司", "法式吐司",
        "蔥花蛋捲", "帕瑪森花椰菜煎餅", "酪梨豆腐青醬吐司", "五分鐘咖哩優格鮮蔬三明治",
        "3分鐘微波法式吐司", "5分鐘舒芙蕾起司蛋", "太陽蛋吐司佐辣味焦糖奶油醬",
        "起士菇菇炒蛋盒子", "煎蛋吐司", "起司煎蛋"
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

        ///// design the gridlayout & set recyclerview /////
        gridLayoutManager = GridLayoutManager(
            requireContext(), 3,
            LinearLayoutManager.VERTICAL, false
        )
        recyclerView?.layoutManager = gridLayoutManager
        recyclerView?.setHasFixedSize(true)
        ///// design the gridlayout & set recyclerview /////

        foodList = ArrayList()      //將foodList作為一個arraylist
        foodList = addfood()        //foodList存放圖片及名稱
        foodiesAdapters = FooditemsAdapter(requireContext(), this, foodList )   //adapter按照位置擺放foodlist裡的所有物品
        recyclerView?.adapter = foodiesAdapters

    }

    fun addfood(): ArrayList<FooditemsModel> {
        //array的方法 (way1)
        val addlist: ArrayList<FooditemsModel> = ArrayList()
        for (i in titles.indices) {
            val model = FooditemsModel(images[i], titles[i], ingredients[i], sauses[i])
            addlist.add(model)
        }
        return addlist
    }
        /*(way2)
        foodList.add(FooditemsModel(R.drawable.breakfast1, "燕麥優格杯"))
        foodList.add(FooditemsModel(R.drawable.breakfast2, "草莓蛋吐司"))
        foodList.add(FooditemsModel(R.drawable.breakfast11, "培根蛋早餐燕麥粥"))
        foodList.add(FooditemsModel(R.drawable.breakfast7, "全麥鮪魚蛋吐司"))
        foodList.add(FooditemsModel(R.drawable.breakfast8, "法式吐司"))
        foodList.add(FooditemsModel(R.drawable.breakfast6, "蔥花蛋捲"))
        foodList.add(FooditemsModel(R.drawable.breakfast9, "帕瑪森花椰菜煎餅"))
        foodList.add(FooditemsModel(R.drawable.breakfast10, "酪梨豆腐青醬吐司"))
        foodList.add(FooditemsModel(R.drawable.breakfast12, "五分鐘咖哩優格鮮蔬三明治"))
        foodList.add(FooditemsModel(R.drawable.breakfast13, "3分鐘微波法式吐司"))
        foodList.add(FooditemsModel(R.drawable.breakfast14, "5分鐘舒芙蕾起司蛋"))
        foodList.add(FooditemsModel(R.drawable.breakfast15, "太陽蛋吐司佐辣味焦糖奶油醬"))
        foodList.add(FooditemsModel(R.drawable.breakfast5, "起士菇菇炒蛋盒子"))
        foodList.add(FooditemsModel(R.drawable.breakfast3, "煎蛋吐司"))
        foodList.add(FooditemsModel(R.drawable.breakfast4, "起司煎蛋"))
        return foodList
        */


    override fun onItemClick(item: FooditemsModel, position: Int)
    {
        val intent = Intent(context, BreakfastDetailsf::class.java)
        intent.putExtra("FOODIMAGE", item.iconsChar.toString())
        intent.putExtra("FOODNAME", item.alphaChar)
        intent.putExtra("FOODINGREDIENT", item.ingredient)
        intent.putExtra("FOODSAUCE", item.sauce)

        startActivity(intent)
    }
}
