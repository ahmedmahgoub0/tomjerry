package com.example.tomjerry.screen.jerryStore

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.R
import com.example.tomjerry.ui.theme.Black
import com.example.tomjerry.ui.theme.Grey
import com.example.tomjerry.ui.theme.IBM
import com.example.tomjerry.ui.theme.Primary

@Composable
fun TopBar(
    modifier: Modifier = Modifier,
    onNotificationClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.jerry_sea),
            contentDescription = null,
            modifier = Modifier
                .size(48.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(
                text = "Hi, Jerry \uD83D\uDC4B\uD83C\uDFFB",
                color = Black,
                fontFamily = IBM,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp
            )
            Text(
                text = "Which Tom do you want to buy?",
                color = Grey,
                fontFamily = IBM,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        Box(
            modifier = Modifier.size(42.dp),
            contentAlignment = Alignment.TopEnd
        ) {
            Box(
                modifier = Modifier
                    .padding(top = 4.dp)
                    .size(40.dp)
                    .clip( RoundedCornerShape(12.dp))
                    .border(1.dp, Black.copy(alpha = 0.15f), RoundedCornerShape(12.dp))
                    .clickable { onNotificationClick() },
                contentAlignment = Alignment.Center
            ) {
                Image(
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_notification),
                    contentDescription = null
                )
            }

            Box(
                modifier = Modifier
                    .offset(x = 1.dp)
                    .size(14.dp)
                    .clip(CircleShape)
                    .background(Primary),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "3",
                    color = White,
                    fontFamily = IBM,
                    fontWeight = FontWeight.Medium,
                    fontSize = 10.sp
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun TopBarPreview() {
    TopBar(onNotificationClick = { })
}
