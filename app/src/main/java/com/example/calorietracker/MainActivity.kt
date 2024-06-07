package com.example.calorietracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.onboarding.presentation.welcome.WelcomeScreen
import com.plcoding.calorytracker.ui.theme.CalorieTrackerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalorieTrackerTheme {
                WelcomeScreen()
            }
        }
    }
}