package xyz.malefic.compose.comps

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import xyz.malefic.compose.comps.box.MaleficBox
import xyz.malefic.compose.comps.switch.BooleanSwitch
import xyz.malefic.compose.comps.text.typography.Body1
import xyz.malefic.compose.comps.text.typography.Heading1
import xyz.malefic.compose.theming.ThemeConfig

/**
 * Android-specific example usage demonstrating MaleficBox with ThemeConfig.
 * This example shows theming support available on JVM and Android platforms.
 */
@Composable
fun AndroidMaleficBoxExample(themeConfig: ThemeConfig) {
    val switchState = remember { mutableStateOf(false) }

    MaleficBox(themeConfig = themeConfig) {
        Column {
            Heading1("MaleficBox Example (Android)")
            Body1("This MaleficBox works on JVM and Android platforms!")
            Body1("Using ThemeConfig for multiplatform theming.")
            Body1("Perfect for Android apps with custom theming.")

            BooleanSwitch(state = switchState)
        }
    }
}
