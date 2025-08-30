package xyz.malefic.compose.comps.input

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.VisualTransformation

/**
 * A composable function that displays a standard Material [TextField] with common defaults.
 *
 * @param value The current text value of the text field.
 * @param onValueChange Callback triggered when the text value changes.
 * @param modifier The [Modifier] to be applied to the text field.
 * @param label Optional label to be displayed inside the text field.
 * @param placeholder Optional placeholder text to be displayed when the field is empty.
 * @param enabled Whether the text field is enabled or disabled.
 * @param readOnly Whether the text field is read-only.
 * @param isError Whether the text field should show an error state.
 * @param visualTransformation The visual transformation to apply to the text (e.g., password masking).
 * @param keyboardOptions Keyboard options for the text field.
 * @param keyboardActions Keyboard actions for the text field.
 * @param singleLine Whether the text field should be limited to a single line.
 * @param maxLines Maximum number of lines for the text field.
 */
@Composable
fun InputField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier.fillMaxWidth(),
    label: String? = null,
    placeholder: String? = null,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = Int.MAX_VALUE,
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        label = label?.let { @Composable { Text(label) } },
        placeholder = placeholder?.let { @Composable { Text(placeholder) } },
        enabled = enabled,
        readOnly = readOnly,
        isError = isError,
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        singleLine = singleLine,
        maxLines = maxLines,
    )
}

/**
 * A composable function that displays an outlined Material [OutlinedTextField] with common defaults.
 *
 * @param value The current text value of the text field.
 * @param onValueChange Callback triggered when the text value changes.
 * @param modifier The [Modifier] to be applied to the text field.
 * @param label Optional label to be displayed for the text field.
 * @param placeholder Optional placeholder text to be displayed when the field is empty.
 * @param enabled Whether the text field is enabled or disabled.
 * @param readOnly Whether the text field is read-only.
 * @param isError Whether the text field should show an error state.
 * @param visualTransformation The visual transformation to apply to the text (e.g., password masking).
 * @param keyboardOptions Keyboard options for the text field.
 * @param keyboardActions Keyboard actions for the text field.
 * @param singleLine Whether the text field should be limited to a single line.
 * @param maxLines Maximum number of lines for the text field.
 */
@Composable
fun OutlinedInputField(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier = Modifier.fillMaxWidth(),
    label: String? = null,
    placeholder: String? = null,
    enabled: Boolean = true,
    readOnly: Boolean = false,
    isError: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = modifier,
        label = label?.let { @Composable { Text(label) } },
        placeholder = placeholder?.let { @Composable { Text(placeholder) } },
        enabled = enabled,
        readOnly = readOnly,
        isError = isError,
        visualTransformation = visualTransformation,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        singleLine = singleLine,
        maxLines = maxLines,
    )
}
