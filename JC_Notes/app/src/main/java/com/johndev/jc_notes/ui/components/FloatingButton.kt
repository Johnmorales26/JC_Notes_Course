package com.johndev.jc_notes.ui.components

import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.johndev.jc_notes.R

@Composable
fun Fab(onFabAction: () -> Unit) {
    FloatingActionButton(onClick = { onFabAction() }) {
        Icon(contentDescription = null, painter = painterResource(id = R.drawable.ic_add) )
    }
}