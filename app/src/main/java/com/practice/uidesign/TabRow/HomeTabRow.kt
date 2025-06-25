package com.practice.uidesign.TabRow

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableIntState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.unit.dp
import com.practice.uidesign.ui.theme.CtopAppBar


@Composable
fun HomeTabRow(tabItem: List<String>, selectedTabInted: MutableIntState): MutableIntState {
//    val tabItem = listOf("All", "Collections", "Saved")
//    var selectedTabInted by remember { mutableIntStateOf(0) }

    Box(
        modifier = Modifier
    ) {


        Row(
            modifier = Modifier
                .background(CtopAppBar)
                .height(60.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Column(
                modifier = Modifier
                    .clickable {
                        selectedTabInted.value = 0
                    }
                    .padding(start = 10.dp, top = 12.dp, end = 10.dp)
                    .clip(RoundedCornerShape(10.dp))
                    .wrapContentSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Text(
                    tabItem[0],
                    color = if (selectedTabInted.value == 0) White else White.copy(alpha = 0.5f)
                )
                Box(
                    modifier = Modifier
                        .width(30.dp)
                        .clip(RoundedCornerShape(3.dp))
                        .height(3.dp)
                        .background(if (selectedTabInted.value == 0) White else White.copy(alpha = 0.5f))
                )
            }

            Spacer(Modifier.padding(start = 10.dp))
            Column(
                modifier = Modifier
                    .clickable {
                        selectedTabInted.value = 1
                    }
                    .padding(start = 10.dp, top = 10.dp, end = 10.dp)
                    .wrapContentSize(),

                ) {
                Text(
                    tabItem[1],
                    color = if (selectedTabInted.value == 1) White else White.copy(alpha = 0.5f)
                )
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(5.dp))
                        .width(76.dp)
                        .height(4.dp)
                        .padding(top = 2.dp)
                        .background(if (selectedTabInted.value == 1) White else White.copy(alpha = 0.5f))
                )

            }

            Spacer(Modifier.padding(start = 10.dp))

            Column(
                modifier = Modifier
                    .clickable {
                        selectedTabInted.value = 2
                    }
                    .padding(start = 10.dp, top = 10.dp, end = 10.dp)
                    .wrapContentSize(),

                ) {
                Text(
                    tabItem[2],
                    color = if (selectedTabInted.value == 2) White else White.copy(alpha = 0.5f)
                )
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(5.dp))
                        .width(44.dp)
                        .height(4.dp)
                        .padding(top = 2.dp)
                        .background(if (selectedTabInted.value == 2) White else White.copy(alpha = 0.5f))
                )

            }

        }
        HorizontalDivider(
            modifier = Modifier
                .padding(top = 50.dp),
            thickness = 2.dp
        )

    }
    return selectedTabInted

}

