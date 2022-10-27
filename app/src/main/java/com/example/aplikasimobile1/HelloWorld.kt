package com.example.aplikasimobile1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class HelloWorld : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column() {
                Image(
                    painter = painterResource(id = R.drawable.himatel),
                    contentDescription = "Gambar"
                )
                Surface(
                    color = Color.White,
                    modifier = Modifier.fillMaxWidth()
                ){
                    Text(
                        text = "Hello World Activity",
                        fontSize = 24.sp,
                        modifier = Modifier.padding(16.dp, 16.dp, 16.dp, 4.dp),
                        color = Color.Blue
                    )
                }

                Text(
                    text = "Jalan tidak?",
                    modifier = Modifier.padding(16.dp, 0.dp, 16.dp, 4.dp),
                    color = Color.White
                )
            }

        }
    }
}

