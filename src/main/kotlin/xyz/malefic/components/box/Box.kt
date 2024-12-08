package xyz.malefic.components.box

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import java.io.InputStream
import xyz.malefic.theme.MaleficTheme
import xyz.malefic.theme.ThemeConfig

/**
 * A composable function that applies Material Theming and creates a themed Box with an applied
 * background color.
 *
 * @param colors The colors to be used in the Material Theme.
 * @param content The content to be displayed inside the Box.
 */
@Composable
fun MTBox(colors: Colors, content: @Composable BoxScope.() -> Unit) {
  MaterialTheme(colors = colors) { BackgroundBox { content() } }
}

/**
 * A composable function that applies Malefic Theming and creates a themed [Box] with an applied
 * background color.
 *
 * @param inputStream The [InputStream] containing the theme configuration for the Malefic Theme.
 * @param content The content to be displayed inside the [Box].
 */
@Composable
fun MaleficBox(inputStream: InputStream, content: @Composable BoxScope.() -> Unit) {
  MaleficTheme(inputStream) { BackgroundBox { content() } }
}

/**
 * A composable function that applies Malefic Theming and creates a themed [Box] with an applied
 * background color.
 *
 * @param themeConfig The [ThemeConfig] configuration for the Malefic Theme.
 * @param content The content to be displayed inside the [Box].
 */
@Composable
fun MaleficBox(themeConfig: ThemeConfig, content: @Composable BoxScope.() -> Unit) {
  MaleficTheme(themeConfig) { BackgroundBox { content() } }
}

/**
 * A composable function that creates a [Box] with a background color that fills the maximum size.
 *
 * @param content The content to be displayed inside the [Box].
 */
@Composable
fun BackgroundBox(content: @Composable BoxScope.() -> Unit) {
  Box(modifier = Modifier.fillMaxSize().background(colors.background)) { content() }
}
