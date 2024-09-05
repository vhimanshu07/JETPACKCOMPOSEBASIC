package com.example.jetpackcomposebasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposebasic.ui.theme.JETPACKCOMPOSEBASICTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /**
         *
         * Step1
         * In XML we used to do setContentView(activity_main.xml)
         * But now we do setContent
         *
         */
        setContent {

            JETPACKCOMPOSEBASICTheme {
                Row(
                    modifier = Modifier
                        .padding(all = 8.dp)
                        .background(Color.Cyan)
                ) {
                    Image(
                        contentScale = ContentScale.Fit,
                        contentDescription = "This is description",
                        alignment = Alignment.BottomCenter,
                        painter = painterResource(id = R.drawable.alert_2),
                        modifier = Modifier
                            .size(80.dp)
                            .clip(CircleShape)
                            .align(Alignment.CenterVertically)


                    )
                    Spacer(modifier = Modifier.width(20.dp))
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(0.7f)
                            .background(Color.Green)
                            .border(5.dp, Color.Magenta)
                            .padding(5.dp)
                            .border(5.dp, Color.DarkGray)
                            .padding(10.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        Greeting("Android")
                        Greeting("Ioecc")
                        Text(
                            "Hello Jack", modifier = Modifier
                                .border(5.dp, Color.Yellow)
                                .offset(20.dp, 20.dp)
                                .padding(5.dp)
                                .border(5.dp, Color.Black)
                                .padding(10.dp)
                        )
                    }
                }

            }
        }

    }

    /**
     *
     *
     *   .fillMaxSize(0.7f)  -> it solves the problem of setting up
     *   the view at 45% of whole screen previously we used to do it
     *   using GuideLines but now we just have to write it and the work is done
     *
     *   .fillMaxHeight(0.7f) -> It can set the height to a fractional
     *   scale.
     *
     *   .requiredWidth(100.dp) -> If this width is out of the app's width
     *   it would still take the whole 100dp and data may not be visible
     *   .offset(20.dp, 20.dp) -> It is shifting the text to specific position
     *   to current + 20dp in x and y axis.
     *   Row
     *   Column
     *   horizontalAlignment, VerticalArrangement
     *
     *   These are important
     *
     */


    @Composable
    fun Greeting(name: String) {
        Text(text = "Hello $name!")
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        JETPACKCOMPOSEBASICTheme {
            Row(
                modifier = Modifier
                    .padding(all = 8.dp)
                    .background(Color.Cyan)

            ) {
                Image(
                    contentScale = ContentScale.Fit,
                    contentDescription = "This is description",
                    alignment = Alignment.BottomCenter,
                    painter = painterResource(id = R.drawable.alert_2),
                    modifier = Modifier
                        .size(80.dp)
                        .clip(CircleShape)
                        .align(Alignment.CenterVertically)

                )
                Spacer(modifier = Modifier.width(20.dp))
                Column(
                    modifier = Modifier
                        .width(100.dp)
                        .fillMaxHeight(0.7f)
                        .background(Color.Green)
                        .border(5.dp, Color.Magenta)
                        .padding(5.dp)
                        .border(5.dp, Color.DarkGray)
                        .padding(10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
                    Greeting("Android")
                    Greeting("Ioecc")
                    Text(
                        "Hello Jack", modifier = Modifier
                            .border(5.dp, Color.Yellow)
                            .offset(20.dp, 20.dp)
                            .padding(5.dp)
                            .border(5.dp, Color.Black)
                            .padding(10.dp)
                    )
                }
            }

        }
    }
}