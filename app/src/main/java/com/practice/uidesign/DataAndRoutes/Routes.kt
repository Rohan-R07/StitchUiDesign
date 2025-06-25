package com.practice.uidesign.DataAndRoutes

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed  class Routes() : NavKey {

    @Serializable
    data object HomeScreen : Routes()

    @Serializable
    data object ProfileScreen : Routes()

    @Serializable
    data object SettingsScreen : Routes()

    @Serializable
    data object NotificationScreen: Routes()

    @Serializable
    data object AddingScreen: Routes()

}