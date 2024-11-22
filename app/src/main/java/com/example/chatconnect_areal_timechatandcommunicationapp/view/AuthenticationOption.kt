package com.project.pradyotprakash.flashchat.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

private val Any.background: Color
    get() {}
private val MaterialTheme.colors: Any
    get() {}

/**
 * The authentication view which will give the user an option to choose between
 * login and register.
 */

@Composable
fun AuthenticationView(register: () -> Unit, login: () -> Unit) {
    Row {
        FlashChatTheme {
            /* A surface container using the 'background' color from the theme */
            Surface(color = MaterialTheme.colors.background) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Bottom
                ) {
                    Title(title = "⚡️ Chat Connect")
                    Buttons(title = "Register", onClick = register, backgroundColor = Color.Blue)
                    Buttons(title = "Login", onClick = login, backgroundColor = Color.Magenta)
                }
            }
        }
    }
}

@Composable
fun FlashChatTheme(content: () -> Unit) {

}
