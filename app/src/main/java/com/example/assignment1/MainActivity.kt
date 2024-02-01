package com.example.assignment1

import android.graphics.ColorFilter
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.StrokeCap.Companion.Square
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.assignment1.ui.theme.Assignment1Theme
import com.example.assignment1.ContactInformation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Assignment1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFA1D993)
                ) {
                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            LogoNameTitle()
                            Spacer(modifier = Modifier.height(16.dp)) // Add spacing between LogoNameTitle and ContactInformation
                        }
                        Column(
                            modifier = Modifier.align(Alignment.BottomCenter),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            ContactInformation()
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun LogoImage(modifier: Modifier, width: Dp, height: Dp) {
    Image(
        painter = painterResource(id = R.drawable.brucema),
        contentDescription = null,
        modifier = modifier
            .size(width = width, height = height)
    )
}


@Composable
fun LogoNameTitle() {
    val imageWidth = 300.dp
    val imageHeight = 150.dp


    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        LogoImage(
            modifier = Modifier,
            width = imageWidth,
            height = imageHeight,
        )
        Text(
            text = "Bruce Ma",
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 10.dp)
        )
        Text(
            text = "Senior Supply Chain Manager",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = Color(0xFF12662A),
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}

@Composable
fun ContactInformation() {
    Column(
        modifier = Modifier.fillMaxWidth()
                           .offset(x = 100.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.Start,
    ) {
        ContactRow(R.drawable.phone, "368-996-3388")
        ContactRow(R.drawable.office, "228 Herron News")
        ContactRow(R.drawable.email, "k.ma787@mybvc.ca")
    }
}

@Composable
fun ContactRow(iconId: Int, text: String) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Image(
            painter = painterResource(id = iconId),
            contentDescription = null,
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = text,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF12662A),
            modifier = Modifier.padding(bottom = 10.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Assignment1Theme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = Color(0xFFA1D993)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    LogoNameTitle()
                    Spacer(modifier = Modifier.height(16.dp)) 
                }
                Column(
                    modifier = Modifier.align(Alignment.BottomCenter)
                ) {
                    ContactInformation()
                }
            }
        }
    }
}





