package com.example.onboarding_screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.onboarding_screens.onboarding.ViewPagerAdapter
import com.example.onboarding_screens.onboarding.screens.FirstOnBoardScreen
import com.example.onboarding_screens.onboarding.screens.SecondOnBoardScreen
import com.example.onboarding_screens.onboarding.screens.ThirdOnBoardScreen
import kotlinx.android.synthetic.main.fragment_view_pager.view.*


class viewPagerFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

        val fragmentList = arrayListOf<Fragment>(
            FirstOnBoardScreen(),
            SecondOnBoardScreen(),
            ThirdOnBoardScreen()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle )

        view.viewPager.adapter = adapter

        return view
    }

}