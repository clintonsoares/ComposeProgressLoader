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
import androidx.compose.ui.tooling.preview.Preview
import com.cscoding.customcomposeloader.presentation.theme.ComposeProgressLoaderTheme
import com.cscoding.customcomposeloader.presentation.theme.OffWhite_Loading_Bg
import com.cscoding.customcomposeloader.presentation.ui.unindexedProgress.CirclesLoader
import com.cscoding.customcomposeloader.utils.Constants

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeProgressLoaderTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    ComposeLoaderView(Constants.CIRCLES_LOADER)
                }
            }
        }
    }
}

@Composable
fun ComposeLoaderView(loaderType: Int){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(OffWhite_Loading_Bg),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        when(loaderType){
            Constants.CIRCLES_LOADER -> {
                CirclesLoader()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeProgressLoaderTheme {
        CirclesLoader()
    }
}