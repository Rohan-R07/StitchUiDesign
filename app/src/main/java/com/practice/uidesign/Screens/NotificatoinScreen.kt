package com.practice.uidesign.Screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation3.runtime.NavBackStack
import com.practice.uidesign.DataAndRoutes.Routes
import com.practice.uidesign.R
import com.practice.uidesign.ui.theme.CSettingFont
import com.practice.uidesign.ui.theme.CtopAppBar


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NotificationScreen(backStack : NavBackStack) {

    Scaffold(
        modifier = Modifier,
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        "Notification",
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
                navigationIcon = {
                    IconButton(
                        onClick = {
                            backStack.removeAll{true}
                            backStack.add(Routes.HomeScreen)
                        }
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = null,
                            tint = White
                        )
                    }
                }
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
                    text = "Today",
                    fontWeight = FontWeight.Bold,
                    fontSize = 21.sp,
                    color = White,
                    modifier = Modifier
                        .padding(top = 16.dp, start = 16.dp, end = 16.dp, bottom = 8.dp)
                )

            }

            // New Feature Alert
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {

                Icon(
                    painter = painterResource(R.drawable.notification_card),
                    contentDescription = null,
                    tint = _root_ide_package_.androidx.compose.ui.graphics.Color.Unspecified,
                    modifier = Modifier
                        .size(60.dp)
                        .padding(start = 16.dp, top = 5.dp)
                )

                Column {

                    Text(
                        text = "New Feature Alert",
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = White,
                        modifier = Modifier
                            .padding(top = 18.dp, start = 18.dp, end = 16.dp, bottom = 2.dp)
                    )
                    Text(
                        text = "10:30AM",
                        fontSize = 14.sp,
                        color = CSettingFont,
                        modifier = Modifier
                            .padding(start = 18.dp, end = 16.dp, bottom = 8.dp)

                    )
                }

            }

            // Account Update
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {

                Icon(
                    painter = painterResource(R.drawable.account_updatepng),
                    contentDescription = null,
                    tint = _root_ide_package_.androidx.compose.ui.graphics.Color.Unspecified,
                    modifier = Modifier
                        .size(60.dp)
                        .padding(start = 16.dp, top = 5.dp)
                )

                Column {

                    Text(
                        text = "Account Update",
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = White,
                        modifier = Modifier
                            .padding(top = 18.dp, start = 18.dp, end = 16.dp, bottom = 2.dp)
                    )
                    Text(
                        text = "9:30AM",
                        fontSize = 14.sp,
                        color = CSettingFont,
                        modifier = Modifier
                            .padding(start = 18.dp, end = 16.dp, bottom = 8.dp)

                    )
                }

            }

            Column(
                modifier = Modifier
                    .padding()
                    .background(CtopAppBar)
                    .fillMaxSize(),
            ) {

                Text(
                    text = "Yesterday",
                    fontWeight = FontWeight.Bold,
                    fontSize = 21.sp,
                    color = White,
                    modifier = Modifier
                        .padding(top = 16.dp, start = 16.dp, end = 16.dp, bottom = 8.dp)
                )

                // Security Notice
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {

                    Icon(
                        painter = painterResource(R.drawable.security_notice),
                        contentDescription = null,
                        tint = _root_ide_package_.androidx.compose.ui.graphics.Color.Unspecified,
                        modifier = Modifier
                            .size(60.dp)
                            .padding(start = 16.dp, top = 5.dp)
                    )

                    Column {

                        Text(
                            text = "Security Notice",
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp,
                            color = White,
                            modifier = Modifier
                                .padding(top = 18.dp, start = 18.dp, end = 16.dp, bottom = 2.dp)
                        )
                        Text(
                            text = "4:45 PM",
                            fontSize = 14.sp,
                            color = CSettingFont,
                            modifier = Modifier
                                .padding(start = 18.dp, end = 16.dp, bottom = 8.dp)

                        )
                    }

                }


                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {

                    Icon(
                        painter = painterResource(R.drawable.app_update),
                        contentDescription = null,
                        tint = _root_ide_package_.androidx.compose.ui.graphics.Color.Unspecified,
                        modifier = Modifier
                            .size(60.dp)
                            .padding(start = 16.dp, top = 5.dp)
                    )

                    Column {

                        Text(
                            text = "App Update Available",
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp,
                            color = White,
                            modifier = Modifier
                                .padding(top = 18.dp, start = 18.dp, end = 16.dp, bottom = 2.dp)
                        )
                        Text(
                            text = "2:00 PM",
                            fontSize = 14.sp,
                            color = CSettingFont,
                            modifier = Modifier
                                .padding(start = 18.dp, end = 16.dp, bottom = 8.dp)

                        )
                    }

                }




                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {

                    Icon(
                        painter = painterResource(R.drawable.welcome),
                        contentDescription = null,
                        tint = _root_ide_package_.androidx.compose.ui.graphics.Color.Unspecified,
                        modifier = Modifier
                            .size(60.dp)
                            .padding(start = 16.dp, top = 5.dp)
                    )

                    Column {

                        Text(
                            text = "Welcome to App",
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp,
                            color = White,
                            modifier = Modifier
                                .padding(top = 18.dp, start = 18.dp, end = 16.dp, bottom = 2.dp)
                        )
                        Text(
                            text = "11:00 PM",
                            fontSize = 14.sp,
                            color = CSettingFont,
                            modifier = Modifier
                                .padding(start = 18.dp, end = 16.dp, bottom = 8.dp)

                        )
                    }

                }
            }

        }

    }
}

