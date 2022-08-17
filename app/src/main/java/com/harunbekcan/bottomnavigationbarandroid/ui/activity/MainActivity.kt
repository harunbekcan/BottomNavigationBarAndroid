package com.harunbekcan.bottomnavigationbarandroid.ui.activity

import android.os.Bundle
import android.view.MenuItem
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupWithNavController
import com.harunbekcan.bottomnavigationbarandroid.R
import com.harunbekcan.bottomnavigationbarandroid.base.BaseActivity
import com.harunbekcan.bottomnavigationbarandroid.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    private lateinit var navController: NavController

    override fun getLayoutId(): Int = R.layout.activity_main

    override fun prepareView(savedInstanceState: Bundle?) {
        initNavController()
        initBottomNavMenu(navController)
    }

    private fun initNavController(){
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        navController = navHostFragment.navController
    }

    private fun initBottomNavMenu(navController: NavController){
        val bottomNav = binding.bottomNavigationView
        bottomNav.setupWithNavController(navController)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return item.onNavDestinationSelected(navController)
    }
}