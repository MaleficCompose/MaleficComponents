package xyz.malefic.compose.comps.box

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import xyz.malefic.compose.theming.MaleficTheme
import xyz.malefic.compose.theming.ThemeConfig
import java.io.InputStream

/**
 * A composable function that applies Material Theming and creates a themed [Box] with an applied
 * background color.
 *
 * @param colors The colors to be used in the Material Theme.
 * @param modifier The [Modifier] to be applied to the [Box].
 * @param contentAlignment The [Alignment] of the content inside the [Box].
 * @param propagateMinConstraints Whether the minimum constraints should be propagated.
 * @param content The content to be displayed inside the [Box].
 */
@Composable
fun MaterialBox(
    colors: Colors,
    modifier: Modifier = Modifier,
    contentAlignment: Alignment = Alignment.TopStart,
    propagateMinConstraints: Boolean = false,
    content: @Composable BoxScope.() -> Unit,
) {
    MaterialTheme(colors = colors) {
        BackgroundBox(modifier, contentAlignment, propagateMinConstraints) { content() }
    }
}

/**
 * A composable function that applies Malefic Theming and creates a themed [Box] with an applied
 * background color.
 *
 * @param inputStream The [InputStream] containing the theme configuration for the Malefic Theme.
 * @param modifier The [Modifier] to be applied to the [Box].
 * @param contentAlignment The [Alignment] of the content inside the [Box].
 * @param propagateMinConstraints Whether the minimum constraints should be propagated.
 * @param content The content to be displayed inside the [Box].
 */
@Composable
fun MaleficBox(
    inputStream: InputStream,
    modifier: Modifier = Modifier,
    contentAlignment: Alignment = Alignment.TopStart,
    propagateMinConstraints: Boolean = false,
    content: @Composable BoxScope.() -> Unit,
) {
    MaleficTheme(inputStream) {
        BackgroundBox(modifier, contentAlignment, propagateMinConstraints) { content() }
    }
}

/**
 * A composable function that applies Malefic Theming and creates a themed [Box] with an applied
 * background color.
 *
 * @param themeConfig The [ThemeConfig] configuration for the Malefic Theme.
 * @param modifier The [Modifier] to be applied to the [Box].
 * @param contentAlignment The [Alignment] of the content inside the [Box].
 * @param propagateMinConstraints Whether the minimum constraints should be propagated.
 * @param content The content to be displayed inside the [Box].
 */
@Composable
fun MaleficBox(
    themeConfig: ThemeConfig,
    modifier: Modifier = Modifier,
    contentAlignment: Alignment = Alignment.TopStart,
    propagateMinConstraints: Boolean = false,
    content: @Composable BoxScope.() -> Unit,
) {
    MaleficTheme(themeConfig) {
        BackgroundBox(modifier, contentAlignment, propagateMinConstraints) { content() }
    }
}

/**
 * A composable function that creates a [Box] with a background color that fills the maximum size.
 *
 * @param modifier The [Modifier] to be applied to the [Box].
 * @param contentAlignment The [Alignment] of the content inside the [Box].
 * @param propagateMinConstraints Whether the minimum constraints should be propagated.
 * @param content The content to be displayed inside the [Box].
 */
@Composable
fun BackgroundBox(
    modifier: Modifier = Modifier,
    contentAlignment: Alignment = Alignment.TopStart,
    propagateMinConstraints: Boolean = false,
    content: @Composable BoxScope.() -> Unit,
) {
    Box(
        modifier = Modifier.fillMaxSize().background(colors.background).then(modifier),
        contentAlignment,
        propagateMinConstraints,
    ) {
        content()
    }
}
