package com.harunbekcan.bottomnavigationbarandroid.ui.fragment

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.harunbekcan.bottomnavigationbarandroid.R
import com.harunbekcan.bottomnavigationbarandroid.base.BaseFragment
import com.harunbekcan.bottomnavigationbarandroid.databinding.FragmentHomeBinding
import com.harunbekcan.bottomnavigationbarandroid.ui.activity.MainActivity

class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override fun getLayoutId(): Int = R.layout.fragment_home

    override fun prepareView(savedInstanceState: Bundle?) {
        initListener()
    }

    private fun initListener(){
        binding.goToFavoritesPageButton.setOnClickListener {
            (requireActivity() as? MainActivity)?.findViewById<BottomNavigationView>(R.id.bottomNavigation)?.selectedItemId =
                R.id.nav_favorite
        }
        binding.goToProfilePageButton.setOnClickListener {
            (requireActivity() as? MainActivity)?.findViewById<BottomNavigationView>(R.id.bottomNavigation)?.selectedItemId = R.id.nav_profile
        }
    }
}