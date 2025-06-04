package com.example.tomjerry.screen.tomAccount

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.R
import com.example.tomjerry.composable.SpacerHorizontal8
import com.example.tomjerry.composable.SpacerVertical12
import com.example.tomjerry.composable.SpacerVertical24
import com.example.tomjerry.composable.SpacerVertical8
import com.example.tomjerry.ui.theme.Black
import com.example.tomjerry.ui.theme.Black60
import com.example.tomjerry.ui.theme.Black87
import com.example.tomjerry.ui.theme.Grey500
import com.example.tomjerry.ui.theme.IBM
import com.example.tomjerry.ui.theme.PrimaryBackground

@Composable
fun TomAccountScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        contentAlignment = Alignment.TopCenter
    ) {
        Image(
            painter = painterResource(R.drawable.tom_account_background),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(177.dp),
            contentScale = ContentScale.FillWidth
        )
        Column(
            modifier = Modifier.padding(top = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TomInfo()
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
                    .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
                    .background(PrimaryBackground)
                    .padding(top = 24.dp)
            ) {
                TomStatistics()
                SpacerVertical24()

                TomSettingsSection(
                    title = "Tom settings",
                    itemsList = mapOf(
                        R.drawable.ic_single_bed to "Change sleeping place",
                        R.drawable.ic_cat to "Meow settings",
                        R.drawable.ic_fridge to "Password to open the fridge"
                    )
                )
                SpacerVertical12()
                HorizontalDivider(
                    thickness = 1.dp,
                    color = Grey500
                )
                SpacerVertical12()
                TomSettingsSection(
                    title = "His favorite foods",
                    itemsList = mapOf(
                        R.drawable.ic_alert to "Mouses",
                        R.drawable.ic_hamburger to "Last stolen meal",
                        R.drawable.ic_sleeping to "Change sleep mood"
                    )
                )
                SpacerVertical24()
                Text(
                    modifier = Modifier.fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    text = "v.TomBeta",
                    fontFamily = IBM,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    lineHeight = 12.sp,
                    color = Black60,
                    textAlign = TextAlign.Center
                )
                SpacerVertical24()
            }
        }
    }
}

@Composable
@Preview(showSystemUi = true)
fun TomAccountScreenPreview() {
    TomAccountScreen()
}
