package com.harunbekcan.bottomnavigationbarandroid.ui.fragment

import android.os.Bundle
import com.harunbekcan.bottomnavigationbarandroid.R
import com.harunbekcan.bottomnavigationbarandroid.base.BaseFragment
import com.harunbekcan.bottomnavigationbarandroid.databinding.FragmentProfileBinding

class ProfileFragment : BaseFragment<FragmentProfileBinding>() {

    override fun getLayoutId(): Int = R.layout.fragment_profile

    override fun prepareView(savedInstanceState: Bundle?) {}

}