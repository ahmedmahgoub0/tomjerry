package com.example.tomjerry.screen.tomAccount

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.tomjerry.R
import com.example.tomjerry.composable.SpacerHorizontal8
import com.example.tomjerry.composable.SpacerVertical8
import com.example.tomjerry.ui.theme.Green
import com.example.tomjerry.ui.theme.Green200
import com.example.tomjerry.ui.theme.Green300
import com.example.tomjerry.ui.theme.Orange200
import com.example.tomjerry.ui.theme.Primary
import com.example.tomjerry.ui.theme.Red200
import com.example.tomjerry.ui.theme.Red700
import com.example.tomjerry.ui.theme.Yellow

@Composable
fun TomStatistics(){
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
            iconColor = Red700,
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
}