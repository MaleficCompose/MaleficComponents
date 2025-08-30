package xyz.malefic.compose.comps

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import xyz.malefic.compose.comps.box.MaleficBox
import xyz.malefic.compose.comps.button.PrimaryButton
import xyz.malefic.compose.comps.button.SecondaryButton
import xyz.malefic.compose.comps.input.OutlinedInputField
import xyz.malefic.compose.comps.layout.PaddedColumn
import xyz.malefic.compose.comps.layout.VerticalSpacer
import xyz.malefic.compose.comps.switch.BooleanSwitch
import xyz.malefic.compose.comps.text.typography.Body1
import xyz.malefic.compose.comps.text.typography.Heading1
import xyz.malefic.compose.theming.ThemeConfig

/**
 * iOS-specific example usage demonstrating MaleficBox with ThemeConfig.
 * This example shows that theming support is now available on iOS as well!
 */
@Composable
fun IosMaleficBoxExample(themeConfig: ThemeConfig) {
    val switchState = remember { mutableStateOf(false) }
    val inputState = remember { mutableStateOf("iOS Input") }

    MaleficBox(themeConfig = themeConfig) {
        PaddedColumn {
            Heading1("MaleficBox Example (iOS)")
            Body1("This MaleficBox now works on iOS too!")
            Body1("Using ThemeConfig for true multiplatform theming across Android, JVM, and iOS.")
            Body1("Perfect for iOS apps with custom theming.")

            VerticalSpacer()

            BooleanSwitch(state = switchState)

            VerticalSpacer()

            OutlinedInputField(
                value = inputState.value,
                onValueChange = { inputState.value = it },
                label = "iOS Text Input",
                placeholder = "Type here...",
            )

            VerticalSpacer()

            PrimaryButton(
                text = "iOS Primary Action",
                onClick = { /* Handle iOS action */ },
            )

            VerticalSpacer()

            SecondaryButton(
                text = "iOS Secondary Action",
                onClick = { /* Handle iOS secondary action */ },
            )
        }
    }
}
