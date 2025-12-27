package xyz.malefic.compose.comps

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import xyz.malefic.compose.comps.box.BackgroundBox
import xyz.malefic.compose.comps.box.MaleficBox
import xyz.malefic.compose.comps.box.MaterialBox
import xyz.malefic.compose.comps.input.InputField
import xyz.malefic.compose.comps.input.OutlinedInputField
import xyz.malefic.compose.comps.layout.PaddedColumn
import xyz.malefic.compose.comps.layout.VerticalSpacer
import xyz.malefic.compose.comps.switch.BooleanSwitch
import xyz.malefic.compose.comps.text.Body
import xyz.malefic.compose.comps.text.Headline
import xyz.malefic.compose.comps.text.TypographySize
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

    MaterialBox(colors = MaterialTheme.colorScheme) {
        PaddedColumn {
            Headline("Welcome to MaleficComponents!", TypographySize.Large)
            Body("This library now supports Android, JVM, and iOS platforms.")

            VerticalSpacer()

            BooleanSwitch(state = switchState)
            Body("Switch enabled: ${switchState.value}")

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

            BackgroundBox {
                Column {
                    Headline("Background Box Content", TypographySize.Small)
                    Body("This content is in a background box with proper styling.")
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
            Headline("MaleficBox Example (Multiplatform)", TypographySize.Large)
            Body("This MaleficBox works across all platforms!")
            Body("Using ThemeConfig for multiplatform theming on Android, JVM, and iOS.")

            VerticalSpacer()

            BooleanSwitch(state = switchState)

            VerticalSpacer()

            OutlinedInputField(
                value = inputState.value,
                onValueChange = { inputState.value = it },
                label = "Themed Input Field",
            )
        }
    }
}
