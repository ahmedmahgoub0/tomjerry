package com.example.tomjerry.screen.tomKitchen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.R
import com.example.tomjerry.composable.SpacerHorizontal8
import com.example.tomjerry.composable.SpacerVertical12
import com.example.tomjerry.composable.SpacerVertical16
import com.example.tomjerry.composable.SpacerVertical24
import com.example.tomjerry.composable.SpacerVertical8
import com.example.tomjerry.ui.theme.BackgroundShape
import com.example.tomjerry.ui.theme.Black87
import com.example.tomjerry.ui.theme.Green200
import com.example.tomjerry.ui.theme.Grey60
import com.example.tomjerry.ui.theme.IBM
import com.example.tomjerry.ui.theme.Primary
import com.example.tomjerry.ui.theme.PrimaryBackground
import com.example.tomjerry.ui.theme.PrimaryDark
import com.example.tomjerry.ui.theme.White38
import com.example.tomjerry.ui.theme.White80
import com.example.tomjerry.ui.theme.White87

@Composable
fun TomKitchenScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(PrimaryBackground)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .verticalScroll(rememberScrollState())
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(400.dp)
                    .background(BackgroundShape)
            )
            Image(
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .offset(x = (-2).dp, y = (-37).dp),
                painter = painterResource(R.drawable.tom_kitchen_ellipse),
                contentDescription = null
            )
            Column(
                modifier = Modifier.padding(top = 40.dp, start = 16.dp)
            ) {
                TopIconAndText(R.drawable.ic_ruler, "High Tension")
                SpacerVertical16()
                TopIconAndText(R.drawable.ic_chef, "Shocking foods")
            }

            Column(
                modifier = Modifier
                    .padding(top = 162.dp)
                    .fillMaxSize()
                    .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
                    .background(PrimaryBackground)
                    .padding(horizontal = 16.dp)
                    .padding(top = 32.dp)
            ) {
                MealDetails()
                SpacerVertical8()
                Text(
                    text = "Pasta cooked with a charger cable and sprinkled with questionable cheese. Make sure to unplug it before eating (or not, you decide).",
                    color = Grey60,
                    fontFamily = IBM,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp,
                    lineHeight = 20.sp,
                    letterSpacing = 0.5.sp
                )
                SpacerVertical24()
                DetailsSection()
                SpacerVertical24()
                PreparationSection()
                Spacer(modifier = Modifier.height(4.dp))

            }
            Image(
                painter = painterResource(R.drawable.food),
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 18.dp, end = 24.dp)
                    .size(width = 188.dp, height = 168.dp)
                    .align(Alignment.TopEnd)
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(86.dp)
                .background(White)
                .padding(horizontal = 16.dp),
            contentAlignment = Alignment.Center
        ) {
            TomButton()
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun TomKitchenScreenPreview() {
    TomKitchenScreen()
}

@Composable
fun TopIconAndText(
    iconId: Int,
    title: String
){
    Row {
        Icon(
            painter = painterResource(iconId),
            contentDescription = null,
            tint = White
        )
        SpacerHorizontal8()
        Text(
            text = title,
            fontFamily = IBM,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            color = White,
            letterSpacing = 0.5.sp
        )
    }
}

@Composable
fun MealDetails() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            Text(
                text = "Electric Tom pasta",
                fontFamily = IBM,
                fontWeight = FontWeight.Medium,
                fontSize = 20.sp,
                color = Black87,
                lineHeight = 32.sp
            )
            SpacerVertical12()
            Row(
                modifier = Modifier
                    .height(30.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Green200)
                    .padding(horizontal = 8.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_money_bag),
                    contentDescription = null,
                    tint = Primary
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "5 cheeses",
                    fontFamily = IBM,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp,
                    color = Primary
                )
            }
        }
        Icon(
            painter = painterResource(R.drawable.ic_favorite),
            contentDescription = null,
            tint = Primary
        )
    }
}