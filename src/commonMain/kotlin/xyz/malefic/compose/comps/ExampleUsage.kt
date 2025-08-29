package xyz.malefic.compose.comps

import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import xyz.malefic.compose.comps.box.BackgroundBox
import xyz.malefic.compose.comps.box.MaterialBox
import xyz.malefic.compose.comps.switch.BooleanSwitch
import xyz.malefic.compose.comps.text.typography.Body1
import xyz.malefic.compose.comps.text.typography.Heading1

/**
 * Example usage of MaleficComponents showing multiplatform compatibility.
 * This example can be used across all supported platforms: Android, JVM, and iOS.
 */
@Composable
fun ExampleUsage() {
    val switchState = remember { mutableStateOf(false) }

    MaterialBox(colors = MaterialTheme.colors) {
        Column {
            Heading1("Welcome to MaleficComponents!")
            Body1("This library now supports Android, JVM, and iOS platforms.")

            BooleanSwitch(state = switchState)

            BackgroundBox {
                Body1("This content is in a background box.")
            }
        }
    }
}
