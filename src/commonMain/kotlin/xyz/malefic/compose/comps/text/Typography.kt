package xyz.malefic.compose.comps.text

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

/**
 * Enum class representing different typography sizes.
 */
enum class TypographySize {
    Large, // Represents a large typography size.
    Medium, // Represents a medium typography size.
    Small, // Represents a small typography size.
}

/**
 * A composable function that displays a label with a specific typography style.
 *
 * @param text The text to be displayed.
 * @param typographySize The size of the typography to be used. Defaults to [TypographySize.Medium].
 * @param modifier The modifier to be applied to the Text composable. Defaults to [Modifier].
 * @param color The color to be used for the text. Defaults to the `MaterialTheme.colorScheme.onBackground`.
 */
@Composable
fun Label(
    text: String,
    typographySize: TypographySize = TypographySize.Medium,
    color: Color = MaterialTheme.colorScheme.onBackground,
    modifier: Modifier = Modifier,
) = Text(
    text = text,
    style =
        when (typographySize) {
            TypographySize.Large -> typography.labelLarge
            TypographySize.Medium -> typography.labelMedium
            TypographySize.Small -> typography.labelSmall
        },
    color = color,
    modifier = modifier,
)

/**
 * A composable function that displays a headline with a specific typography style.
 *
 * @param text The text to be displayed.
 * @param typographySize The size of the typography to be used. Defaults to [TypographySize.Medium].
 * @param modifier The modifier to be applied to the Text composable. Defaults to [Modifier].
 * @param color The color to be used for the text. Defaults to `MaterialTheme.colorScheme.onBackground`.
 */
@Composable
fun Headline(
    text: String,
    typographySize: TypographySize = TypographySize.Medium,
    color: Color = MaterialTheme.colorScheme.onBackground,
    modifier: Modifier = Modifier,
) = Text(
    text = text,
    style =
        when (typographySize) {
            TypographySize.Large -> typography.headlineLarge
            TypographySize.Medium -> typography.headlineMedium
            TypographySize.Small -> typography.headlineSmall
        },
    color = color,
    modifier = modifier,
)

/**
 * A composable function that displays body text with a specific typography style.
 *
 * @param text The text to be displayed.
 * @param typographySize The size of the typography to be used. Defaults to [TypographySize.Medium].
 * @param modifier The modifier to be applied to the Text composable. Defaults to [Modifier].
 * @param color The color to be used for the text. Defaults to `MaterialTheme.colorScheme.onBackground`.
 */
@Composable
fun Body(
    text: String,
    typographySize: TypographySize = TypographySize.Medium,
    color: Color = MaterialTheme.colorScheme.onBackground,
    modifier: Modifier = Modifier,
) = Text(
    text = text,
    style =
        when (typographySize) {
            TypographySize.Large -> typography.bodyLarge
            TypographySize.Medium -> typography.bodyMedium
            TypographySize.Small -> typography.bodySmall
        },
    color = color,
    modifier = modifier,
)
