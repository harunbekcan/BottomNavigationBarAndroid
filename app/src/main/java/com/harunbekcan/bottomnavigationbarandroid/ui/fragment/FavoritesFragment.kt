package com.harunbekcan.bottomnavigationbarandroid.ui.fragment

import android.os.Bundle
import com.harunbekcan.bottomnavigationbarandroid.R
import com.harunbekcan.bottomnavigationbarandroid.base.BaseFragment
import com.harunbekcan.bottomnavigationbarandroid.databinding.FragmentFavoritesBinding

class FavoritesFragment : BaseFragment<FragmentFavoritesBinding>() {

    override fun getLayoutId(): Int = R.layout.fragment_favorites

    override fun prepareView(savedInstanceState: Bundle?) {}

}