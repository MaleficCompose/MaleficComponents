package xyz.malefic.compose.comps.box

import androidx.compose.foundation.layout.BoxScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import xyz.malefic.compose.theming.MaleficTheme
import java.io.InputStream

/**
 * A composable function that applies Malefic Theming and creates a themed [Box] with an applied
 * background color. This JVM-specific overload uses an InputStream for theme configuration.
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
