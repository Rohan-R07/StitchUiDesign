package com.practice.uidesign

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.compose.animation.core.animateDp
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation3.runtime.rememberNavBackStack
import com.practice.uidesign.BottomNavigation.BottomNavigation
import com.practice.uidesign.BottomNavigation.listItems
import com.practice.uidesign.DataAndRoutes.Routes
import com.practice.uidesign.ui.theme.UiDesignTheme

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.VANILLA_ICE_CREAM)
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UiDesignTheme {

                val bottomBackStack = rememberNavBackStack<Routes>(Routes.HomeScreen)

                Scaffold(
                    modifier = Modifier.fillMaxSize(), bottomBar = {
                        BottomAppBar(
                            modifier = Modifier
                        ) {
                            var selectedIntex by remember {
                                mutableIntStateOf(0)
                            }
                            listItems.forEachIndexed { index, item ->

                                val isSelected = selectedIntex == index

                                var updateTransitionState = updateTransition(

                                    targetState = isSelected, label = null
                                )

                                var iconSizeAnimation =
                                    updateTransitionState.animateDp(
                                        label = "IconSize",
                                        transitionSpec = { tween(200) },
                                        targetValueByState = { isSelected ->
                                            if (isSelected) 40.dp else 25.dp
                                        })

                                NavigationBarItem(
                                    selected = if (isSelected) true else false,
                                    onClick = {
                                        selectedIntex = index
                                        bottomBackStack.removeLastOrNull()
                                        bottomBackStack.add(item.route)
                                    },
                                    icon = {
                                        Icon(
                                            painter = painterResource(item.icon),
                                            contentDescription = null,
                                            modifier = Modifier.size(iconSizeAnimation.value),
                                            tint = if (isSelected) White else White.copy(
                                                alpha = 0.3f
                                            )
                                        )
                                    },
                                    label = {
                                        Text(
                                            text = item.name,
                                            fontSize = 15.sp,
                                            fontWeight = if (isSelected) FontWeight.Bold else null,
                                        )
                                    }
                                )
                            }
                        }
                    }

                ) { innerPadding ->
                    BottomNavigation(innerPadding, bottomBackStack)
                }

            }
        }
    }
}

