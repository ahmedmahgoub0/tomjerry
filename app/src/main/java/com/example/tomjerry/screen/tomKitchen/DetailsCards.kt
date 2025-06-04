package com.example.tomjerry.screen.tomKitchen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.R
import com.example.tomjerry.composable.SpacerHorizontal8
import com.example.tomjerry.composable.SpacerVertical12
import com.example.tomjerry.composable.SpacerVertical8
import com.example.tomjerry.ui.theme.Black87
import com.example.tomjerry.ui.theme.Green200
import com.example.tomjerry.ui.theme.Grey37
import com.example.tomjerry.ui.theme.Grey60
import com.example.tomjerry.ui.theme.IBM
import com.example.tomjerry.ui.theme.Primary

@Composable
fun DetailsSection() {
    Column {
        Text(
            text = "Details",
            color = Black87,
            fontFamily = IBM,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp,
            lineHeight = 32.sp,
            letterSpacing = 0.5.sp
        )
        SpacerVertical8()
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            DetailsCard(
                iconId = R.drawable.ic_temperature,
                text = "1000 V",
                description = "Temperature"
            )
            SpacerHorizontal8()
            DetailsCard(
                iconId = R.drawable.ic_timer,
                text = "3 sparks",
                description = "Time"
            )
            SpacerHorizontal8()
            DetailsCard(
                iconId = R.drawable.ic_devil,
                text = "1M 12K",
                description = "No. of deaths"
            )
        }
    }
}

@Composable
fun DetailsCard(
    iconId: Int,
    text: String,
    description: String
) {
    Column(
        modifier = Modifier
            .size(104.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(Green200)
            .padding(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            painter = painterResource(iconId),
            contentDescription = null,
            tint = Primary
        )
        SpacerVertical12()
        Text(
            text = text,
            color = Grey60,
            fontFamily = IBM,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
            lineHeight = 16.sp,
            letterSpacing = 0.5.sp
        )
        Text(
            text = description,
            color = Grey37,
            fontFamily = IBM,
            fontWeight = FontWeight.Medium,
            fontSize = 12.sp,
            lineHeight = 16.sp,
            letterSpacing = 0.5.sp
        )
    }
}

@Composable
@Preview(showBackground = true)
fun DetailsCardsPreview() {
    DetailsSection()
}