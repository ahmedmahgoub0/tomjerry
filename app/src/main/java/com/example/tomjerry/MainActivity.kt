package com.example.tomjerry

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.tomjerry.screen.jerryStore.JerryStoreScreen
import com.example.tomjerry.screen.tomAccount.TomAccountScreen
import com.example.tomjerry.screen.tomKitchen.TomKitchenScreen
import com.example.tomjerry.ui.theme.PrimaryBackground

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold { paddingValues ->
                TomAccountScreen(modifier = Modifier.padding(paddingValues))
            }
        }
    }
}
