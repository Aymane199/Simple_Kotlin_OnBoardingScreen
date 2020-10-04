package com.example.onboarding_screens.onboarding

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(list: ArrayList<Fragment>,
                       fm :FragmentManager,
                       lifecycle:Lifecycle
    ) : FragmentStateAdapter(fm,lifecycle) {

    private val fragementList = list

    override fun getItemCount(): Int {
        return fragementList.size
    }

    override fun createFragment(position: Int): Fragment {
       return fragementList[position]
    }
}