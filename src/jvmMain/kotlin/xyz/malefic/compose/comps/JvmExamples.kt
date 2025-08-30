package xyz.malefic.compose.comps

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import xyz.malefic.compose.comps.box.MaleficBox
import xyz.malefic.compose.comps.switch.BooleanSwitch
import xyz.malefic.compose.comps.text.typography.Body1
import xyz.malefic.compose.comps.text.typography.Heading1
import java.io.InputStream

/**
 * JVM-specific example usage demonstrating MaleficBox with InputStream.
 * This example is JVM-only due to InputStream being platform-specific.
 * For cross-platform theming, use the ThemeConfig overload in common examples.
 */
@Composable
fun JvmInputStreamMaleficBoxExample(inputStream: InputStream) {
    val switchState = remember { mutableStateOf(false) }

    MaleficBox(inputStream = inputStream) {
        Column {
            Heading1("MaleficBox Example (JVM InputStream)")
            Body1("This MaleficBox is JVM-only due to InputStream usage.")
            Body1("Perfect for desktop applications with file-based themes.")
            Body1("For multiplatform theming, use the ThemeConfig overload.")

            BooleanSwitch(state = switchState)
        }
    }
}
