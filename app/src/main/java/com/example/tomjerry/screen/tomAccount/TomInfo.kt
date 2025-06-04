package com.example.tomjerry.screen.tomAccount

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.R
import com.example.tomjerry.ui.theme.IBM
import com.example.tomjerry.ui.theme.White12
import com.example.tomjerry.ui.theme.White80

@Composable
fun TomInfo() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.mirror_tom),
            contentDescription = null,
            modifier = Modifier.size(64.dp)
        )
        Text(
            text = "Tom",
            fontFamily = IBM,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp,
            lineHeight = 22.sp,
            letterSpacing = 0.sp,
            color = White
        )
        Text(
            text = "specializes in failure!",
            fontFamily = IBM,
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp,
            lineHeight = 21.sp,
            letterSpacing = 0.sp,
            color = White80
        )
        Box(
            modifier = Modifier
                .size(97.dp, 25.dp)
                .clip(RoundedCornerShape(40.dp))
                .background(White12)
                .padding(horizontal = 12.dp, vertical = 5.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Edit foolishness",
                fontFamily = IBM,
                fontWeight = FontWeight.Medium,
                fontSize = 10.sp,
                lineHeight = 12.sp,
                letterSpacing = 0.sp,
                color = White
            )
        }
    }
}
