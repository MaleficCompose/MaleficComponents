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
import java.io.InputStream

/**
 * JVM-specific example usage demonstrating MaleficBox with ThemeConfig.
 * This example shows theming support available on JVM and Android platforms.
 */
@Composable
fun JvmMaleficBoxExample(themeConfig: ThemeConfig) {
    val switchState = remember { mutableStateOf(false) }

    MaleficBox(themeConfig = themeConfig) {
        Column {
            Heading1("MaleficBox Example (JVM)")
            Body1("This MaleficBox works on JVM and Android platforms!")
            Body1("Using ThemeConfig for multiplatform theming.")

            BooleanSwitch(state = switchState)
        }
    }
}

/**
 * JVM-specific example usage demonstrating MaleficBox with InputStream.
 * This example is JVM-only due to InputStream being platform-specific.
 */
@Composable
fun JvmInputStreamMaleficBoxExample(inputStream: InputStream) {
    val switchState = remember { mutableStateOf(false) }

    MaleficBox(inputStream = inputStream) {
        Column {
            Heading1("MaleficBox Example (JVM InputStream)")
            Body1("This MaleficBox is JVM-only due to InputStream usage.")
            Body1("Perfect for desktop applications with file-based themes.")

            BooleanSwitch(state = switchState)
        }
    }
}
