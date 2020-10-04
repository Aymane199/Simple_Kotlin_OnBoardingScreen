## OVERVIEW

The purpose of **on-boarding screens** is to introduce your mobile app and demonstrate what it offer to your users.

## PREVIEW
![](https://i.ibb.co/5sc8VrJ/onboarding-screen.gif)

## BUILD ONBOARDING_SCREENS IN 5MIN
##### First of all you need to create the needed fragment; 
- SplashScreen (the first screen to be showen), 
- ViewPagerFragment (the fragment that will contain OnBoardingScreens ),
- OnBoardingScreens (3 in our example), 
- HomeFragment.

##### Then create the navigation graph
- Add nav_host to mainActivity,
- Create transactions

##### Create adapter to viewPagerFragement
basically it is a class that extends the abstract class FragmentStateAdapter, then use this adapter in viewPagerFragement. the goal here is to add the OnBoardingScreens viewPager component. 

##### SetSharePreferences 
to make sure that the onBoardingScreens will show only once, we are going to put a "flag" on true if the user completed onBoarding (look ThirdOnBoardScreen.kt)

##### Make sure to handle navigation BackStack

