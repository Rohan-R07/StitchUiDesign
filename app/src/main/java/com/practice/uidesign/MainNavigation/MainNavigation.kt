package com.practice.uidesign.MainNavigation

import android.os.Build
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.entry
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay
import com.practice.uidesign.DataAndRoutes.Routes
import com.practice.uidesign.Screens.NotificationScreen

//@RequiresApi(Build.VERSION_CODES.VANILLA_ICE_CREAM)
//@Composable
//fun MainNavigation(
//    mainBackStack : NavBackStack,
//    backStack: NavBackStack,
//
//) {
//
//            val contex = LocalContext.current
//    NavDisplay(
//        backStack = mainBackStack,
//        modifier = Modifier
//            .fillMaxSize(),
//        onBack = {
////            backStack.remove(Routes.HomeScreen)
//            Toast.makeText(contex,"HOIEEFIH",Toast.LENGTH_SHORT).show()
//        },
//        entryProvider = entryProvider {
//            entry(MainRoutes.Notification){ key ->
//                NotificationScreen(backStack,mainBackStack)
//            }
//        }
//    )
//}