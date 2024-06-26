package com.example.jetpackscreenmbti

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackscreenmbti.ui.theme.JetpackScreenMbtiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackScreenMbtiTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen() {
    Row {

        ScreenButtons()

    }
    
}

@Composable
fun ScreenButtons(){

    val context = LocalContext.current
    Button(onClick = {
        val intent1 = Intent(context, JetpackScreenDescription::class.java)
        intent1.putExtra("mbti1","infp")
        context.startActivity(intent1)
    }) {
        Text(text = "infp")
    }
    Button(onClick = {
        val intent2 = Intent(context, JetpackScreenDescription::class.java)
        intent2.putExtra("mbti2","istp")
        context.startActivity(intent2)
    }) {
        Text(text = "istp")
    }
    Button(onClick = {
        val intent3 = Intent(context, JetpackScreenDescription::class.java)
        intent3.putExtra("mbti3","entj")
        context.startActivity(intent3)
    }) {
        Text(text = "entj")
    }

}

