package com.example.tomjerry.screen.jerryStore

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.R
import com.example.tomjerry.composable.SpacerVertical8
import com.example.tomjerry.ui.theme.IBM
import com.example.tomjerry.ui.theme.Linear1
import com.example.tomjerry.ui.theme.Linear2
import com.example.tomjerry.ui.theme.White4

@Composable
fun Panner() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(108.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth()
                .height(92.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(
                    brush = Brush.horizontalGradient(colors = listOf(Linear1, Linear2))
                )
                .padding(12.dp)
        ) {
            Column(
                modifier = Modifier
            ) {
                Text(
                    text = "Buy 1 Tom and get 2 for free",
                    color = White,
                    fontFamily = IBM,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp
                )

                SpacerVertical8()

                Text(
                    text = "Adopt Tom! (Free Fail-Free Guarantee)",
                    color = White.copy(0.8f),
                    fontFamily = IBM,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    modifier = Modifier.width(178.dp)
                )
            }
        }
        Image(
            painter = painterResource(R.drawable.tom_with_money),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.CenterEnd)
        )
        Box(
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .size(110.dp, 140.dp)
                .rotate(-30f)
                .offset(y = 16.dp, x = 10.dp)
                .clip(RoundedCornerShape(150.dp))
                .background(White4)
        )
        Box(
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .size(106.dp, 136.dp)
                .rotate(-30f)
                .offset(y = 18.dp, x = 12.dp)
                .clip(RoundedCornerShape(150.dp))
                .background(White4)
        )
    }
}

@Composable
@Preview
fun PannerPreview() {
    Panner()
}
