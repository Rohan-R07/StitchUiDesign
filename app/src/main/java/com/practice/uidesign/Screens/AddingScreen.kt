package com.practice.uidesign.Screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation3.runtime.NavBackStack
import com.practice.uidesign.DataAndRoutes.Routes
import com.practice.uidesign.ui.theme.CtopAppBar
import com.practice.uidesign.ui.theme.newEntryColor
import com.practice.uidesign.ui.theme.newEntryText
import com.practice.uidesign.ui.theme.saveButton
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddingScreen(
    backStack: NavBackStack?
) {

    var titleValue by remember {
        mutableStateOf("")
    }

    var descValue by remember { mutableStateOf("") }
    val snackBarState = remember {
        SnackbarHostState()
    }
    val courutineScope = rememberCoroutineScope()
    Scaffold(modifier = Modifier.fillMaxSize(), containerColor = CtopAppBar, snackbarHost = {
        SnackbarHost(snackBarState)
    }, topBar = {
        CenterAlignedTopAppBar(
            title = {
                Text(
                    text = "New Entry",
                    fontSize = 24.sp,
                    modifier = Modifier,
                    color = White,
                    fontWeight = FontWeight.Bold
                )
            }, colors = TopAppBarColors(
                containerColor = CtopAppBar,
                titleContentColor = CtopAppBar,
                navigationIconContentColor = CtopAppBar,
                actionIconContentColor = CtopAppBar,
                scrolledContainerColor = CtopAppBar
            ), navigationIcon = {
                IconButton(
                    onClick = {
                        backStack?.removeAll { true }
                        backStack?.add(Routes.HomeScreen)

                    }, modifier = Modifier
                        .padding(start = 3.dp)
                        .size(49.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Close,
                        contentDescription = null,
                        tint = White
                    )
                }
            })
    }) { contentPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(contentPadding),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier)

            TextField(
                value = titleValue,
                onValueChange = { titleValue = it },
                modifier = Modifier
                    .clip(RoundedCornerShape(12.dp))
                    .height(60.dp)
                    .width(320.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = newEntryColor,
                    unfocusedContainerColor = newEntryColor,
                    focusedIndicatorColor = newEntryColor,
                    unfocusedIndicatorColor = newEntryColor,
                    focusedLabelColor = newEntryColor,
                    unfocusedLabelColor = newEntryColor
                ),
                placeholder = {
                    Text(
                        text = "Enter Title...",
                        fontSize = 16.sp,
                        color = White,
                        modifier = Modifier,
                    )
                },
                textStyle = TextStyle(
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Start,
                    fontSize = 19.sp,
                    color = White
                ),
                label = {
                    Text(
                        text = "Title..",
                        fontSize = 18.sp,
                        color = newEntryText,
                        modifier = Modifier
                    )
                })

            Spacer(Modifier.padding(14.dp))

            TextField(
                value = descValue,
                onValueChange = { descValue = it },
                modifier = Modifier
                    .clip(RoundedCornerShape(12.dp))
                    .height(150.dp)
                    .width(320.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = newEntryColor,
                    unfocusedContainerColor = newEntryColor,
                    focusedIndicatorColor = newEntryColor,
                    unfocusedIndicatorColor = newEntryColor,
                    focusedLabelColor = newEntryColor,
                    unfocusedLabelColor = newEntryColor
                ),
                placeholder = {
                    Text(
                        text = "Enter Description...",
                        fontSize = 16.sp,
                        color = White,
                        modifier = Modifier
//                            .padding(top = 3.dp, start = 4.dp)
                    )
                },
                textStyle = TextStyle(
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Start,
                    fontSize = 19.sp,
                    color = White
                ),
                label = {
                    Text(
                        text = "Description..",
                        fontSize = 18.sp,
                        color = newEntryText,
                        modifier = Modifier
//                            .padding(top = 3.dp, start = 4.dp)
                    )
                },
                singleLine = false,
            )

            Spacer(Modifier.padding(top = 300.dp))

            Button(
                onClick = {

                    courutineScope.launch {
                        snackBarState.showSnackbar(
                            message = "Saved Sucessfully",
                        )
                    }
                    backStack?.removeAll { true }
                    backStack?.add(Routes.HomeScreen)
                }, colors = ButtonColors(
                    containerColor = saveButton,
                    contentColor = White,
                    disabledContainerColor = saveButton,
                    disabledContentColor = White
                ), shape = RoundedCornerShape(20.dp), modifier = Modifier.width(330.dp)

            ) {
                Text(
                    text = "Save"
                )
            }

        }

    }
}