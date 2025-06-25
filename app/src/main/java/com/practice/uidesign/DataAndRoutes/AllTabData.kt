package com.practice.uidesign.DataAndRoutes

import com.practice.uidesign.R


data class AllTabData(
    val name : String,
    val icon : Int
)

val AllTabList = listOf<AllTabData>(

    AllTabData("Cozy Living Room",R.drawable.allone),
    AllTabData("Modren Kitchen",R.drawable.alltwo),
    AllTabData("Minimalist BedRoom",R.drawable.allthree),
    AllTabData("OutDoor Patio",R.drawable.allfour),
    AllTabData("Cozy Living Room",R.drawable.allfive),
    AllTabData("Cozy Living Room",R.drawable.allsix),

)