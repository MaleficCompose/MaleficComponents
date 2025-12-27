package xyz.malefic.compose.comps.switch

import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier

/**
 * A composable function that displays a [Switch] tied to the given [Boolean] value.
 *
 * @param state The mutable state of the [Boolean] value.
 * @param modifier The modifier to be applied to the [Switch] composable.
 */
@Composable
fun BooleanSwitch(
    state: MutableState<Boolean>,
    modifier: Modifier = Modifier,
) {
    Switch(
        checked = state.value,
        onCheckedChange = { state.value = it },
        modifier = modifier,
    )
}
