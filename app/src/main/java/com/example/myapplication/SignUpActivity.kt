package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout


class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        enableEdgeToEdge()
        setContent{

            SignUp()

        }
    }

    @Preview
    @Composable
    private fun SignUp() {

        LazyColumn(modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.blue))){
            item{
                Text(
                    text="Hello....",
                    color = Color.White,
                    fontSize = 87.sp,
                    modifier = Modifier.padding(top=48.dp,start=24.dp),
                    fontFamily = FontFamily(Font(R.font.freescript, FontWeight.Normal))

                )
            }

            item{
                var text by rememberSaveable { mutableStateOf("") }

                TextField(
                    value = text,
                    onValueChange = {
                        text=it
                    },

                    label = { Text("Name",color = Color.White) },

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
                var text by rememberSaveable { mutableStateOf("") }

                TextField(
                    value = text,
                    onValueChange = {
                        text=it
                    },

                    label = { Text("Email",color = Color.White) },

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
                var text by rememberSaveable { mutableStateOf("") }

                TextField(
                    value = text,
                    onValueChange = {
                        text=it
                    },

                    label = { Text("Mobile",color = Color.White) },

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
                var text by rememberSaveable { mutableStateOf("") }

                TextField(
                    value = text,
                    onValueChange = {
                        text=it
                    },

                    label = { Text("Password",color = Color.White) },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),

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
                var text by rememberSaveable { mutableStateOf("") }

                TextField(
                    value = text,
                    onValueChange = {
                        text=it
                    },

                    label = { Text("RePassword",color = Color.White) },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
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


            item {
                Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center){
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = colorResource(R.color.orange)
                        ),
                        modifier = Modifier
                            .width(165.dp)
                            .padding(top = 32.dp, bottom = 10.dp)
                            .height(55.dp),
                        shape = RoundedCornerShape(100.dp)
                    ){

                        Text(
                            "Sign Up",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            textAlign = TextAlign.Center,
                            color  = Color.White
                        )



                    }
                }



            }

            item{

              ConstraintLayout(
                  modifier = Modifier
                      .padding(top=36.dp)
              ){
                  val (circleRight,circleLeft,centerText) = createRefs()

                  Text(modifier = Modifier
                      .fillMaxWidth()
                      .constrainAs(centerText) {
                          centerTo(parent)
                      },
                      text="Already have an account? Login",
                      textAlign = TextAlign.Center,
                      color = Color.White,
                      fontSize = 14.sp,


                      )


                  Image(painter = painterResource(id = R.drawable.circle_bottom_left),contentDescription = null,
                      modifier = Modifier
                          .constrainAs(circleLeft){
                              bottom.linkTo(parent.bottom)
                              start.linkTo(parent.start)
                          })



                  Image(painter = painterResource(id = R.drawable.circle_bottom_right),contentDescription = null,
                      modifier = Modifier
                          .constrainAs(circleRight){
                              bottom.linkTo(parent.bottom)
                              end.linkTo(parent.end)
                          })
                  

              }
            }




        }
     }


}