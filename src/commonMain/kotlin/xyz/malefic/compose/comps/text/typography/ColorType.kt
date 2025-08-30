package xyz.malefic.compose.comps.text.typography

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

/**
 * Enum class representing different types of colors used in a Compose UI theme.
 * Each enum value corresponds to a specific color from the MaterialTheme.
 */
enum class ColorType {
    /**
     * Represents the primary color of the theme.
     */
    Primary,

    /**
     * Represents the primary variant color of the theme.
     */
    PrimaryVariant,

    /**
     * Represents the secondary color of the theme.
     */
    Secondary,

    /**
     * Represents the secondary variant color of the theme.
     */
    SecondaryVariant,

    /**
     * Represents the background color of the theme.
     */
    Background,

    /**
     * Represents the surface color of the theme.
     */
    Surface,

    /**
     * Represents the error color of the theme.
     */
    Error,

    /**
     * Represents the color used for text/icons on the primary color.
     */
    OnPrimary,

    /**
     * Represents the color used for text/icons on the secondary color.
     */
    OnSecondary,

    /**
     * Represents the color used for text/icons on the background color.
     */
    OnBackground,

    /**
     * Represents the color used for text/icons on the surface color.
     */
    OnSurface,

    /**
     * Represents the color used for text/icons on the error color.
     */
    OnError,

    ;

    /**
     * A composable property that retrieves the corresponding color from the MaterialTheme
     * based on the enum value.
     */
    val color: Color
        @Composable get() =
            when (this) {
                Primary -> MaterialTheme.colors.primary
                PrimaryVariant -> MaterialTheme.colors.primaryVariant
                Secondary -> MaterialTheme.colors.secondary
                SecondaryVariant -> MaterialTheme.colors.secondaryVariant
                Background -> MaterialTheme.colors.background
                Error -> MaterialTheme.colors.error
                Surface -> MaterialTheme.colors.surface
                OnPrimary -> MaterialTheme.colors.onPrimary
                OnSecondary -> MaterialTheme.colors.onSecondary
                OnBackground -> MaterialTheme.colors.onBackground
                OnSurface -> MaterialTheme.colors.onSurface
                OnError -> MaterialTheme.colors.onError
            }
}
