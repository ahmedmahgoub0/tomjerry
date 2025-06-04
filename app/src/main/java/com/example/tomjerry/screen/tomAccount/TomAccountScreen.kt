package com.example.tomjerry.screen.tomAccount

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import com.example.tomjerry.ui.theme.Green
import com.example.tomjerry.ui.theme.Green200
import com.example.tomjerry.ui.theme.Green300
import com.example.tomjerry.ui.theme.Grey500
import com.example.tomjerry.ui.theme.IBM
import com.example.tomjerry.ui.theme.Orange200
import com.example.tomjerry.ui.theme.Primary
import com.example.tomjerry.ui.theme.PrimaryBackground
import com.example.tomjerry.ui.theme.Red200
import com.example.tomjerry.ui.theme.Reddy
import com.example.tomjerry.ui.theme.White12
import com.example.tomjerry.ui.theme.White80
import com.example.tomjerry.ui.theme.Yellow

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
                .height(242.dp)
                .offset(y = -37.dp),
            contentScale = ContentScale.FillWidth
        )
        Column(
            modifier = Modifier.padding(top = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Image(
                painter = painterResource(R.drawable.mirror_tom),
                contentDescription = null,
                modifier = Modifier.size(64.dp)
            )
            Spacer(modifier = Modifier.height(4.dp))
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
            Spacer(modifier = Modifier.height(4.dp))
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(40.dp))
                    .background(White12)
                    .padding(horizontal = 12.dp, vertical = 6.dp),
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

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 8.dp)
                    .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
                    .background(PrimaryBackground)
                    .padding(top = 24.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                ) {
                    AccountCardInfo(
                        modifier = Modifier.weight(1f),
                        backgroundColor = Green200,
                        cursorBackgroundId = R.drawable.ic_blue_circlee,
                        iconId = R.drawable.ic_devil,
                        iconColor = Primary,
                        title = "2M 12K",
                        subtitle = "No. of quarrels"
                    )
                    SpacerHorizontal8()
                    AccountCardInfo(
                        modifier = Modifier.weight(1f),
                        backgroundColor = Green300,
                        cursorBackgroundId = R.drawable.ic_green_circlee,
                        iconId = R.drawable.ic_runner,
                        iconColor = Green,
                        title = "+500 h",
                        subtitle = "Chase time"
                    )
                }
                SpacerVertical8()
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                ) {
                    AccountCardInfo(
                        modifier = Modifier.weight(1f),
                        backgroundColor = Red200,
                        cursorBackgroundId = R.drawable.ic_red_circlee,
                        iconId = R.drawable.ic_face,
                        iconColor = Reddy,
                        title = "2M 12K",
                        subtitle = "Hunting times"
                    )
                    SpacerHorizontal8()
                    AccountCardInfo(
                        modifier = Modifier.weight(1f),
                        backgroundColor = Orange200,
                        cursorBackgroundId = R.drawable.ic_yellow_circlee,
                        iconId = R.drawable.ic_heartbreak,
                        iconColor = Yellow,
                        title = "3M 7K",
                        subtitle = "Heartbroken"
                    )
                }
                SpacerVertical24()

                Text(
                    modifier = Modifier.padding(horizontal = 16.dp),
                    text = "Tom setting",
                    fontFamily = IBM,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    lineHeight = 20.sp,
                    color = Black87
                )

                SpacerVertical8()

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_single_bed),
                        contentDescription = null,
                        tint = Black,
                        modifier = Modifier
                            .size(40.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(White)
                            .padding(8.dp)
                    )
                    SpacerHorizontal8()
                    Text(
                        text = "Change sleeping place",
                        fontFamily = IBM,
                        fontWeight = FontWeight.Medium,
                        fontSize = 16.sp,
                        lineHeight = 16.sp,
                        color = Black87
                    )
                }

                SpacerVertical12()

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_cat),
                        contentDescription = null,
                        tint = Black,
                        modifier = Modifier
                            .size(40.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(White)
                            .padding(8.dp)
                    )
                    SpacerHorizontal8()
                    Text(
                        text = "Meow settings",
                        fontFamily = IBM,
                        fontWeight = FontWeight.Medium,
                        fontSize = 16.sp,
                        lineHeight = 16.sp,
                        color = Black87
                    )
                }

                SpacerVertical12()

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_fridge),
                        contentDescription = null,
                        tint = Black,
                        modifier = Modifier
                            .size(40.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(White)
                            .padding(8.dp)
                    )
                    SpacerHorizontal8()
                    Text(
                        text = "Password to open the fridge",
                        fontFamily = IBM,
                        fontWeight = FontWeight.Medium,
                        fontSize = 16.sp,
                        lineHeight = 16.sp,
                        color = Black87
                    )
                }

                SpacerVertical12()
                HorizontalDivider(
                    thickness = 1.dp,
                    color = Grey500
                )
                SpacerVertical12()

                Text(
                    modifier = Modifier.padding(horizontal = 16.dp),
                    text = "His favorite foods",
                    fontFamily = IBM,
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    lineHeight = 16.sp,
                    color = Black87
                )

                SpacerVertical8()

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_alert),
                        contentDescription = null,
                        tint = Black,
                        modifier = Modifier
                            .size(40.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(White)
                            .padding(8.dp)
                    )
                    SpacerHorizontal8()
                    Text(
                        text = "Mouses",
                        fontFamily = IBM,
                        fontWeight = FontWeight.Medium,
                        fontSize = 16.sp,
                        lineHeight = 16.sp,
                        color = Black87
                    )
                }

                SpacerVertical12()

                Row(
                    modifier = Modifier.fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_hamburger),
                        contentDescription = null,
                        tint = Black,
                        modifier = Modifier
                            .size(40.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(White)
                            .padding(8.dp)
                    )
                    SpacerHorizontal8()
                    Text(
                        text = "Last stolen meal",
                        fontFamily = IBM,
                        fontWeight = FontWeight.Medium,
                        fontSize = 16.sp,
                        lineHeight = 16.sp,
                        color = Black87
                    )
                }

                SpacerVertical12()

                Row(
                    modifier = Modifier.fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_sleeping),
                        contentDescription = null,
                        tint = Black,
                        modifier = Modifier
                            .size(40.dp)
                            .clip(RoundedCornerShape(8.dp))
                            .background(White)
                            .padding(8.dp)
                    )
                    SpacerHorizontal8()
                    Text(
                        text = "Change sleep mood",
                        fontFamily = IBM,
                        fontWeight = FontWeight.Medium,
                        fontSize = 16.sp,
                        lineHeight = 16.sp,
                        color = Black87
                    )
                }
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
