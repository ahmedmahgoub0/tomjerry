package com.example.tomjerry.screen.jerryStore

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.R
import com.example.tomjerry.composable.SpacerHorizontal8
import com.example.tomjerry.composable.SpacerVertical8
import com.example.tomjerry.ui.theme.Black
import com.example.tomjerry.ui.theme.Grey100
import com.example.tomjerry.ui.theme.IBM
import com.example.tomjerry.ui.theme.Primary
import com.example.tomjerry.ui.theme.Primary200

@Composable
fun TomCard(
    imageId: Int,
    title: String,
    subTitle: String,
    priceBefore: String,
    priceAfter: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxWidth()
            .height(238.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 16.dp)
                .height(222.dp)
                .clip(RoundedCornerShape(16.dp))
                .background(White)
        )
        Column(
            modifier = Modifier
                .height(238.dp)
                .padding(horizontal = 8.dp)
                .padding(bottom = 8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            CardInfo(imageId, title, subTitle)

            Spacer(modifier = Modifier.weight(1f))

            PriceAndAddToCart(
                priceAfter = priceAfter,
                priceBefore = priceBefore
            )
        }
    }

    /*
    Column(
        modifier = modifier.height(290.dp)
    ) {
        Box(
            contentAlignment = Alignment.TopCenter
        ) {
            Image(
                painter = painterResource(imageId),
                contentDescription = null,
                modifier = Modifier.zIndex(1f)
            )
            Column(
                modifier = Modifier
                    .padding(top = 16.dp)
                    .clip(RoundedCornerShape(16.dp))
                    .fillMaxSize()
                    .background(White)
                    .padding(horizontal = 8.dp),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Spacer(modifier = Modifier.weight(1f))
                SpacerVertical8()

                SpacerVertical8()
            }
        }
    }

     */
}

@Composable
fun CardInfo(
    imageId: Int,
    title: String,
    subTitle: String
){
    Image(
        painter = painterResource(imageId),
        contentDescription = null,
        modifier = Modifier.size(92.dp, 100.dp)
    )

    SpacerVertical8()

    Text(
        modifier = Modifier.padding(horizontal = 12.dp),
        text = title,
        color = Black,
        fontFamily = IBM,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp,
        textAlign = TextAlign.Center
    )

    Text(
        modifier = Modifier.padding(horizontal = 0.dp),
        text = subTitle,
        color = Grey100,
        fontFamily = IBM,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        maxLines = 3,
        overflow = TextOverflow.Ellipsis,
        textAlign = TextAlign.Center
    )
}

@Composable
fun PriceAndAddToCart(
    priceAfter: String,
    priceBefore: String
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Row(
            modifier = Modifier
                .weight(1f)
                .height(30.dp)
                .clip(RoundedCornerShape(8.dp))
                .background(Primary200),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_money_bag),
                contentDescription = null,
                tint = Primary,
            )

            Spacer(modifier = Modifier.width(4.dp))
            if (priceBefore.isNotEmpty()) {
                Text(
                    modifier = Modifier.padding(horizontal = 2.dp),
                    text = priceBefore,
                    color = Primary,
                    fontSize = 12.sp,
                    fontFamily = IBM,
                    fontWeight = FontWeight.Medium,
                    style = TextStyle(textDecoration = TextDecoration.LineThrough)
                )
            }

            Text(
                text = "$priceAfter cheeses",
                color = Primary,
                fontSize = 12.sp,
                fontFamily = IBM,
                fontWeight = FontWeight.Medium,
            )

        }
        SpacerHorizontal8()
        Icon(
            painter = painterResource(R.drawable.ic_add_to_cart),
            contentDescription = null,
            tint = Primary,
            modifier = Modifier
                .size(30.dp)
                .border(width = 1.dp, color = Primary, shape = RoundedCornerShape(8.dp))
                .padding(7.dp)
        )
    }
}

@Composable
@Preview
fun TomCardPreview() {
    TomCard(
        imageId = R.drawable.sport_tom,
        title = "Sport Tom",
        subTitle = "sport tom",
        "5",
        "3"
    )
}