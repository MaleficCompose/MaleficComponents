package xyz.malefic.compose.comps.text.typography

import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import xyz.malefic.compose.comps.text.typography.ColorType.OnBackground

/**
 * A composable function that displays a heading with H1 typography style.
 *
 * @param text The text to be displayed.
 * @param modifier The modifier to be applied to the Text composable.
 * @param colorType The color type to be used for the text.
 */
@Composable
fun Heading1(
    text: String,
    modifier: Modifier = Modifier,
    colorType: ColorType = OnBackground,
) = Text(
    text = text,
    style = typography.h1,
    color = colorType.color,
    modifier = modifier,
)

/**
 * A composable function that displays a heading with H2 typography style.
 *
 * @param text The text to be displayed.
 * @param modifier The modifier to be applied to the Text composable.
 * @param colorType The color type to be used for the text.
 */
@Composable
fun Heading2(
    text: String,
    modifier: Modifier = Modifier,
    colorType: ColorType = OnBackground,
) = Text(
    text = text,
    style = typography.h2,
    color = colorType.color,
    modifier = modifier,
)

/**
 * A composable function that displays a heading with H3 typography style.
 *
 * @param text The text to be displayed.
 * @param modifier The modifier to be applied to the Text composable.
 * @param colorType The color type to be used for the text.
 */
@Composable
fun Heading3(
    text: String,
    modifier: Modifier = Modifier,
    colorType: ColorType = OnBackground,
) = Text(
    text = text,
    style = typography.h3,
    color = colorType.color,
    modifier = modifier,
)

/**
 * A composable function that displays a heading with H4 typography style.
 *
 * @param text The text to be displayed.
 * @param modifier The modifier to be applied to the Text composable.
 * @param colorType The color type to be used for the text.
 */
@Composable
fun Heading4(
    text: String,
    modifier: Modifier = Modifier,
    colorType: ColorType = OnBackground,
) = Text(
    text = text,
    style = typography.h4,
    color = colorType.color,
    modifier = modifier,
)

/**
 * A composable function that displays a heading with H5 typography style.
 *
 * @param text The text to be displayed.
 * @param modifier The modifier to be applied to the Text composable.
 * @param colorType The color type to be used for the text.
 */
@Composable
fun Heading5(
    text: String,
    modifier: Modifier = Modifier,
    colorType: ColorType = OnBackground,
) = Text(
    text = text,
    style = typography.h5,
    color = colorType.color,
    modifier = modifier,
)

/**
 * A composable function that displays a heading with H6 typography style.
 *
 * @param text The text to be displayed.
 * @param modifier The modifier to be applied to the Text composable.
 * @param colorType The color type to be used for the text.
 */
@Composable
fun Heading6(
    text: String,
    modifier: Modifier = Modifier,
    colorType: ColorType = OnBackground,
) = Text(
    text = text,
    style = typography.h6,
    color = colorType.color,
    modifier = modifier,
)

/**
 * A composable function that displays a body text with Body1 typography style.
 *
 * @param text The text to be displayed.
 * @param modifier The modifier to be applied to the Text composable.
 * @param colorType The color type to be used for the text.
 */
@Composable
fun Body1(
    text: String,
    modifier: Modifier = Modifier,
    colorType: ColorType = OnBackground,
) = Text(
    text = text,
    style = typography.body1,
    color = colorType.color,
    modifier = modifier,
)

/**
 * A composable function that displays a body text with Body2 typography style.
 *
 * @param text The text to be displayed.
 * @param modifier The modifier to be applied to the Text composable.
 * @param colorType The color type to be used for the text.
 */
@Composable
fun Body2(
    text: String,
    modifier: Modifier = Modifier,
    colorType: ColorType = OnBackground,
) = Text(
    text = text,
    style = typography.body2,
    color = colorType.color,
    modifier = modifier,
)
