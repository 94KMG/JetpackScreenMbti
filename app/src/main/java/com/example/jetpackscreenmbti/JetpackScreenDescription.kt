package com.example.jetpackscreenmbti

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MovableContent
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import com.example.jetpackscreenmbti.ui.theme.JetpackScreenMbtiTheme

class JetpackScreenDescription : ComponentActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
           JetpackScreenMbtiTheme {

               Image(painter = painterResource(id = R.drawable.infp), contentDescription = "infp")
               Image(painter = painterResource(id = R.drawable.istp), contentDescription = "istp")
               Image(painter = painterResource(id = R.drawable.entj), contentDescription = "entj")
           }
        }
    }
}
