package com.harunbekcan.bottomnavigationbarandroid.ui.activity

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.harunbekcan.bottomnavigationbarandroid.R
import com.harunbekcan.bottomnavigationbarandroid.base.BaseActivity
import com.harunbekcan.bottomnavigationbarandroid.databinding.ActivityMainBinding
import com.harunbekcan.bottomnavigationbarandroid.utils.setGone
import com.harunbekcan.bottomnavigationbarandroid.utils.setVisible

class MainActivity : BaseActivity<ActivityMainBinding>(),NavController.OnDestinationChangedListener {

    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun getLayoutId(): Int = R.layout.activity_main

    override fun prepareView(savedInstanceState: Bundle?) {
        initNavigation()
    }

    private fun initNavigation() {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        navController = navHostFragment.navController
        binding.bottomNavigation.setupWithNavController(navController)
        binding.bottomNavigation.itemIconTintList = null
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.homeFragment,
                R.id.favoritesFragment,
                R.id.profileFragment
            )
        )
        navHostFragment.navController.addOnDestinationChangedListener(this)
    }

    override fun onDestinationChanged(
        controller: NavController,
        destination: NavDestination,
        arguments: Bundle?
    ) {
        when (destination.id) {

            R.id.homeFragment -> {
                binding.bottomNavigation.setVisible()
            }

            R.id.favoritesFragment -> {
                binding.bottomNavigation.setVisible()
            }

            R.id.profileFragment -> {
                binding.bottomNavigation.setVisible()
            }

            else -> {
                binding.bottomNavigation.setGone()
            }
        }
    }
}