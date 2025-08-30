# MaleficComponents

A Kotlin Multiplatform Compose library containing useful UI elements and components for Android, JVM (Desktop), and iOS platforms.

## Platform Support

MaleficComponents is built with Kotlin Multiplatform, providing seamless cross-platform support:

- **Android** 📱 - Android mobile applications
- **JVM (Desktop)** 🖥️ - Desktop applications using Compose Desktop
- **iOS** 🍎 - iOS applications (iosX64, iosArm64, iosSimulatorArm64)

## Features

### Common Components (Available on all platforms)

All core UI components are available across all platforms through the `commonMain` source set:

- **Typography Components**: `Heading1` through `Heading6`, `Body1`, `Body2` with customizable colors
- **Layout Components**: `MaterialBox`, `BackgroundBox` for themed containers
- **Input Components**: `BooleanSwitch` for toggle functionality
- **Theme Support**: `ColorType` enum for consistent theming

### Platform-Specific Components

- **JVM/Desktop Only**:
  - `NavWindow` - Desktop window wrapper with PreCompose integration
  - `MaleficBox` - Malefic theming integration (requires JVM-only theming library)

## Installation

Add the dependency to your `build.gradle.kts`:

```kotlin
dependencies {
    implementation("xyz.malefic.compose:comps:1.2.1")
}
```

### For Multiplatform Projects

```kotlin
kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("xyz.malefic.compose:comps:1.2.1")
            }
        }
    }
}
```

## Usage

### Basic Example (All Platforms)

```kotlin
@Composable
fun MyApp() {
    val switchState = remember { mutableStateOf(false) }
    
    MaterialBox(colors = MaterialTheme.colors) {
        Column {
            Heading1("Welcome to MaleficComponents!")
            Body1("Cross-platform UI components for Compose")
            
            BooleanSwitch(state = switchState)
            
            BackgroundBox {
                Body1("This content has a background.")
            }
        }
    }
}
```

### Desktop-Specific Example (JVM Only)

```kotlin
@Composable
fun DesktopApp() {
    NavWindow(
        onCloseRequest = { exitApplication() },
        title = "My Desktop App"
    ) {
        MyApp() // Your common composable
    }
}
```

## Architecture

The library follows Kotlin Multiplatform best practices:

```
src/
├── commonMain/           # Shared code for all platforms
│   └── kotlin/
│       └── xyz/malefic/compose/comps/
│           ├── box/          # Layout components
│           ├── switch/       # Input components
│           └── text/         # Typography components
├── jvmMain/             # JVM/Desktop specific code
│   └── kotlin/
│       └── xyz/malefic/compose/comps/
│           ├── box/          # Desktop theming integration
│           └── precompose/   # Desktop window components
├── androidMain/         # Android specific code (currently empty)
└── iosMain/            # iOS specific code (currently empty)
```

## Requirements

- **Kotlin**: 2.2.10+
- **Compose**: 1.8.10-alpha01+
- **Android**: API 24+ (Android 7.0)
- **JVM**: Java 17+
- **iOS**: iOS 12.0+

## License

MIT License - see [LICENSE](LICENSE) for details.

## Contributing

Contributions are welcome! Please ensure that any new components maintain cross-platform compatibility by placing shared code in `commonMain` and platform-specific implementations in their respective source sets.