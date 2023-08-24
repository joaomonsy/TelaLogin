package com.example.logintela

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.logintela.ui.theme.LoginTelaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App()
        }
    }
}

@Composable
fun App(){
    LoginTelaTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            SimpleCenterAlignedTopAppBar()
            Column (
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                SimpleOutlinedTextFieldSample()
                SimpleOutlinedTextFieldSample2()
                SimpleOutlinedTextFieldSample3()
                SimpleOutlinedTextFieldSample4()
                ButtonSample()
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 250, heightDp = 250)
@Composable
fun AppPreview() {
    App()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleCenterAlignedTopAppBar() {
    Scaffold(
        modifier = Modifier.height(50.dp),

        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        "LOGIN",
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(
                            imageVector = Icons.Filled.Menu,
                            contentDescription = "Localized description"
                        )
                    }
                },
                actions = {
                    IconButton(onClick = { /* doSomething() */ }) {
                        Icon(
                            imageVector = Icons.Filled.AccountBox,
                            contentDescription = "Localized description"
                        )
                    }
                }
            )
        },
        content = { innerPadding ->
            LazyColumn(
                contentPadding = innerPadding,
                verticalArrangement = Arrangement.spacedBy(1.dp)
            ) {
            }
        }
    )
}

@Preview(showBackground = true, widthDp = 250, heightDp = 250)
@Composable
fun SimpleCenterAlignedTopAppBarTheme() {
    SimpleCenterAlignedTopAppBar()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleOutlinedTextFieldSample() {
    var text by rememberSaveable { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Usuário") }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleOutlinedTextFieldSample2() {
    var text2 by rememberSaveable { mutableStateOf("") }

    OutlinedTextField(
        value = text2,
        onValueChange = { text2 = it },
        label = { Text("Email") }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleOutlinedTextFieldSample3() {
    var text3 by rememberSaveable { mutableStateOf("") }

    OutlinedTextField(
        value = text3,
        onValueChange = { text3 = it },
        label = { Text("Senha") }
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SimpleOutlinedTextFieldSample4() {
    var text4 by rememberSaveable { mutableStateOf("") }

    OutlinedTextField(
        value = text4,
        onValueChange = { text4 = it },
        label = { Text("Confirmar senha") }
    )
}

@Preview(showBackground = true)
@Composable
fun simpleOutlinedTextFieldSamplePreview() {
    LoginTelaTheme {
        SimpleOutlinedTextFieldSample2()
    }
}

@Composable
fun ButtonSample(

) {
    Button(onClick = { /* Do something! */ },
        modifier = Modifier.fillMaxWidth(0.5f)) { Text("Entrar") }
}

@Preview(showBackground = true)
@Composable
fun ButtonSamplePreview() {
    LoginTelaTheme {
        ButtonSample()
    }
}