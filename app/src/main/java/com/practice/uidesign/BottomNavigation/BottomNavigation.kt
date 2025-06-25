package com.practice.uidesign.BottomNavigation

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.entry
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay
import com.practice.uidesign.DataAndRoutes.Routes
import com.practice.uidesign.Screens.AddingScreen
import com.practice.uidesign.Screens.HomeScreen
import com.practice.uidesign.Screens.NotificationScreen
import com.practice.uidesign.Screens.ProfileScreen
import com.practice.uidesign.Screens.SettingScreen

@RequiresApi(Build.VERSION_CODES.VANILLA_ICE_CREAM)
@Composable
fun BottomNavigation(contentPadding: PaddingValues, backStack: NavBackStack) {

    NavDisplay(
        backStack = backStack,
        onBack = {
            backStack.removeLastOrNull()
        },
        modifier = Modifier
            .padding(contentPadding),
        entryProvider = entryProvider {

            entry(Routes.HomeScreen) { key ->
                HomeScreen(backStack)
            }

            entry(Routes.ProfileScreen) { key ->
                ProfileScreen(backStack)
            }

            entry(
                Routes.SettingsScreen
            ) { key ->
                SettingScreen(backStack)
            }

            entry(
                Routes.NotificationScreen
            ) { key ->
                NotificationScreen(backStack)
            }

            entry(
                Routes.AddingScreen
            ) { key ->
                AddingScreen(backStack)
            }

        }
    )
}