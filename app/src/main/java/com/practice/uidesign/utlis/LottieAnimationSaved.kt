package com.practice.uidesign.utlis

import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.practice.uidesign.R

@Composable
fun LottieAnimationSaved(
    modifier: Modifier = Modifier
) {

    val SavedComposition =
        rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.saved_animation))

    val progress by animateLottieCompositionAsState(
        composition = SavedComposition.value,
        iterations = LottieConstants.IterateForever,

        )
    if (!SavedComposition.isLoading) {

        LottieAnimation(
            progress = { progress },
            composition = SavedComposition.value,
            modifier = modifier
                .size(200.dp)
        )
    }else{
        CircularProgressIndicator()
    }

}


@Composable
fun LottieAnimationCollection(modifier: Modifier = Modifier) {
    val CollectionComposition =
        rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.collection_animation))

    val collectionProgress by animateLottieCompositionAsState(
        composition = CollectionComposition.value,
        iterations = LottieConstants.IterateForever,

        )

    if (!CollectionComposition.isLoading) {
        LottieAnimation(
            composition = CollectionComposition.value,
            progress = { collectionProgress },
            modifier = modifier
                .size(200.dp)
        )
    } else {
        CircularProgressIndicator()
    }


}

