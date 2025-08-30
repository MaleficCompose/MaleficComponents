package xyz.malefic.compose.comps

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import xyz.malefic.compose.comps.box.BackgroundBox
import xyz.malefic.compose.comps.box.MaleficBox
import xyz.malefic.compose.comps.box.MaterialBox
import xyz.malefic.compose.comps.button.PrimaryButton
import xyz.malefic.compose.comps.button.SecondaryButton
import xyz.malefic.compose.comps.button.TertiaryButton
import xyz.malefic.compose.comps.input.InputField
import xyz.malefic.compose.comps.input.OutlinedInputField
import xyz.malefic.compose.comps.layout.PaddedColumn
import xyz.malefic.compose.comps.layout.VerticalSpacer
import xyz.malefic.compose.comps.switch.BooleanSwitch
import xyz.malefic.compose.comps.text.typography.Body1
import xyz.malefic.compose.comps.text.typography.Heading1
import xyz.malefic.compose.comps.text.typography.Heading2
import xyz.malefic.compose.theming.ThemeConfig

/**
 * Example usage of MaleficComponents showing multiplatform compatibility.
 * This example can be used across all supported platforms: Android, JVM, and iOS.
 */
@Composable
fun ExampleUsage() {
    val switchState = remember { mutableStateOf(false) }
    val inputState = remember { mutableStateOf("") }
    val outlinedInputState = remember { mutableStateOf("") }

    MaterialBox(colors = MaterialTheme.colors) {
        PaddedColumn {
            Heading1("Welcome to MaleficComponents!")
            Body1("This library now supports Android, JVM, and iOS platforms.")

            VerticalSpacer()

            BooleanSwitch(state = switchState)
            Body1("Switch enabled: ${switchState.value}")

            VerticalSpacer()

            InputField(
                value = inputState.value,
                onValueChange = { inputState.value = it },
                label = "Standard Input",
                placeholder = "Enter text here...",
            )

            VerticalSpacer()

            OutlinedInputField(
                value = outlinedInputState.value,
                onValueChange = { outlinedInputState.value = it },
                label = "Outlined Input",
                placeholder = "Enter text here...",
            )

            VerticalSpacer()

            PrimaryButton(
                text = "Primary Action",
                onClick = { /* Handle primary action */ },
            )

            VerticalSpacer()

            SecondaryButton(
                text = "Secondary Action",
                onClick = { /* Handle secondary action */ },
            )

            VerticalSpacer()

            TertiaryButton(
                text = "Tertiary Action",
                onClick = { /* Handle tertiary action */ },
            )

            VerticalSpacer()

            BackgroundBox {
                Column {
                    Heading2("Background Box Content")
                    Body1("This content is in a background box with proper styling.")
                }
            }
        }
    }
}

/**
 * Multiplatform example usage demonstrating MaleficBox with ThemeConfig.
 * This example works across all platforms: Android, JVM, and iOS.
 */
@Composable
fun MultiplatformMaleficBoxExample(themeConfig: ThemeConfig) {
    val switchState = remember { mutableStateOf(false) }
    val inputState = remember { mutableStateOf("Themed input") }

    MaleficBox(themeConfig = themeConfig) {
        PaddedColumn {
            Heading1("MaleficBox Example (Multiplatform)")
            Body1("This MaleficBox works across all platforms!")
            Body1("Using ThemeConfig for multiplatform theming on Android, JVM, and iOS.")

            VerticalSpacer()

            BooleanSwitch(state = switchState)

            VerticalSpacer()

            OutlinedInputField(
                value = inputState.value,
                onValueChange = { inputState.value = it },
                label = "Themed Input Field",
            )

            VerticalSpacer()

            PrimaryButton(
                text = "Themed Button",
                onClick = { /* Handle click with theming */ },
            )
        }
    }
}
