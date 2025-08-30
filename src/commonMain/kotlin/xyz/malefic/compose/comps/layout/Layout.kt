package xyz.malefic.compose.comps.layout

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * A composable function that creates a [Column] with common defaults for vertical layouts.
 *
 * @param modifier The [Modifier] to be applied to the column.
 * @param verticalArrangement The vertical arrangement of the column's children.
 * @param horizontalAlignment The horizontal alignment of the column's children.
 * @param content The content to be displayed inside the column.
 */
@Composable
fun VerticalLayout(
    modifier: Modifier = Modifier.fillMaxWidth(),
    verticalArrangement: Arrangement.Vertical = Arrangement.Top,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    content: @Composable ColumnScope.() -> Unit,
) {
    Column(
        modifier = modifier,
        verticalArrangement = verticalArrangement,
        horizontalAlignment = horizontalAlignment,
        content = content,
    )
}

/**
 * A composable function that creates a [Row] with common defaults for horizontal layouts.
 *
 * @param modifier The [Modifier] to be applied to the row.
 * @param horizontalArrangement The horizontal arrangement of the row's children.
 * @param verticalAlignment The vertical alignment of the row's children.
 * @param content The content to be displayed inside the row.
 */
@Composable
fun HorizontalLayout(
    modifier: Modifier = Modifier.fillMaxWidth(),
    horizontalArrangement: Arrangement.Horizontal = Arrangement.Start,
    verticalAlignment: Alignment.Vertical = Alignment.Top,
    content: @Composable RowScope.() -> Unit,
) {
    Row(
        modifier = modifier,
        horizontalArrangement = horizontalArrangement,
        verticalAlignment = verticalAlignment,
        content = content,
    )
}

/**
 * A composable function that creates a [Column] with padding and spacing between children.
 *
 * @param modifier The [Modifier] to be applied to the column.
 * @param padding The padding to apply around the column.
 * @param spacing The spacing between children in the column.
 * @param verticalArrangement The vertical arrangement of the column's children.
 * @param horizontalAlignment The horizontal alignment of the column's children.
 * @param content The content to be displayed inside the column.
 */
@Composable
fun PaddedColumn(
    modifier: Modifier = Modifier.fillMaxWidth(),
    padding: Dp = 16.dp,
    spacing: Dp = 8.dp,
    verticalArrangement: Arrangement.Vertical = Arrangement.spacedBy(spacing),
    horizontalAlignment: Alignment.Horizontal = Alignment.Start,
    content: @Composable ColumnScope.() -> Unit,
) {
    Column(
        modifier = modifier.padding(padding),
        verticalArrangement = verticalArrangement,
        horizontalAlignment = horizontalAlignment,
        content = content,
    )
}

/**
 * A composable function that creates a [Row] with padding and spacing between children.
 *
 * @param modifier The [Modifier] to be applied to the row.
 * @param padding The padding to apply around the row.
 * @param spacing The spacing between children in the row.
 * @param horizontalArrangement The horizontal arrangement of the row's children.
 * @param verticalAlignment The vertical alignment of the row's children.
 * @param content The content to be displayed inside the row.
 */
@Composable
fun PaddedRow(
    modifier: Modifier = Modifier.fillMaxWidth(),
    padding: Dp = 16.dp,
    spacing: Dp = 8.dp,
    horizontalArrangement: Arrangement.Horizontal = Arrangement.spacedBy(spacing),
    verticalAlignment: Alignment.Vertical = Alignment.CenterVertically,
    content: @Composable RowScope.() -> Unit,
) {
    Row(
        modifier = modifier.padding(padding),
        horizontalArrangement = horizontalArrangement,
        verticalAlignment = verticalAlignment,
        content = content,
    )
}

/**
 * A composable function that creates a vertical spacer with the specified height.
 *
 * @param height The height of the spacer.
 */
@Composable
fun VerticalSpacer(height: Dp = 8.dp) {
    Spacer(modifier = Modifier.height(height))
}

/**
 * A composable function that creates a horizontal spacer with the specified width.
 *
 * @param width The width of the spacer.
 */
@Composable
fun HorizontalSpacer(width: Dp = 8.dp) {
    Spacer(modifier = Modifier.width(width))
}
