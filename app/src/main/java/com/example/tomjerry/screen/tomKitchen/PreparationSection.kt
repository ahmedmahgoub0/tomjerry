package com.example.tomjerry.screen.tomKitchen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.composable.SpacerVertical8
import com.example.tomjerry.ui.theme.Black87
import com.example.tomjerry.ui.theme.Green200
import com.example.tomjerry.ui.theme.Grey60
import com.example.tomjerry.ui.theme.IBM
import com.example.tomjerry.ui.theme.Primary

@Composable
fun PreparationSection() {
    Column {
        Text(
            text = "Preparation method",
            color = Black87,
            fontFamily = IBM,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp,
            lineHeight = 32.sp,
            letterSpacing = 0.5.sp
        )
        SpacerVertical8()
        PreparationMethodCard("1", "Put the pasta in a toaster.")
        SpacerVertical8()
        PreparationMethodCard("2", "Pour battery juice over it.")
        SpacerVertical8()
        PreparationMethodCard("3", "Wait for the spark to ignite.")
        SpacerVertical8()
        PreparationMethodCard("4", "Serve with an insulating glove.")
    }
}

@Composable
fun PreparationMethodCard(
    number: String,
    description: String
) {
    Box(
        modifier = Modifier,
        contentAlignment = Alignment.CenterStart
    ) {
        Box(
            modifier = Modifier.fillMaxWidth()
                .height(32.dp)
                .clip(RoundedCornerShape(topEnd = 12.dp, bottomEnd = 12.dp))
                .padding(start = 20.dp)
                .background(White)
                .padding(start = 24.dp),
            contentAlignment = Alignment.CenterStart
        ){
            Text(
                text = description,
                color = Grey60,
                fontFamily = IBM,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                lineHeight = 16.sp,
                letterSpacing = 0.5.sp
            )
        }
        Text(
            text = number,
            color = Primary,
            fontFamily = IBM,
            fontWeight = FontWeight.Medium,
            fontSize = 12.sp,
            lineHeight = 16.sp,
            letterSpacing = 0.5.sp,
            modifier = Modifier
                .size(36.dp)
                .clip(CircleShape)
                .background(White)
                .border(1.dp, Green200, CircleShape)
                .padding(horizontal = 14.dp, vertical = 10.dp)
        )
    }
}

@Composable
@Preview(showBackground = true)
fun PreparationSectionPreview() {
    PreparationSection()
}