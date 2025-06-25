package com.practice.uidesign.Screens

import android.os.Build
import android.util.Log
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.platform.LocalGraphicsContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation3.runtime.NavBackStack
import com.practice.uidesign.DataAndRoutes.Routes
import com.practice.uidesign.Home.AllScreen
import com.practice.uidesign.Home.CollectoinsScreen
import com.practice.uidesign.Home.SavedScreen
import com.practice.uidesign.R
import com.practice.uidesign.TabRow.HomeTabRow
import com.practice.uidesign.ui.theme.CtopAppBar


@RequiresApi(Build.VERSION_CODES.VANILLA_ICE_CREAM)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(backStack: NavBackStack) {

    var notificationButton = remember { mutableStateOf(false) }
//    val mainBackWStack = rememberNavBackStack<MainRoutes>(MainRoutes.Notification)

    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        "Home",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(10.dp)
                    )
                },
                colors = TopAppBarColors(
                    containerColor = CtopAppBar,
                    titleContentColor = White,
                    navigationIconContentColor = White,
                    actionIconContentColor = White,
                    scrolledContainerColor = Gray
                ),
                actions = {
                    IconButton(
                        onClick = {
                            notificationButton.value = !notificationButton.value
                            backStack.add(Routes.NotificationScreen)

                        },
                        modifier = Modifier
                            .size(40.dp)
                            .padding(end = 10.dp)
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.notifications),
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxSize(),
                            tint = White
                        )
                    }
                }
            )

        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    backStack.add(Routes.AddingScreen)
                },
                shape = CircleShape
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null
                )
            }
        }
    ) { contentAlignment ->
        Column(

            modifier = Modifier
                .padding(contentAlignment)
        ) {
            val tabItem = listOf("All", "Collections", "Saved")
            var selectedTabInted = remember { mutableIntStateOf(0) }

            HomeTabRow(tabItem, selectedTabInted)

            when (selectedTabInted.value) {
                0 -> AllScreen()

                1 -> CollectoinsScreen()

                2 -> SavedScreen()
            }
        }

    }

//    if (notificationButton.value) {
//        MainNavigation(mainBackWStack,backStack)
//
//    }

}
