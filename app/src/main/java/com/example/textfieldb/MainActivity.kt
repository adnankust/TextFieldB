package com.example.textfieldb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.textfieldb.ui.theme.TextFieldBTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextFieldBTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TextFieldRootView()
                }
            }
        }
    }
}

@Composable
fun SimpleTextField() {
    var text by remember {(mutableStateOf(""))}
    TextField(value = text, onValueChange = { newText -> text = newText })
}

@Composable
fun TextFieldRootView() {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        SimpleTextField()
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TextFieldBTheme {
        TextFieldRootView()
    }
}