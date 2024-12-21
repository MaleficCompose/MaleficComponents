package xyz.malefic.compose.comps.text.typography

import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * A composable function that displays a heading with H1 typography style.
 *
 * @param text The text to be displayed.
 * @param modifier The modifier to be applied to the Text composable.
 */
@Composable
fun Heading1(
    text: String,
    modifier: Modifier = Modifier,
) = Text(
    text = text,
    style = typography.h1,
    color = MaterialTheme.colors.onBackground,
    modifier = modifier,
)

/**
 * A composable function that displays a heading with H2 typography style.
 *
 * @param text The text to be displayed.
 * @param modifier The modifier to be applied to the Text composable.
 */
@Composable
fun Heading2(
    text: String,
    modifier: Modifier = Modifier,
) = Text(
    text = text,
    style = typography.h2,
    color = MaterialTheme.colors.onBackground,
    modifier = modifier,
)

/**
 * A composable function that displays a heading with H3 typography style.
 *
 * @param text The text to be displayed.
 * @param modifier The modifier to be applied to the Text composable.
 */
@Composable
fun Heading3(
    text: String,
    modifier: Modifier = Modifier,
) = Text(
    text = text,
    style = typography.h3,
    color = MaterialTheme.colors.onBackground,
    modifier = modifier,
)

/**
 * A composable function that displays a heading with H4 typography style.
 *
 * @param text The text to be displayed.
 * @param modifier The modifier to be applied to the Text composable.
 */
@Composable
fun Heading4(
    text: String,
    modifier: Modifier = Modifier,
) = Text(
    text = text,
    style = typography.h4,
    color = MaterialTheme.colors.onBackground,
    modifier = modifier,
)

/**
 * A composable function that displays a heading with H5 typography style.
 *
 * @param text The text to be displayed.
 * @param modifier The modifier to be applied to the Text composable.
 */
@Composable
fun Heading5(
    text: String,
    modifier: Modifier = Modifier,
) = Text(
    text = text,
    style = typography.h5,
    color = MaterialTheme.colors.onBackground,
    modifier = modifier,
)

/**
 * A composable function that displays a heading with H6 typography style.
 *
 * @param text The text to be displayed.
 * @param modifier The modifier to be applied to the Text composable.
 */
@Composable
fun Heading6(
    text: String,
    modifier: Modifier = Modifier,
) = Text(
    text = text,
    style = typography.h6,
    color = MaterialTheme.colors.onBackground,
    modifier = modifier,
)

/**
 * A composable function that displays a body text with Body1 typography style.
 *
 * @param text The text to be displayed.
 * @param modifier The modifier to be applied to the Text composable.
 */
@Composable
fun Body1(
    text: String,
    modifier: Modifier = Modifier,
) = Text(
    text = text,
    style = typography.body1,
    color = MaterialTheme.colors.onBackground,
    modifier = modifier,
)

/**
 * A composable function that displays a body text with Body2 typography style.
 *
 * @param text The text to be displayed.
 * @param modifier The modifier to be applied to the Text composable.
 */
@Composable
fun Body2(
    text: String,
    modifier: Modifier = Modifier,
) = Text(
    text = text,
    style = typography.body2,
    color = MaterialTheme.colors.onBackground,
    modifier = modifier,
)
