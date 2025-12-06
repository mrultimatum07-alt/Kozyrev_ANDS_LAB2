package com.timoninkozyrev.pixletter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.timoninkozyrev.pixletter.ui.theme.PixletterTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PixletterTheme {
                GreetingText(message = "Royal Decree!\n Dear yourName\nHis Majesty the King\nInvites you to a great feast!\nCome to the castle before sunset,\notherwise, you risk losing your head!",from ="From King Arthur",Modifier.padding(8.dp) )
            }
            }
        }
    }




@Preview(showBackground = true)
@Composable
fun RoyalInvitationPreview() {
    PixletterTheme {
        GreetingText(message = "Royal Decree!\n Dear yourName\nHis Majesty the King\nInvites you to a great feast!\nCome to the castle before sunset,\notherwise, you risk losing your head!",from ="From King Arthur" )
    }
}
@Composable
fun GreetingText(message: String,from:String, modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    )
    {

        Text(
            text = message,
            fontSize = 20.sp,
            lineHeight = 40.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 25.sp,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }

}