package com.dev.maxyablochkin.jetgame.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.dev.maxyablochkin.jetgame.presentation.navigation.AppNavHost
import com.dev.maxyablochkin.jetgame.presentation.theme.JetGameTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetGameTheme {
                Surface(modifier = Modifier.Companion.fillMaxSize()) {
                    AppNavHost()
                }
            }
        }
    }
}