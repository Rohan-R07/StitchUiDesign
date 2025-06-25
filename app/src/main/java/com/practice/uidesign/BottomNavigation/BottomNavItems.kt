package com.practice.uidesign.BottomNavigation

import com.practice.uidesign.DataAndRoutes.Routes
import com.practice.uidesign.R

data class BottomNavItems(
    val name: String,
    val icon: Int,
    val route: Routes
)

val listItems = listOf<BottomNavItems>(
    BottomNavItems("Home", R.drawable.bhome, Routes.HomeScreen),
    BottomNavItems("Setting", R.drawable.bsettings, Routes.SettingsScreen),
    BottomNavItems("Profile", R.drawable.bprofile, Routes.ProfileScreen),
)
