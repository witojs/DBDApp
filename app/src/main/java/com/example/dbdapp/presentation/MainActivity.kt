package com.example.dbdapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.dbdapp.ui.theme.DBDAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DBDAppTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    DBDApp()
                }
            }
        }
    }
}

