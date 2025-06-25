package com.practice.uidesign.utlis

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun HomeCard(image: Int, name: String) {
    Box(
        modifier = Modifier
//            .background(Red)
//            .padding(20.dp)
//            .height(160.dp)
            .width(173.dp),
    ) {


        Image(
            modifier = Modifier.fillMaxWidth(),
            painter = painterResource(image),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )

        Text(
            text = name,
            modifier = Modifier
                .padding(top = 180.dp)
        )
    }
}