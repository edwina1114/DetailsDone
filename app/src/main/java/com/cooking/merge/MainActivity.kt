package com.cooking.merge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.cooking.merge.bottom_fragments.CameraFragment
import com.cooking.merge.bottom_fragments.FavoritesFragment
import com.cooking.merge.bottom_fragments.HomeFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()
        val cameraFragment = CameraFragment()
        val favoritesFragment = FavoritesFragment()

        setCurrentFragment(homeFragment)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.nav_home -> setCurrentFragment(homeFragment)
                R.id.nav_camera -> setCurrentFragment(cameraFragment)
                R.id.nav_favorites -> setCurrentFragment(favoritesFragment)
            }
            true
        }

    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply{
            replace(R.id.fl_wrapper, fragment)
            commit()
        }
}