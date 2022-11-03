package com.example.aplikasimobile1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.aplikasimobile1.data.ListMotivation
import com.example.aplikasimobile1.model.Motivation

class MotivationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MotivationApps(listMotivation = ListMotivation().loadMotivation())
        }
    }
}

@Composable
fun MotivationApps(listMotivation: List<Motivation>) {

//    Column() {
//        listMotivation.forEach{
//            motivation -> MotivationCard(motivation)
//        }
//    }
    LazyColumn {
        items(listMotivation) { motivation ->
            MotivationCard(motivation)
        }
    }
}

@Composable
fun MotivationCard(motivation: Motivation){
    Card(
        elevation = 8.dp,
        modifier = Modifier.padding(8.dp)) {
        Column() {
            Image(
                painter = painterResource(id = motivation.imageResourceId),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = stringResource(id = motivation.textResourceId),
                modifier = Modifier.padding(8.dp),
                style = MaterialTheme.typography.h6,

            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun MotivationCardPreview(){
    MotivationApps(listMotivation = ListMotivation().loadMotivation())
}
