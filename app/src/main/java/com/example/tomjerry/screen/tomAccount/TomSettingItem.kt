package com.example.tomjerry.screen.tomAccount

import androidx.compose.foundation.background
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
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomjerry.composable.SpacerHorizontal8
import com.example.tomjerry.composable.SpacerVertical12
import com.example.tomjerry.composable.SpacerVertical8
import com.example.tomjerry.ui.theme.Black
import com.example.tomjerry.ui.theme.Black87
import com.example.tomjerry.ui.theme.IBM

@Composable
fun TomSettingItem(
    iconId: Int,
    text: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(iconId),
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
            text = text,
            fontFamily = IBM,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            lineHeight = 16.sp,
            color = Black87
        )
    }
}

@Composable
fun TomSettingsSection(
    title: String,
    itemsList: Map<Int, String>
) {
    Column {
        Text(
            modifier = Modifier.padding(horizontal = 16.dp),
            text = title,
            fontFamily = IBM,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            lineHeight = 16.sp,
            color = Black87
        )

        SpacerVertical8()
        itemsList.entries.forEach { entry ->
            TomSettingItem(entry.key, entry.value)
            SpacerVertical12()
        }
    }
}
