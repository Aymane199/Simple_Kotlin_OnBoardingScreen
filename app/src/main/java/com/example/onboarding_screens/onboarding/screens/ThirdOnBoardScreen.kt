package com.example.onboarding_screens.onboarding.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.onboarding_screens.R
import kotlinx.android.synthetic.main.fragment_third_on_board_screen.view.*


class ThirdOnBoardScreen : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_third_on_board_screen, container, false)


        view.textViewFinish.setOnClickListener {
            findNavController().navigate(R.id.action_viewPagerFragement_to_homeFragment)
            onBoardingFinished()

        }

        return view

    }

    private fun onBoardingFinished(){
        val sharePref = context?.getSharedPreferences("onBoarding",Context.MODE_PRIVATE)
        val editor  = sharePref?.edit()
        editor?.putBoolean("Finished",true)
        editor?.apply()
    }


}