package com.example.tomjerry.screen.jerryStore

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.example.tomjerry.R
import com.example.tomjerry.composable.SpacerHorizontal8
import com.example.tomjerry.composable.SpacerVertical12
import com.example.tomjerry.composable.SpacerVertical16
import com.example.tomjerry.composable.SpacerVertical24
import com.example.tomjerry.composable.SpacerVertical8
import com.example.tomjerry.ui.theme.Black
import com.example.tomjerry.ui.theme.Grey100
import com.example.tomjerry.ui.theme.IBM
import com.example.tomjerry.ui.theme.Linear1
import com.example.tomjerry.ui.theme.Linear2
import com.example.tomjerry.ui.theme.Primary
import com.example.tomjerry.ui.theme.Primary200
import com.example.tomjerry.ui.theme.PrimaryBackground

@Composable
fun JerryStoreScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(PrimaryBackground)
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 16.dp)
            .padding(top = 2.dp)
    ) {
        TopBar { }
        SpacerVertical12()
        SearchBar({ }) { }
        SpacerVertical8()
        Panner()
        SpacerVertical24()

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Cheap tom section",
                color = Black,
                fontFamily = IBM,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp
            )

            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .clip(RoundedCornerShape(8.dp))
                    .clickable { }
            ) {
                Text(
                    text = "View all",
                    color = Primary,
                    fontFamily = IBM,
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp
                )
                Spacer(modifier = Modifier.width(4.dp))
                Icon(
                    painter = painterResource(R.drawable.ic_arrow_right),
                    contentDescription = null,
                    tint = Primary
                )
            }
        }

        SpacerVertical16()

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TomCard(
                modifier = Modifier.weight(1f).fillMaxWidth(),
                imageId = R.drawable.sport_tom,
                title = "Sport Tom",
                subTitle = "He runs 1 meter... trips over his boot.",
                priceBefore = "5",
                priceAfter = "3"
            )
            SpacerHorizontal8()
            TomCard(
                modifier = Modifier.weight(1f).fillMaxWidth(),
                imageId = R.drawable.tom_the_lover,
                title = "Tom the lover",
                subTitle = "He loves one-sidedly... and is beaten by the other side.",
                priceBefore = "",
                priceAfter = "5"
            )
        }

        SpacerVertical12()

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TomCard(
                modifier = Modifier.weight(1f).fillMaxWidth(),
                imageId = R.drawable.tom_the_bomb,
                title = "Tom the bomb",
                subTitle = "He blows himself up before Jerry can catch him.",
                priceBefore = "",
                priceAfter = "10"
            )
            SpacerHorizontal8()
            TomCard(
                modifier = Modifier.weight(1f).fillMaxWidth(),
                imageId = R.drawable.spy_tom,
                title = "Spy Tom",
                subTitle = "Disguises itself as a table.",
                priceBefore = "",
                priceAfter = "12"
            )
        }

        SpacerVertical12()

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            TomCard(
                modifier = Modifier.weight(1f).fillMaxWidth(),
                imageId = R.drawable.frozen_tom,
                title = "Frozen Tom",
                subTitle = "He was chasing Jerry, he froze after the first look\n",
                priceBefore = "",
                priceAfter = "10"
            )
            SpacerHorizontal8()
            TomCard(
                modifier = Modifier.weight(1f).fillMaxWidth(),
                imageId = R.drawable.sleeping_tom,
                title = "Sleeping Tom",
                subTitle = "He doesn't chase anyone, he just snores in stereo.\n",
                priceBefore = "",
                priceAfter = "10"
            )
        }

        SpacerVertical16()
    }
}


@Composable
@Preview(showSystemUi = true)
fun JerryStorePreview() {
    Scaffold { paddingValues ->
        JerryStoreScreen(modifier = Modifier.padding(paddingValues))
    }
}
