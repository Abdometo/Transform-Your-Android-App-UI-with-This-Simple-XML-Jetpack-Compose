package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.platform.ComposeView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent{

            LoginUI()

        }


    }

    @Preview
    @Composable
    fun LoginUI(){

        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.blue))
        ){
            item {
                Image(painter = painterResource(R.drawable.top),contentDescription = "")
            }


            // Welcome Back Text
            item{
                Text(
                    text="Welcome\nBack",
                    color = Color.White,
                    fontSize = 87.sp,
                    lineHeight = (87-8).sp,
                    modifier = Modifier.padding(start=24.dp),
                    fontFamily = FontFamily(Font(R.font.freescript, FontWeight.Normal))

                )
            }


            // Edit Text Email
            item{
                var text by rememberSaveable { mutableStateOf("") }

                TextField(
                    value = text,
                    onValueChange = {
                        text=it
                    },

                    label = { Text("example@gmail.com",color = Color.White)},

                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent,
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp, start = 24.dp, end = 24.dp)
                        .background(
                            colorResource(R.color.blue_white),
                            shape = RoundedCornerShape(100.dp)
                        )


                )
            }

            // Edit Text Password
            item{
                var text by rememberSaveable { mutableStateOf("") }

                TextField(
                    value = text,
                    onValueChange = {
                        text=it
                    },

                    label = { Text("Type your password",color = Color.White)},

                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Transparent,
                        unfocusedBorderColor = Color.Transparent,
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 32.dp, start = 24.dp, end = 24.dp)
                        .background(
                            colorResource(R.color.blue_white),
                            shape = RoundedCornerShape(100.dp)
                        )


                )
            }


            item{
                Text(
                    "Forget Your Passowrd ? Recovery it",
                    fontSize = 14.sp,
                    modifier = Modifier
                        .padding(top = 24.dp)
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    color = Color.White
                )
            }



            // Login Button
            item {
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = colorResource(R.color.orange)
                        ),
                        modifier = Modifier
                            .width(165.dp)
                            .padding(top=32.dp,bottom=10.dp)
                            .height(55.dp),
                        shape = RoundedCornerShape(100.dp)
                    ){

                        Text(
                            "Login",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                            color  = Color.White
                        )



                    }
                }



            }
            //................................................//


            // New User Sign Up ?? Text
            item{

                Text(
                    "New User? SignUp",
                    fontSize = 14.sp,
                    modifier = Modifier
                        .padding(top=24.dp)
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    color  = Color.White
                )
            }
        }

    }
}