package com.harunbekcan.bottomnavigationbarandroid.ui.fragment

import android.os.Bundle
import com.harunbekcan.bottomnavigationbarandroid.R
import com.harunbekcan.bottomnavigationbarandroid.base.BaseFragment
import com.harunbekcan.bottomnavigationbarandroid.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override fun getLayoutId(): Int = R.layout.fragment_home

    override fun prepareView(savedInstanceState: Bundle?) {}
}