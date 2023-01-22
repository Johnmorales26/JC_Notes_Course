package com.johndev.jc_notes.ui.components

import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.johndev.jc_notes.R

@Composable
fun ToolbarNotes(titleRes: String) {
    TopAppBar(
        title = {
            Text(
                text = titleRes
            )
        }
    )
}