package xyz.malefic.compose.comps.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape

/**
 * A composable function that displays a standard Material [Button] with common defaults.
 *
 * @param text The text to display on the button.
 * @param onClick Callback to be invoked when the button is clicked.
 * @param modifier The [Modifier] to be applied to the button.
 * @param enabled Whether the button is enabled or disabled.
 */
@Composable
fun PrimaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
    ) {
        Text(text)
    }
}

/**
 * A composable function that displays a Material [Button] with custom content.
 *
 * @param onClick Callback to be invoked when the button is clicked.
 * @param modifier The [Modifier] to be applied to the button.
 * @param enabled Whether the button is enabled or disabled.
 * @param interactionSource The [MutableInteractionSource] representing the stream of interactions.
 * @param elevation The elevation of the button.
 * @param shape The shape of the button.
 * @param border The border to draw around the button.
 * @param colors The colors to use for the button.
 * @param contentPadding The spacing values to apply internally between the container and the content.
 * @param content The content to be displayed inside the button.
 */
@Composable
fun CustomButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    elevation: androidx.compose.material.ButtonElevation? = ButtonDefaults.elevation(),
    shape: Shape = androidx.compose.material.MaterialTheme.shapes.small,
    border: BorderStroke? = null,
    colors: androidx.compose.material.ButtonColors = ButtonDefaults.buttonColors(),
    contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
    content: @Composable RowScope.() -> Unit,
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        interactionSource = interactionSource,
        elevation = elevation,
        shape = shape,
        border = border,
        colors = colors,
        contentPadding = contentPadding,
        content = content,
    )
}

/**
 * A composable function that displays an outlined Material [OutlinedButton] with common defaults.
 *
 * @param text The text to display on the button.
 * @param onClick Callback to be invoked when the button is clicked.
 * @param modifier The [Modifier] to be applied to the button.
 * @param enabled Whether the button is enabled or disabled.
 */
@Composable
fun SecondaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
    ) {
        Text(text)
    }
}

/**
 * A composable function that displays a text-only Material [TextButton] with common defaults.
 *
 * @param text The text to display on the button.
 * @param onClick Callback to be invoked when the button is clicked.
 * @param modifier The [Modifier] to be applied to the button.
 * @param enabled Whether the button is enabled or disabled.
 */
@Composable
fun TertiaryButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
) {
    TextButton(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
    ) {
        Text(text)
    }
}
