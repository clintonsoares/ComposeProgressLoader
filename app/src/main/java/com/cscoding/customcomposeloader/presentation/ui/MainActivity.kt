package com.cscoding.customcomposeloader.presentation.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.cscoding.customcomposeloader.presentation.theme.ComposeProgressLoaderTheme
import com.cscoding.customcomposeloader.presentation.theme.OffWhite_Loading_Bg
import com.cscoding.customcomposeloader.presentation.ui.unindexedProgress.CascadingDotLoader
import com.cscoding.customcomposeloader.presentation.ui.unindexedProgress.CircularMotionLoader
import com.cscoding.customcomposeloader.utils.Constants

/**
 * Coded By: Clinton Soares
 * Date: 5/4/22
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeProgressLoaderTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    ComposeLoaderView()
                }
            }
        }
    }
}

@Composable
fun ComposeLoaderView(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(OffWhite_Loading_Bg),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CircularMotionLoader()
    }
}