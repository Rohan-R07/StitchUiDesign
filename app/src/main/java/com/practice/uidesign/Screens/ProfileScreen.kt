package com.practice.uidesign.Screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation3.runtime.NavBackStack
import com.practice.uidesign.R
import com.practice.uidesign.ui.theme.CtopAppBar
import com.practice.uidesign.ui.theme.emailText
import com.practice.uidesign.ui.theme.followColor
import com.practice.uidesign.ui.theme.messageColor
import com.practice.uidesign.ui.theme.posts
import com.practice.uidesign.ui.theme.stroke
import com.practice.uidesign.utlis.ClassicCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(backStack: NavBackStack) {

    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        "Profile",
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
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            LazyColumn(
                modifier = Modifier
                    .wrapContentSize(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally,

                ) {

                item {

                    Column(
                        modifier = Modifier
                            .wrapContentSize()
                    ) {

                        Image(
                            painter = painterResource(R.drawable.profile_picture),
                            contentDescription = null,
                            modifier = Modifier
                                .clip(shape = CircleShape)
                                .size(115.dp)
                                .fillMaxSize(),
                            contentScale = ContentScale.Inside
                        )


                        Text(
                            text = "Jhon Carter",
                            fontSize = 23.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .wrapContentSize()
                                .width(128.dp)
                                .padding(top = 16.dp),
                            textAlign = TextAlign.Center,
                            softWrap = true
                        )

                        Text(
                            text = "@jhoncarter12",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .wrapContentSize()
                                .padding(top = 1.dp)
                                .width(128.dp),
                            textAlign = TextAlign.Center,
                            softWrap = true,
                            color = emailText
                        )
                    }

                    Text(
                        text = "Digital artist and illustrator. Passionate about creating vibrant and imaginative worlds.",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .wrapContentSize()
                            .padding(top = 3.dp, start = 12.dp, end = 12.dp),
                        textAlign = TextAlign.Center,
                        softWrap = true,
                        color = White
                    )

                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Button(
                            onClick = {
                                // FOllow Button
                            },
                            colors = ButtonColors(
                                containerColor = followColor,
                                contentColor = White,
                                disabledContainerColor = Gray,
                                disabledContentColor = Gray
                            ),
                            modifier = Modifier
                                .padding(5.dp)
                                .width(160.dp)
                                .height(40.dp)
                        ) {
                            Text(
                                text = "Follow",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }


                        Button(
                            onClick = {

                            },
                            colors = ButtonColors(
                                containerColor = messageColor,
                                contentColor = White,
                                disabledContainerColor = Gray,
                                disabledContentColor = Gray
                            ),
                            modifier = Modifier
                                .padding(top = 5.dp, start = 10.dp)
                                .width(160.dp)
                                .height(40.dp)
                        ) {
                            Text(
                                text = "Message",
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        OutlinedCard(
                            modifier = Modifier
                                .padding(top = 15.dp, bottom = 15.dp, end = 10.dp)
                                .height(70.dp)
                                .width(111.dp),
                            border = BorderStroke(width = 2.dp, color = stroke)
                        ) {

                            Column(
                                modifier = Modifier
                                    .fillMaxSize(),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = "120",
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    text = "Posts",
                                    fontSize = 16.sp,
                                    color = posts,
                                    modifier = Modifier
                                        .padding(top = 2.dp)

                                )
                            }

                        }


                        OutlinedCard(
                            modifier = Modifier
                                .padding(top = 15.dp, bottom = 15.dp, end = 10.dp)
                                .height(70.dp)
                                .width(111.dp),
                            border = BorderStroke(width = 2.dp, color = stroke)
                        ) {

                            Column(
                                modifier = Modifier
                                    .fillMaxSize(),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = "80",
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    text = "Followers",
                                    fontSize = 16.sp,
                                    color = posts,
                                    modifier = Modifier
                                        .padding(top = 2.dp)

                                )
                            }

                        }

                        OutlinedCard(
                            modifier = Modifier
                                .padding(top = 15.dp, bottom = 15.dp, end = 10.dp)
                                .height(70.dp)
                                .width(111.dp),
                            border = BorderStroke(width = 2.dp, color = stroke)
                        ) {

                            Column(
                                modifier = Modifier
                                    .fillMaxSize(),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = "200",
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    text = "Following",
                                    fontSize = 16.sp,
                                    color = posts,
                                    modifier = Modifier
                                        .padding(top = 2.dp)

                                )
                            }

                        }


                    }
                }

            }
            LazyColumn(
                modifier = Modifier,
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                items(20) {
                    ClassicCard()
                }
            }

        }
    }

}

