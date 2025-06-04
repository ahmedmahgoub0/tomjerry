package com.example.tomjerry.screen.tomAccount

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.R
import com.example.tomjerry.ui.theme.Green200
import com.example.tomjerry.ui.theme.Grey37
import com.example.tomjerry.ui.theme.Grey60
import com.example.tomjerry.ui.theme.IBM
import com.example.tomjerry.ui.theme.Primary

@Composable
fun AccountCardInfo(
    backgroundColor: Color,
    cursorBackgroundId: Int,
    iconId: Int,
    iconColor: Color,
    title: String,
    subtitle: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .width(160.dp)
            .height(58.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(backgroundColor)
            .padding(vertical = 8.dp)
            .padding(start = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
        ) {
            Image(
                painter = painterResource(cursorBackgroundId),
                contentDescription = null
            )
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(iconId),
                    contentDescription = null,
                    tint = iconColor,
                    modifier = Modifier.size(24.dp)
                )
            }
        }
        Spacer(modifier = Modifier.width(10.dp))
        Column(
            verticalArrangement = Arrangement.Center,
        ) {
            Text(
                text = title,
                fontFamily = IBM,
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp,
                lineHeight = 16.sp,
                letterSpacing = 0.5.sp,
                color = Grey60
            )
            Text(
                text = subtitle,
                fontFamily = IBM,
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp,
                lineHeight = 12.sp,
                letterSpacing = 0.5.sp,
                color = Grey37
            )
        }
    }
}

@Composable
@Preview
fun AccountCardInfoPreview() {
    AccountCardInfo(
        backgroundColor = Green200,
        cursorBackgroundId = R.drawable.ic_red_circlee,
        iconId = R.drawable.ic_devil,
        title = "2M 12K",
        subtitle = "No. of quarrels",
        iconColor = Primary
    )
}