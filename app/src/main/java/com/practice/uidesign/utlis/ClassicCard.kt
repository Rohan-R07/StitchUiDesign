package com.practice.uidesign.utlis

import android.view.RoundedCorner
import androidx.compose.animation.animateColor
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.autofill.ContentType
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.GraphicsContext
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.practice.uidesign.R
import com.practice.uidesign.ui.theme.Purple40
import com.practice.uidesign.ui.theme.Purple80

@Composable
fun ClassicCard(painterResource: Int = R.drawable.vibrant_cityscape,text : String= "Vibrant Cityscape",subText : String = "A colourful illustration of a bustiling city at night. 2D") {


    val runColor = rememberInfiniteTransition()

    val gradiant = runColor.animateColor(
        initialValue = Purple40, targetValue = Green, animationSpec = infiniteRepeatable(
            animation = tween(1000), repeatMode = RepeatMode.Reverse
        )
    )
    val gradiantTwo = runColor.animateColor(
        initialValue = Purple80, targetValue = Blue, animationSpec = infiniteRepeatable(
            animation = tween(1000), repeatMode = RepeatMode.Reverse
        )
    )

    val animatedBrush = Brush.linearGradient(
        listOf(gradiant.value, gradiantTwo.value)
    )
    OutlinedCard(
        modifier = Modifier
            .padding(top = 10.dp)
            .width(350.dp)
            .height(320.dp),
        border = BorderStroke(width = 3.dp, brush = animatedBrush),
    ) {

        Image(
            painter = painterResource(painterResource),
            contentDescription = null,
            modifier = Modifier
                .height(210.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(bottomEnd = 20.dp, bottomStart = 20.dp)),
            contentScale = ContentScale.Crop
        )

        Text(
            modifier = Modifier
                .padding(top = 10.dp, start = 6.dp),
            text = text,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold

        )

        Text(
            modifier = Modifier
                .padding(top = 5.dp, start = 6.dp),
            text = subText,
            fontSize = 16.sp,
            textAlign = TextAlign.Start,
            color = Gray,
            softWrap = true
        )

    }
}
