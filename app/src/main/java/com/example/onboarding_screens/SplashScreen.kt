package com.example.onboarding_screens

import android.content.Context
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController


class SplashScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        if (checkOnBoardingCompleted()){
            Handler().postDelayed({
                findNavController().navigate(R.id.action_splashScreen_to_homeFragment)
            },1000)
        }else{
            Handler().postDelayed({
                findNavController().navigate(R.id.action_splashScreen_to_viewPagerFragement)
            },3000)
        }
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_splash_screen, container, false)
    }

    private fun checkOnBoardingCompleted(): Boolean {
        val sharePref = context?.getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        if (sharePref != null) {
            return sharePref.getBoolean("Finished",false)
        }
        return false
        }

}