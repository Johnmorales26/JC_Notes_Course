package com.johndev.jc_notes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.johndev.jc_notes.ui.components.Fab
import com.johndev.jc_notes.ui.components.ToolbarNotes
import com.johndev.jc_notes.ui.theme.JC_NotesTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JC_NotesTheme {
                val scaffoldState = rememberScaffoldState()
                val scope = rememberCoroutineScope()
                // A surface container using the 'background' color from the theme
                Scaffold(
                    scaffoldState = scaffoldState,
                    topBar = { ToolbarNotes(stringResource(id = R.string.app_name)) },
                    modifier = Modifier.fillMaxSize(),
                    backgroundColor = MaterialTheme.colors.background,
                    floatingActionButton = {
                        Fab {
                            scope.launch {
                                scaffoldState.snackbarHostState
                                    .showSnackbar("Click in Fab")
                            }
                        }
                    },
                    content = {
                        
                    }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JC_NotesTheme {

    }
}