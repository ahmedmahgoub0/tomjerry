package com.example.tomjerry.screen.tomKitchen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.composable.SpacerHorizontal8
import com.example.tomjerry.ui.theme.IBM
import com.example.tomjerry.ui.theme.PrimaryDark
import com.example.tomjerry.ui.theme.White38
import com.example.tomjerry.ui.theme.White80
import com.example.tomjerry.ui.theme.White87

@Composable
fun TomButton() {
    Button(
        onClick = { },
        colors = ButtonDefaults.buttonColors(
            containerColor = PrimaryDark
        ),
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Add to cart",
                fontFamily = IBM,
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp,
                lineHeight = 16.sp,
                letterSpacing = 0.5.sp,
                color = White87
            )
            SpacerHorizontal8()
            Box(
                modifier = Modifier
                    .size(5.dp)
                    .clip(CircleShape)
                    .background(White38)

            )
            SpacerHorizontal8()
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "3 cheeses",
                    fontFamily = IBM,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp,
                    lineHeight = 16.sp,
                    letterSpacing = 0.5.sp,
                    color = White
                )
                Text(
                    text = "5 cheeses",
                    fontFamily = IBM,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp,
                    lineHeight = 16.sp,
                    letterSpacing = 0.5.sp,
                    color = White80,
                    style = TextStyle(textDecoration = TextDecoration.LineThrough)
                )
            }
        }
    }
}

@Composable
@Preview
fun TomButtonPreview() {
    TomButton()
}