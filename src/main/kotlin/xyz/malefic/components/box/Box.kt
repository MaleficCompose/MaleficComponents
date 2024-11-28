package xyz.malefic.components.box

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * A composable function that applies Material Theming and creates a themed Box with an applied background color.
 *
 * @param colors The colors to be used in the Material Theme.
 * @param stuff The content to be displayed inside the Box.
 */
@Composable
fun MTBox(colors: Colors, stuff: @Composable BoxScope.() -> Unit) {
  MaterialTheme(colors = colors) {
    Box(modifier = Modifier.background(MaterialTheme.colors.background), content = stuff)
  }
}
