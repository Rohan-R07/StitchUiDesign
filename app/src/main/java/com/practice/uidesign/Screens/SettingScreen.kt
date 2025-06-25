package com.practice.uidesign.Screens

import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation3.runtime.NavBackStack
import com.practice.uidesign.ui.theme.CSettingFont
import com.practice.uidesign.ui.theme.CtopAppBar
import com.practice.uidesign.utlis.ClassicCard


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingScreen(backSack: NavBackStack) {

    Scaffold(
        modifier = Modifier,
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        "Settings",
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
            )
        }

    ) { contentPadding ->

        Column(
            modifier = Modifier
                .padding(contentPadding)
                .background(CtopAppBar)
                .fillMaxSize(),
        ) {
            Row(
                modifier = Modifier
                    .wrapContentHeight()
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "Appearance",
                    fontWeight = FontWeight.Bold,
                    fontSize = 21.sp,
                    color = White,
                    modifier = Modifier
                        .padding(top = 16.dp, start = 16.dp,end = 16.dp, bottom = 8.dp)
                )

            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "Theme",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = White,
                    modifier = Modifier
                        .padding(top = 18.dp, start = 25.dp,end = 16.dp, bottom = 2.dp)
                )

            }
            Text(
                text = "System Defaults",
                fontSize = 14.sp,
                color = CSettingFont,
                modifier = Modifier
                    .padding(start = 28.dp,end = 16.dp, bottom = 8.dp)

            )

            // Dynamic Color
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "Dynamic Color",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = White,
                    modifier = Modifier
                        .padding(top = 18.dp, start = 25.dp,end = 16.dp, bottom = 2.dp)
                )

            }
            Text(
                text = "System Defaults",
                fontSize = 14.sp,
                color = CSettingFont,
                modifier = Modifier
                    .padding(start = 28.dp,end = 16.dp, bottom = 8.dp)

            )

            // App Icon

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "App Icon",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = White,
                    modifier = Modifier
                        .padding(top = 18.dp, start = 25.dp,end = 16.dp, bottom = 2.dp)
                )

            }
            Text(
                text = "System Defaults",
                fontSize = 14.sp,
                color = CSettingFont,
                modifier = Modifier
                    .padding(start = 25.dp,end = 16.dp, bottom = 8.dp)
            )

            // Notification

            Text(
                text = "Notification",
                fontWeight = FontWeight.Bold,
                fontSize = 21.sp,
                color = White,
                modifier = Modifier
                    .padding(top = 16.dp, start = 16.dp,end = 16.dp, bottom = 8.dp)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "Notification Sound",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = White,
                    modifier = Modifier
                        .padding(top = 18.dp, start = 25.dp,end = 16.dp, bottom = 2.dp)
                )

            }
            Text(
                text = "System Defaults",
                fontSize = 14.sp,
                color = CSettingFont,
                modifier = Modifier
                    .padding(start = 28.dp,end = 16.dp, bottom = 8.dp)

            )



            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "Vibration",
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp,
                    color = White,
                    modifier = Modifier
                        .padding(top = 18.dp, start = 25.dp,end = 16.dp, bottom = 2.dp)
                )

            }
            Text(
                text = "System Defaults",
                fontSize = 14.sp,
                color = CSettingFont,
                modifier = Modifier
                    .padding(start = 28.dp,end = 16.dp, bottom = 8.dp)

            )
        }

    }

}

