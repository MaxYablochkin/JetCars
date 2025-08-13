package com.dev.maxyablochkin.jetgame.presentation.images_svg

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dev.maxyablochkin.jetgame.presentation.theme.JetGameTheme

@Composable
fun Car(modifier: Modifier = Modifier, color: Color) {
    Image(
        modifier = modifier.rotate(-90f).size(150.dp),
        imageVector = jetCarImageVector(color),
        contentDescription = "car"
    )
}

@Composable
fun jetCarImageVector(carColor: Color): ImageVector {
    return ImageVector.Builder(
        name = "JetCar",
        defaultWidth = 960.dp,
        defaultHeight = 476.dp,
        viewportWidth = 960f,
        viewportHeight = 476f
    ).apply {
        path(
            fill = SolidColor(Color.Black),
            fillAlpha = 0.99608f,
            stroke = SolidColor(Color(0xFF191919)),
            strokeLineWidth = 14f
        ) {
            moveToRelative(557.58f, 7f)
            curveToRelative(-1.51f, 0.01f, -4.72f, 0.3f, -6.47f, 0.94f)
            lineToRelative(-3.5f, 1.5f)
            lineToRelative(8.66f, 35.94f)
            lineToRelative(-124.81f, 0.28f)
            curveToRelative(-2.44f, 0f, -4.89f, -0.01f, -7.34f, -0.03f)
            curveToRelative(-4.91f, -0.03f, -9.86f, -0.1f, -14.84f, -0.22f)
            curveToRelative(-7.29f, -0.17f, -14.67f, -0.41f, -22.06f, -0.72f)
            curveToRelative(-0.4f, -0.02f, -0.79f, -0.05f, -1.19f, -0.06f)
            curveToRelative(-14.93f, -0.63f, -30.01f, -1.49f, -45.03f, -2.44f)
            curveToRelative(-20.33f, -1.28f, -40.52f, -2.71f, -60.12f, -3.88f)
            curveToRelative(-14.53f, -0.87f, -28.73f, -1.58f, -42.38f, -2f)
            curveToRelative(-9.37f, -0.29f, -18.46f, -0.46f, -27.25f, -0.41f)
            curveToRelative(-4.32f, 0.02f, -8.57f, 0.09f, -12.72f, 0.22f)
            curveToRelative(-4.15f, 0.13f, -8.38f, 0.36f, -12.66f, 0.66f)
            curveToRelative(-2.14f, 0.15f, -4.28f, 0.31f, -6.44f, 0.5f)
            curveToRelative(-6.47f, 0.57f, -13.05f, 1.32f, -19.59f, 2.19f)
            curveToRelative(-0.01f, 0f, -0.02f, -0f, -0.03f, 0f)
            curveToRelative(-4.37f, 0.58f, -8.72f, 1.23f, -13.06f, 1.91f)
            curveToRelative(-4.34f, 0.68f, -8.67f, 1.4f, -12.94f, 2.16f)
            curveToRelative(-4.25f, 0.76f, -8.47f, 1.57f, -12.59f, 2.38f)
            curveToRelative(-0.01f, 0f, -0.02f, -0f, -0.03f, 0f)
            curveToRelative(-2.07f, 0.41f, -4.07f, 0.8f, -6.09f, 1.22f)
            curveToRelative(-6.06f, 1.24f, -11.93f, 2.52f, -17.5f, 3.78f)
            curveToRelative(-0.01f, 0f, -0.02f, -0f, -0.03f, 0f)
            curveToRelative(-3.72f, 0.84f, -7.29f, 1.68f, -10.72f, 2.5f)
            curveToRelative(-6.86f, 1.65f, -13.11f, 3.23f, -18.53f, 4.66f)
            curveToRelative(-8.12f, 2.13f, -14.38f, 3.93f, -18.09f, 5f)
            curveToRelative(-2.47f, 0.72f, -3.81f, 1.13f, -3.81f, 1.13f)
            lineToRelative(-13.69f, 3.75f)
            curveToRelative(-0.9f, 0.25f, -1.78f, 0.69f, -2.63f, 1.31f)
            curveToRelative(-0.29f, 0.21f, -0.56f, 0.44f, -0.84f, 0.69f)
            curveToRelative(-1.1f, 0.98f, -2.15f, 2.27f, -3.16f, 3.84f)
            curveToRelative(-0f, 0.01f, 0f, 0.02f, 0f, 0.03f)
            curveToRelative(-0.5f, 0.78f, -1.02f, 1.64f, -1.5f, 2.56f)
            curveToRelative(-0f, 0.01f, 0f, 0.02f, 0f, 0.03f)
            curveToRelative(-0.48f, 0.92f, -0.95f, 1.91f, -1.41f, 2.97f)
            curveToRelative(-0f, 0.01f, 0f, 0.02f, 0f, 0.03f)
            curveToRelative(-3.67f, 8.51f, -6.62f, 21.13f, -8.94f, 36.22f)
            curveToRelative(-0f, 0.01f, 0f, 0.02f, 0f, 0.03f)
            curveToRelative(-0.04f, 0.23f, -0.06f, 0.48f, -0.09f, 0.72f)
            curveToRelative(-0.5f, 3.33f, -0.99f, 6.8f, -1.44f, 10.34f)
            curveToRelative(-0.03f, 0.24f, -0.06f, 0.48f, -0.09f, 0.72f)
            curveToRelative(-0.5f, 4.04f, -0.95f, 8.2f, -1.38f, 12.47f)
            curveToRelative(-0f, 0.01f, 0f, 0.02f, 0f, 0.03f)
            curveToRelative(-0.21f, 2.13f, -0.43f, 4.29f, -0.62f, 6.47f)
            curveToRelative(-0f, 0.01f, 0f, 0.02f, 0f, 0.03f)
            curveToRelative(-0.2f, 2.17f, -0.38f, 4.35f, -0.56f, 6.56f)
            curveToRelative(-0f, 0.01f, 0f, 0.02f, 0f, 0.03f)
            curveToRelative(-0.36f, 4.44f, -0.68f, 8.95f, -0.97f, 13.5f)
            curveToRelative(-0f, 0.01f, 0f, 0.02f, 0f, 0.03f)
            curveToRelative(-0.87f, 13.68f, -1.46f, 27.79f, -1.78f, 41.56f)
            curveToRelative(-0f, 0.01f, 0f, 0.02f, 0f, 0.03f)
            curveToRelative(-0.21f, 9.19f, -0.31f, 18.21f, -0.31f, 26.91f)
            curveToRelative(0f, 0.97f, 0.03f, 1.96f, 0.03f, 2.94f)
            curveToRelative(-0f, 0.97f, -0.03f, 1.97f, -0.03f, 2.94f)
            curveToRelative(0f, 8.69f, 0.1f, 17.72f, 0.31f, 26.91f)
            curveToRelative(0f, 0.01f, -0f, 0.02f, 0f, 0.03f)
            curveToRelative(0.32f, 13.77f, 0.91f, 27.88f, 1.78f, 41.56f)
            curveToRelative(0f, 0.01f, -0f, 0.02f, 0f, 0.03f)
            curveToRelative(0.29f, 4.55f, 0.61f, 9.06f, 0.97f, 13.5f)
            curveToRelative(0f, 0.01f, -0f, 0.02f, 0f, 0.03f)
            curveToRelative(0.18f, 2.21f, 0.37f, 4.39f, 0.56f, 6.56f)
            curveToRelative(0f, 0.01f, -0f, 0.02f, 0f, 0.03f)
            curveToRelative(0.2f, 2.17f, 0.41f, 4.34f, 0.62f, 6.47f)
            curveToRelative(0f, 0.01f, -0f, 0.02f, 0f, 0.03f)
            curveToRelative(0.43f, 4.27f, 0.87f, 8.43f, 1.38f, 12.47f)
            curveToRelative(0.03f, 0.24f, 0.06f, 0.48f, 0.09f, 0.72f)
            curveToRelative(0.45f, 3.55f, 0.93f, 7.01f, 1.44f, 10.34f)
            curveToRelative(0.04f, 0.24f, 0.06f, 0.48f, 0.09f, 0.72f)
            curveToRelative(0f, 0.01f, -0f, 0.02f, 0f, 0.03f)
            curveToRelative(2.32f, 15.09f, 5.27f, 27.71f, 8.94f, 36.22f)
            curveToRelative(0f, 0.01f, -0f, 0.02f, 0f, 0.03f)
            curveToRelative(0.46f, 1.05f, 0.93f, 2.05f, 1.41f, 2.97f)
            curveToRelative(0f, 0.01f, -0f, 0.02f, 0f, 0.03f)
            curveToRelative(0.48f, 0.92f, 1f, 1.78f, 1.5f, 2.56f)
            curveToRelative(0f, 0.01f, -0f, 0.02f, 0f, 0.03f)
            curveToRelative(1.01f, 1.57f, 2.06f, 2.86f, 3.16f, 3.84f)
            curveToRelative(0.28f, 0.25f, 0.56f, 0.48f, 0.84f, 0.69f)
            curveToRelative(0.85f, 0.62f, 1.72f, 1.06f, 2.63f, 1.31f)
            lineToRelative(13.69f, 3.75f)
            curveToRelative(0f, 0f, 1.34f, 0.41f, 3.81f, 1.13f)
            curveToRelative(3.71f, 1.07f, 9.97f, 2.87f, 18.09f, 5f)
            curveToRelative(5.42f, 1.42f, 11.67f, 3.01f, 18.53f, 4.66f)
            curveToRelative(3.43f, 0.82f, 7f, 1.66f, 10.72f, 2.5f)
            curveToRelative(0.01f, 0f, 0.02f, -0f, 0.03f, 0f)
            curveToRelative(5.57f, 1.27f, 11.44f, 2.54f, 17.5f, 3.78f)
            curveToRelative(2.02f, 0.41f, 4.03f, 0.81f, 6.09f, 1.22f)
            curveToRelative(0.01f, 0f, 0.02f, -0f, 0.03f, 0f)
            curveToRelative(4.12f, 0.81f, 8.34f, 1.62f, 12.59f, 2.38f)
            curveToRelative(4.26f, 0.76f, 8.59f, 1.48f, 12.94f, 2.16f)
            curveToRelative(4.34f, 0.68f, 8.69f, 1.33f, 13.06f, 1.91f)
            curveToRelative(0.01f, 0f, 0.02f, -0f, 0.03f, 0f)
            curveToRelative(6.55f, 0.87f, 13.13f, 1.62f, 19.59f, 2.19f)
            curveToRelative(2.16f, 0.19f, 4.3f, 0.35f, 6.44f, 0.5f)
            curveToRelative(4.28f, 0.3f, 8.51f, 0.53f, 12.66f, 0.66f)
            curveToRelative(4.15f, 0.13f, 8.4f, 0.19f, 12.72f, 0.22f)
            curveToRelative(8.79f, 0.05f, 17.88f, -0.12f, 27.25f, -0.41f)
            curveToRelative(13.64f, -0.42f, 27.85f, -1.13f, 42.38f, -2f)
            curveToRelative(19.6f, -1.17f, 39.8f, -2.59f, 60.12f, -3.88f)
            curveToRelative(15.02f, -0.95f, 30.1f, -1.81f, 45.03f, -2.44f)
            curveToRelative(0.4f, -0.02f, 0.79f, -0.05f, 1.19f, -0.06f)
            curveToRelative(7.39f, -0.31f, 14.77f, -0.55f, 22.06f, -0.72f)
            curveToRelative(4.98f, -0.11f, 9.93f, -0.18f, 14.84f, -0.22f)
            curveToRelative(2.46f, -0.02f, 4.91f, -0.04f, 7.34f, -0.03f)
            lineToRelative(124.81f, 0.28f)
            lineToRelative(-8.66f, 35.94f)
            lineToRelative(3.5f, 1.5f)
            curveToRelative(1.75f, 0.63f, 4.96f, 0.93f, 6.47f, 0.94f)
            curveToRelative(0.85f, 0f, 1.76f, -0.07f, 2.69f, -0.25f)
            curveToRelative(0.31f, -0.06f, 0.62f, -0.14f, 0.94f, -0.22f)
            curveToRelative(0.3f, -0.08f, 0.63f, -0.16f, 0.94f, -0.25f)
            curveToRelative(0.63f, -0.19f, 1.26f, -0.42f, 1.88f, -0.69f)
            curveToRelative(1.82f, -0.79f, 3.53f, -1.93f, 4.78f, -3.31f)
            curveToRelative(0.01f, -0.01f, 0.02f, -0.02f, 0.03f, -0.03f)
            curveToRelative(0.62f, -0.7f, 1.11f, -1.45f, 1.47f, -2.28f)
            lineToRelative(12.16f, -31.31f)
            lineToRelative(109.94f, 0.25f)
            curveToRelative(0.75f, 0.37f, 1.48f, 0.75f, 2.22f, 1.09f)
            curveToRelative(2.98f, 1.4f, 5.91f, 2.6f, 8.84f, 3.63f)
            curveToRelative(1.46f, 0.51f, 2.92f, 0.98f, 4.38f, 1.41f)
            curveToRelative(5.1f, 1.51f, 10.19f, 2.55f, 15.34f, 3.25f)
            curveToRelative(2.95f, 0.4f, 5.93f, 0.69f, 8.94f, 0.91f)
            curveToRelative(1.51f, 0.11f, 3.03f, 0.18f, 4.56f, 0.25f)
            curveToRelative(3.06f, 0.14f, 6.14f, 0.21f, 9.31f, 0.25f)
            curveToRelative(6.35f, 0.07f, 12.98f, 0f, 20f, 0f)
            curveToRelative(10.41f, 0f, 20.32f, -0.53f, 29.78f, -1.56f)
            curveToRelative(3.78f, -0.41f, 7.49f, -0.9f, 11.13f, -1.47f)
            curveToRelative(7.27f, -1.14f, 14.23f, -2.62f, 20.91f, -4.38f)
            curveToRelative(1.67f, -0.44f, 3.34f, -0.9f, 4.97f, -1.38f)
            curveToRelative(4.9f, -1.43f, 9.61f, -3.03f, 14.19f, -4.78f)
            curveToRelative(1.52f, -0.59f, 3.04f, -1.16f, 4.53f, -1.78f)
            curveToRelative(2.98f, -1.24f, 5.88f, -2.56f, 8.72f, -3.94f)
            curveToRelative(1.42f, -0.69f, 2.84f, -1.4f, 4.22f, -2.13f)
            curveToRelative(2.77f, -1.45f, 5.47f, -2.98f, 8.09f, -4.56f)
            curveToRelative(1.31f, -0.79f, 2.6f, -1.61f, 3.88f, -2.44f)
            curveToRelative(6.39f, -4.12f, 12.36f, -8.63f, 17.91f, -13.53f)
            curveToRelative(4.43f, -3.92f, 8.6f, -8.08f, 12.5f, -12.47f)
            curveToRelative(0f, -0.01f, -0f, -0.03f, 0f, -0.03f)
            curveToRelative(0.97f, -1.09f, 1.94f, -2.19f, 2.88f, -3.31f)
            curveToRelative(0f, -0.01f, -0f, -0.03f, 0f, -0.03f)
            curveToRelative(0.94f, -1.12f, 1.88f, -2.26f, 2.78f, -3.41f)
            curveToRelative(0f, -0.01f, -0f, -0.02f, 0f, -0.03f)
            curveToRelative(2.73f, -3.46f, 5.31f, -7.02f, 7.75f, -10.72f)
            curveToRelative(0f, -0.01f, -0f, -0.02f, 0f, -0.03f)
            curveToRelative(0.81f, -1.23f, 1.63f, -2.46f, 2.41f, -3.72f)
            curveToRelative(0f, -0.01f, -0f, -0.02f, 0f, -0.03f)
            curveToRelative(2.34f, -3.78f, 4.57f, -7.65f, 6.62f, -11.66f)
            curveToRelative(0f, -0.01f, -0f, -0.02f, 0f, -0.03f)
            curveToRelative(0.68f, -1.33f, 1.35f, -2.68f, 2f, -4.03f)
            curveToRelative(0f, -0.01f, -0f, -0.02f, 0f, -0.03f)
            curveToRelative(0.65f, -1.35f, 1.32f, -2.72f, 1.94f, -4.09f)
            curveToRelative(0f, -0.01f, -0f, -0.02f, 0f, -0.03f)
            curveToRelative(1.25f, -2.76f, 2.44f, -5.55f, 3.56f, -8.41f)
            curveToRelative(0f, -0.01f, -0f, -0.02f, 0f, -0.03f)
            curveToRelative(0.56f, -1.42f, 1.09f, -2.87f, 1.63f, -4.31f)
            curveToRelative(0f, -0.01f, -0f, -0.02f, 0f, -0.03f)
            curveToRelative(0.53f, -1.45f, 1.06f, -2.91f, 1.56f, -4.38f)
            curveToRelative(0.5f, -1.47f, 1f, -2.95f, 1.47f, -4.44f)
            curveToRelative(0f, -0.01f, -0f, -0.02f, 0f, -0.03f)
            curveToRelative(0.47f, -1.49f, 0.93f, -2.99f, 1.38f, -4.5f)
            curveToRelative(0f, -0.01f, -0f, -0.02f, 0f, -0.03f)
            curveToRelative(0.44f, -1.51f, 0.87f, -3.03f, 1.28f, -4.56f)
            curveToRelative(0f, -0.01f, -0f, -0.02f, 0f, -0.03f)
            curveToRelative(1.24f, -4.61f, 2.37f, -9.31f, 3.34f, -14.09f)
            verticalLineToRelative(-0.03f)
            curveToRelative(0.32f, -1.59f, 0.61f, -3.2f, 0.91f, -4.81f)
            verticalLineToRelative(-0.03f)
            curveToRelative(2.07f, -11.32f, 3.46f, -23.06f, 4.16f, -35.22f)
            curveToRelative(0f, -0.01f, -0f, -0.02f, 0f, -0.03f)
            curveToRelative(0.1f, -1.73f, 0.18f, -3.48f, 0.25f, -5.22f)
            curveToRelative(0f, -0.01f, -0f, -0.02f, 0f, -0.03f)
            curveToRelative(0.14f, -3.5f, 0.25f, -7.01f, 0.28f, -10.56f)
            curveToRelative(0f, -0.01f, -0f, -0.02f, 0f, -0.03f)
            curveToRelative(0.02f, -1.78f, 0.01f, -3.58f, 0f, -5.38f)
            curveToRelative(0f, -0.64f, -0.02f, -1.27f, -0.03f, -1.91f)
            curveToRelative(0.01f, -0.63f, 0.03f, -1.27f, 0.03f, -1.91f)
            curveToRelative(0.01f, -1.8f, 0.02f, -3.59f, 0f, -5.38f)
            curveToRelative(-0f, -0.01f, 0f, -0.02f, 0f, -0.03f)
            curveToRelative(-0.03f, -3.56f, -0.14f, -7.07f, -0.28f, -10.56f)
            curveToRelative(-0f, -0.01f, 0f, -0.02f, 0f, -0.03f)
            curveToRelative(-0.07f, -1.74f, -0.15f, -3.49f, -0.25f, -5.22f)
            curveToRelative(-0f, -0.01f, 0f, -0.02f, 0f, -0.03f)
            curveToRelative(-0.69f, -12.16f, -2.08f, -23.9f, -4.16f, -35.22f)
            verticalLineToRelative(-0.03f)
            curveToRelative(-0.3f, -1.61f, -0.58f, -3.22f, -0.91f, -4.81f)
            verticalLineToRelative(-0.03f)
            curveToRelative(-0.98f, -4.79f, -2.11f, -9.48f, -3.34f, -14.09f)
            curveToRelative(-0f, -0.01f, 0f, -0.02f, 0f, -0.03f)
            curveToRelative(-0.41f, -1.53f, -0.84f, -3.05f, -1.28f, -4.56f)
            curveToRelative(-0f, -0.01f, 0f, -0.02f, 0f, -0.03f)
            curveToRelative(-0.44f, -1.51f, -0.9f, -3.01f, -1.38f, -4.5f)
            curveToRelative(-0f, -0.01f, 0f, -0.02f, 0f, -0.03f)
            curveToRelative(-0.47f, -1.49f, -0.97f, -2.97f, -1.47f, -4.44f)
            curveToRelative(-0.5f, -1.47f, -1.03f, -2.93f, -1.56f, -4.38f)
            curveToRelative(-0f, -0.01f, 0f, -0.02f, 0f, -0.03f)
            curveToRelative(-0.53f, -1.45f, -1.06f, -2.89f, -1.63f, -4.31f)
            curveToRelative(-0f, -0.01f, 0f, -0.02f, 0f, -0.03f)
            curveToRelative(-1.12f, -2.85f, -2.32f, -5.64f, -3.56f, -8.41f)
            curveToRelative(-0f, -0.01f, 0f, -0.02f, 0f, -0.03f)
            curveToRelative(-0.62f, -1.38f, -1.29f, -2.74f, -1.94f, -4.09f)
            curveToRelative(-0f, -0.01f, 0f, -0.02f, 0f, -0.03f)
            curveToRelative(-0.65f, -1.35f, -1.32f, -2.7f, -2f, -4.03f)
            curveToRelative(-0f, -0.01f, 0f, -0.02f, 0f, -0.03f)
            curveToRelative(-2.06f, -4f, -4.28f, -7.88f, -6.62f, -11.66f)
            curveToRelative(-0f, -0.01f, 0f, -0.02f, 0f, -0.03f)
            curveToRelative(-0.78f, -1.25f, -1.6f, -2.49f, -2.41f, -3.72f)
            curveToRelative(-0f, -0.01f, 0f, -0.02f, 0f, -0.03f)
            curveToRelative(-2.44f, -3.7f, -5.02f, -7.26f, -7.75f, -10.72f)
            curveToRelative(-0f, -0.01f, 0f, -0.03f, 0f, -0.03f)
            curveToRelative(-0.91f, -1.15f, -1.84f, -2.29f, -2.78f, -3.41f)
            curveToRelative(-0f, -0.01f, 0f, -0.03f, 0f, -0.03f)
            curveToRelative(-0.94f, -1.12f, -1.9f, -2.22f, -2.88f, -3.31f)
            curveToRelative(-0f, -0.01f, 0f, -0.03f, 0f, -0.03f)
            curveToRelative(-3.9f, -4.39f, -8.07f, -8.55f, -12.5f, -12.47f)
            curveToRelative(-5.54f, -4.91f, -11.51f, -9.41f, -17.91f, -13.53f)
            curveToRelative(-1.28f, -0.82f, -2.56f, -1.65f, -3.88f, -2.44f)
            curveToRelative(-2.63f, -1.58f, -5.33f, -3.11f, -8.09f, -4.56f)
            curveToRelative(-1.38f, -0.72f, -2.8f, -1.43f, -4.22f, -2.13f)
            curveToRelative(-2.84f, -1.38f, -5.74f, -2.7f, -8.72f, -3.94f)
            curveToRelative(-1.49f, -0.62f, -3.01f, -1.2f, -4.53f, -1.78f)
            curveToRelative(-4.57f, -1.76f, -9.29f, -3.35f, -14.19f, -4.78f)
            curveToRelative(-1.63f, -0.48f, -3.3f, -0.94f, -4.97f, -1.38f)
            curveToRelative(-6.68f, -1.76f, -13.64f, -3.23f, -20.91f, -4.38f)
            curveToRelative(-3.63f, -0.57f, -7.34f, -1.06f, -11.13f, -1.47f)
            curveToRelative(-9.46f, -1.03f, -19.37f, -1.56f, -29.78f, -1.56f)
            curveToRelative(-7.02f, 0f, -13.65f, -0.07f, -20f, 0f)
            curveToRelative(-3.17f, 0.04f, -6.26f, 0.11f, -9.31f, 0.25f)
            curveToRelative(-1.53f, 0.07f, -3.06f, 0.14f, -4.56f, 0.25f)
            curveToRelative(-3.01f, 0.21f, -5.99f, 0.51f, -8.94f, 0.91f)
            curveToRelative(-5.16f, 0.7f, -10.24f, 1.74f, -15.34f, 3.25f)
            curveToRelative(-1.46f, 0.43f, -2.91f, 0.89f, -4.38f, 1.41f)
            curveToRelative(-2.93f, 1.03f, -5.86f, 2.23f, -8.84f, 3.63f)
            curveToRelative(-0.74f, 0.35f, -1.47f, 0.72f, -2.22f, 1.09f)
            lineToRelative(-109.94f, 0.25f)
            lineToRelative(-12.16f, -31.31f)
            curveToRelative(-0.36f, -0.83f, -0.84f, -1.58f, -1.47f, -2.28f)
            curveToRelative(-0.01f, -0.01f, -0.02f, -0.02f, -0.03f, -0.03f)
            curveToRelative(-1.25f, -1.38f, -2.96f, -2.52f, -4.78f, -3.31f)
            curveToRelative(-0.61f, -0.27f, -1.25f, -0.49f, -1.88f, -0.69f)
            curveToRelative(-0.3f, -0.09f, -0.63f, -0.17f, -0.94f, -0.25f)
            curveToRelative(-0.31f, -0.08f, -0.63f, -0.16f, -0.94f, -0.22f)
            curveToRelative(-0.93f, -0.18f, -1.84f, -0.25f, -2.69f, -0.25f)
            close()
        }
        path(
            fill = SolidColor(value = carColor),
            fillAlpha = 0.99608f
        ) {
            moveToRelative(557.58f, 7f)
            curveToRelative(-1.51f, 0.01f, -4.72f, 0.31f, -6.47f, 0.94f)
            lineToRelative(-3.5f, 1.5f)
            lineToRelative(8.66f, 35.84f)
            lineToRelative(-124.81f, 0.28f)
            curveToRelative(-77.96f, 0.17f, -166.52f, -11.5f, -232.93f, -9.5f)
            curveToRelative(-66.41f, 2f, -152.12f, 28f, -152.12f, 28f)
            lineToRelative(-13.69f, 3.78f)
            curveToRelative(-19.25f, 5.3f, -25.72f, 97.37f, -25.72f, 166.78f)
            curveToRelative(0f, 1.11f, 0.03f, 2.25f, 0.03f, 3.38f)
            curveToRelative(-0f, 1.12f, -0.03f, 2.26f, -0.03f, 3.38f)
            curveToRelative(0f, 69.41f, 6.47f, 161.48f, 25.72f, 166.78f)
            lineToRelative(13.69f, 3.78f)
            curveToRelative(0f, 0f, 85.71f, 26f, 152.12f, 28f)
            curveToRelative(66.41f, 2f, 154.97f, -9.67f, 232.93f, -9.5f)
            lineToRelative(124.81f, 0.28f)
            lineToRelative(-8.66f, 35.84f)
            lineToRelative(3.5f, 1.5f)
            curveToRelative(1.75f, 0.63f, 4.96f, 0.93f, 6.47f, 0.94f)
            curveToRelative(0.85f, 0f, 1.76f, -0.07f, 2.69f, -0.25f)
            curveToRelative(0.31f, -0.06f, 0.62f, -0.14f, 0.94f, -0.22f)
            curveToRelative(0.3f, -0.08f, 0.63f, -0.16f, 0.94f, -0.25f)
            curveToRelative(0.63f, -0.19f, 1.26f, -0.42f, 1.88f, -0.69f)
            curveToRelative(1.82f, -0.79f, 3.53f, -1.9f, 4.78f, -3.28f)
            curveToRelative(0.01f, -0.01f, 0.02f, -0.02f, 0.03f, -0.03f)
            curveToRelative(0.62f, -0.7f, 1.11f, -1.45f, 1.47f, -2.28f)
            lineToRelative(12.16f, -31.25f)
            lineToRelative(109.94f, 0.25f)
            curveToRelative(23.9f, 11.94f, 45.51f, 10.72f, 73.59f, 10.72f)
            curveToRelative(133.25f, 0f, 187.63f, -86.59f, 187f, -201.38f)
            curveToRelative(0f, -0.78f, -0.02f, -1.57f, -0.03f, -2.34f)
            curveToRelative(0.01f, -0.78f, 0.03f, -1.56f, 0.03f, -2.34f)
            curveToRelative(0.63f, -114.79f, -53.75f, -201.38f, -187f, -201.38f)
            curveToRelative(-28.08f, 0f, -49.69f, -1.22f, -73.59f, 10.72f)
            lineToRelative(-109.94f, 0.25f)
            lineToRelative(-12.16f, -31.25f)
            curveToRelative(-0.36f, -0.83f, -0.84f, -1.58f, -1.47f, -2.28f)
            curveToRelative(-0.01f, -0.01f, -0.02f, -0.02f, -0.03f, -0.03f)
            curveToRelative(-1.25f, -1.38f, -2.96f, -2.49f, -4.78f, -3.28f)
            curveToRelative(-0.61f, -0.27f, -1.25f, -0.49f, -1.88f, -0.69f)
            curveToRelative(-0.3f, -0.09f, -0.63f, -0.17f, -0.94f, -0.25f)
            curveToRelative(-0.31f, -0.08f, -0.63f, -0.16f, -0.94f, -0.22f)
            curveToRelative(-0.93f, -0.18f, -1.84f, -0.25f, -2.69f, -0.25f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF262626)),
            fillAlpha = 0.896472f,
            strokeAlpha = 0.9f
        ) {
            moveToRelative(347.4f, 368.55f)
            curveToRelative(-33.36f, 0f, -65.31f, 1.8f, -94.81f, 5.06f)
            curveToRelative(25.66f, 48.71f, 97.99f, 30.26f, 205.56f, 31.53f)
            curveToRelative(49.69f, 0.58f, 89.54f, 1.88f, 121.53f, 2.38f)
            curveToRelative(-47.16f, -23.33f, -133.53f, -38.97f, -232.28f, -38.97f)
            close()
        }
        path(
            fill = SolidColor(Color.Black),
            fillAlpha = 0.49804f,
            strokeAlpha = 0.5f
        ) {
            moveToRelative(347.4f, 368.55f)
            curveToRelative(-3.21f, 0f, -6.38f, 0.03f, -9.56f, 0.06f)
            curveToRelative(0.82f, 16.17f, 6.43f, 30.26f, 14.59f, 38.84f)
            curveToRelative(4.67f, -0.08f, 9.5f, -0.2f, 14.44f, -0.34f)
            curveToRelative(-8.57f, -8.19f, -14.59f, -22.23f, -15.72f, -38.56f)
            curveToRelative(-1.25f, -0f, -2.49f, 0f, -3.75f, 0f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF212121)),
            stroke = SolidColor(Color(0xFF191919)),
            strokeLineWidth = 5f
        ) {
            moveToRelative(936.08f, 340.81f)
            lineToRelative(-5.09f, 0.59f)
            curveToRelative(-21.55f, 2.51f, -37.69f, 25.98f, -39.28f, 54.53f)
            lineToRelative(-0.37f, 7.13f)
            lineToRelative(5.25f, -4.84f)
            curveToRelative(15.89f, -14.68f, 28.3f, -32.51f, 37.41f, -52.75f)
            lineToRelative(2.09f, -4.65f)
            close()
        }
        path(
            fillAlpha = 0.5f,
            stroke = SolidColor(Color(0xFF292929)),
            strokeAlpha = 0.5f,
            strokeLineWidth = 6f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
            moveToRelative(730.53f, 351.81f)
            curveToRelative(0f, 0f, 79.68f, -22.6f, 105.38f, -31.98f)
            curveToRelative(26.84f, -9.8f, 98.86f, -39.15f, 98.86f, -39.15f)
            curveToRelative(0f, 0f, -8.74f, 42.47f, -30.48f, 57.92f)
            curveToRelative(-77.23f, 54.87f, -232.69f, 53.85f, -232.69f, 53.85f)
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1A1A1A),
                    1f to Color.Transparent.copy(alpha = 0f)
                ),
                start = Offset(826.7f, 352.96f),
                end = Offset(803.53f, 345.34f)
            )
        ) {
            moveToRelative(817.03f, 331.15f)
            lineToRelative(-4.44f, 2.34f)
            curveToRelative(0.99f, 1.16f, 1.8f, 2.43f, 2.38f, 3.84f)
            curveToRelative(4.8f, 11.72f, -10.74f, 29.24f, -26.88f, 35.78f)
            curveToRelative(-0.52f, 0.21f, -1.81f, 0.84f, -3.41f, 1.66f)
            lineToRelative(13.63f, -3.88f)
            curveToRelative(17.31f, -8.46f, 27.47f, -23.08f, 23f, -34f)
            curveToRelative(-0.92f, -2.24f, -2.38f, -4.17f, -4.28f, -5.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1A1A1A),
                    1f to Color.Transparent.copy(alpha = 0f)
                ),
                start = Offset(856.4f, 339.58f),
                end = Offset(844.64f, 339.64f)
            )
        ) {
            moveToRelative(825.61f, 326.69f)
            lineToRelative(-4.44f, 2.34f)
            curveToRelative(0.99f, 1.16f, 1.8f, 2.43f, 2.38f, 3.84f)
            curveToRelative(4.8f, 11.72f, -10.74f, 29.24f, -26.88f, 35.78f)
            curveToRelative(-0.52f, 0.21f, -1.81f, 0.84f, -3.41f, 1.66f)
            lineToRelative(13.63f, -3.88f)
            curveToRelative(17.31f, -8.46f, 27.47f, -23.08f, 23f, -34f)
            curveToRelative(-0.92f, -2.24f, -2.38f, -4.17f, -4.28f, -5.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1A1A1A),
                    1f to Color.Transparent.copy(alpha = 0f)
                ),
                start = Offset(854.59f, 347.3f),
                end = Offset(790.51f, 341.71f)
            )
        ) {
            moveToRelative(831.8f, 325.27f)
            lineToRelative(-4.44f, 2.34f)
            curveToRelative(0.99f, 1.16f, 1.8f, 2.43f, 2.38f, 3.84f)
            curveToRelative(4.8f, 11.72f, -10.74f, 29.24f, -26.88f, 35.78f)
            curveToRelative(-0.52f, 0.21f, -1.81f, 0.84f, -3.41f, 1.66f)
            lineToRelative(13.63f, -3.88f)
            curveToRelative(17.31f, -8.46f, 27.47f, -23.08f, 23f, -34f)
            curveToRelative(-0.92f, -2.24f, -2.38f, -4.17f, -4.28f, -5.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1A1A1A),
                    1f to Color.Transparent.copy(alpha = 0f)
                ),
                start = Offset(865.72f, 353.62f),
                end = Offset(852.26f, 346.59f)
            )
        ) {
            moveToRelative(848.71f, 321f)
            lineToRelative(-6.19f, 1.84f)
            curveToRelative(0.96f, 1.71f, 1.65f, 3.53f, 2.03f, 5.47f)
            curveToRelative(3.12f, 16.03f, -20.96f, 34.28f, -43.03f, 38.5f)
            curveToRelative(-3.39f, 0.65f, -28.88f, 8.58f, -32.16f, 8.8f)
            verticalLineToRelative(4.13f)
            lineToRelative(41.44f, -12.15f)
            curveToRelative(26.28f, -5.5f, 44.95f, -22.45f, 41.88f, -38.25f)
            curveToRelative(-0.6f, -3.06f, -1.96f, -5.86f, -3.97f, -8.34f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1A1A1A),
                    1f to Color.Transparent.copy(alpha = 0f)
                ),
                start = Offset(849.21f, 363.27f),
                end = Offset(804.49f, 312.3f)
            )
        ) {
            moveToRelative(848.71f, 321f)
            lineToRelative(-6.19f, 1.84f)
            curveToRelative(0.96f, 1.71f, 1.65f, 3.53f, 2.03f, 5.47f)
            curveToRelative(3.12f, 16.03f, -20.96f, 34.28f, -43.03f, 38.5f)
            curveToRelative(-3.39f, 0.65f, -28.88f, 8.58f, -32.16f, 8.8f)
            verticalLineToRelative(4.13f)
            lineToRelative(41.44f, -12.15f)
            curveToRelative(26.28f, -5.5f, 44.95f, -22.45f, 41.88f, -38.25f)
            curveToRelative(-0.6f, -3.06f, -1.96f, -5.86f, -3.97f, -8.34f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1A1A1A),
                    1f to Color.Transparent.copy(alpha = 0f)
                ),
                start = Offset(834.4f, 346.87f),
                end = Offset(760.6f, 347.99f)
            )
        ) {
            moveToRelative(804.18f, 335.77f)
            lineToRelative(-3.96f, 2.09f)
            curveToRelative(0.88f, 1.03f, 1.6f, 2.17f, 2.12f, 3.43f)
            curveToRelative(4.29f, 10.47f, -9.59f, 26.12f, -24.01f, 31.96f)
            curveToRelative(-0.46f, 0.19f, -1.62f, 0.75f, -3.04f, 1.48f)
            lineToRelative(12.17f, -3.46f)
            curveToRelative(15.46f, -7.56f, 24.54f, -20.62f, 20.55f, -30.37f)
            curveToRelative(-0.82f, -2f, -2.12f, -3.72f, -3.82f, -5.14f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1A1A1A),
                    1f to Color.Transparent.copy(alpha = 0f)
                ),
                start = Offset(813.44f, 358.62f),
                end = Offset(752.91f, 355.05f)
            )
        ) {
            moveToRelative(790.38f, 339.34f)
            lineToRelative(-3.96f, 2.09f)
            curveToRelative(0.88f, 1.03f, 1.6f, 2.17f, 2.12f, 3.43f)
            curveToRelative(4.29f, 10.47f, -9.59f, 26.12f, -24.01f, 31.96f)
            curveToRelative(-0.46f, 0.19f, -1.62f, 0.75f, -3.04f, 1.48f)
            lineToRelative(12.17f, -3.46f)
            curveToRelative(15.46f, -7.56f, 24.54f, -20.62f, 20.55f, -30.37f)
            curveToRelative(-0.82f, -2f, -2.12f, -3.72f, -3.82f, -5.14f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1A1A1A),
                    1f to Color.Transparent.copy(alpha = 0f)
                ),
                start = Offset(200.13f, 375.91f),
                end = Offset(177f, 367.17f)
            )
        ) {
            moveToRelative(180.33f, 359.03f)
            curveToRelative(8.29f, -2.02f, 15.49f, -1.48f, 19.8f, 5.79f)
            lineToRelative(-2.49f, 17.9f)
            curveToRelative(-6.88f, 6.17f, -13.75f, 4.95f, -20.63f, 0.16f)
            lineToRelative(3.32f, -23.84f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1A1A1A),
                    1f to Color.Transparent.copy(alpha = 0f)
                ),
                start = Offset(219.44f, 378.37f),
                end = Offset(197.44f, 374.89f)
            )
        ) {
            moveToRelative(200.6f, 362.3f)
            curveToRelative(8.15f, -1.21f, 15.17f, -0.57f, 18.84f, 5.51f)
            lineToRelative(-2.37f, 17.03f)
            curveToRelative(-6.48f, 2.97f, -12.98f, 5.21f, -19.63f, 0.15f)
            lineToRelative(3.16f, -22.69f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF191919)),
            fillAlpha = 0.9f,
            strokeAlpha = 0.9f
        ) {
            moveToRelative(347.4f, 366.06f)
            curveToRelative(-33.45f, 0f, -65.49f, 1.79f, -95.09f, 5.06f)
            lineToRelative(-3.66f, 0.41f)
            lineToRelative(1.72f, 3.25f)
            curveToRelative(6.67f, 12.66f, 16.56f, 21.11f, 29.06f, 26.44f)
            curveToRelative(12.5f, 5.32f, 27.57f, 7.61f, 45.09f, 8.44f)
            curveToRelative(35.04f, 1.65f, 79.95f, -2.63f, 133.59f, -2f)
            curveToRelative(49.66f, 0.58f, 89.51f, 1.88f, 121.53f, 2.38f)
            lineToRelative(1.13f, -4.75f)
            curveToRelative(-47.84f, -23.68f, -134.34f, -39.22f, -233.36f, -39.22f)
            close()
            moveTo(347.4f, 371.06f)
            curveToRelative(91.17f, 0f, 171.75f, 13.48f, 220.09f, 33.72f)
            curveToRelative(-29.95f, -0.58f, -65.21f, -1.61f, -109.31f, -2.13f)
            curveToRelative(-53.94f, -0.63f, -98.98f, 3.65f, -133.4f, 2.03f)
            curveToRelative(-17.21f, -0.81f, -31.77f, -3.11f, -43.41f, -8.06f)
            curveToRelative(-10.45f, -4.45f, -18.49f, -11.15f, -24.5f, -20.91f)
            curveToRelative(28.31f, -2.98f, 58.74f, -4.66f, 90.53f, -4.66f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF262626)),
            fillAlpha = 0.896472f,
            stroke = SolidColor(Color(0xFF191919)),
            strokeAlpha = 0.9f,
            strokeLineWidth = 5f
        ) {
            moveToRelative(207.56f, 120.69f)
            lineToRelative(-77.75f, 12.47f)
            curveToRelative(-27.15f, 4.35f, -48.95f, 48.77f, -51f, 104.84f)
            curveToRelative(2.05f, 56.07f, 23.85f, 100.49f, 51f, 104.84f)
            lineToRelative(77.75f, 12.47f)
            curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
            verticalLineToRelative(-186.62f)
            curveToRelative(0f, -13.3f, -10.7f, -24f, -24f, -24f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF262626)),
            fillAlpha = 0.896472f,
            stroke = SolidColor(Color(0xFF191919)),
            strokeAlpha = 0.9f,
            strokeLineWidth = 5f
        ) {
            moveToRelative(639.02f, 86.47f)
            curveToRelative(-2.97f, 0f, -5.89f, 0.33f, -8.78f, 0.97f)
            curveToRelative(-0.01f, -0.01f, -0.02f, -0.02f, -0.03f, -0.03f)
            lineToRelative(-63.84f, 12.31f)
            curveToRelative(-17.73f, 6.6f, -32f, 14.27f, -32f, 32f)
            verticalLineToRelative(212.56f)
            curveToRelative(0f, 17.73f, 14.27f, 25.4f, 32f, 32f)
            lineToRelative(63.84f, 12.31f)
            curveToRelative(0.01f, -0.01f, 0.02f, -0.02f, 0.03f, -0.03f)
            curveToRelative(2.89f, 0.64f, 5.81f, 0.97f, 8.78f, 0.97f)
            curveToRelative(45.4f, 0f, 82.2f, -57.36f, 82.31f, -151.53f)
            curveToRelative(-0.11f, -94.17f, -36.92f, -151.53f, -82.31f, -151.53f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF262626)),
            fillAlpha = 0.896472f,
            strokeAlpha = 0.9f
        ) {
            moveToRelative(347.4f, 107.46f)
            curveToRelative(-33.36f, 0f, -65.31f, -1.8f, -94.81f, -5.06f)
            curveToRelative(25.66f, -48.71f, 97.99f, -30.26f, 205.56f, -31.53f)
            curveToRelative(49.69f, -0.58f, 89.54f, -1.88f, 121.53f, -2.38f)
            curveToRelative(-47.16f, 23.33f, -133.53f, 38.97f, -232.28f, 38.97f)
            close()
        }
        path(
            fill = SolidColor(Color.Black),
            fillAlpha = 0.49804f,
            strokeAlpha = 0.5f
        ) {
            moveToRelative(347.4f, 107.46f)
            curveToRelative(-3.21f, 0f, -6.38f, -0.03f, -9.56f, -0.06f)
            curveToRelative(0.82f, -16.17f, 6.43f, -30.26f, 14.59f, -38.84f)
            curveToRelative(4.67f, 0.08f, 9.5f, 0.2f, 14.44f, 0.34f)
            curveToRelative(-8.57f, 8.19f, -14.59f, 22.23f, -15.72f, 38.56f)
            curveToRelative(-1.25f, 0f, -2.49f, 0f, -3.75f, 0f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF212121)),
            stroke = SolidColor(Color(0xFF191919)),
            strokeLineWidth = 5f
        ) {
            moveToRelative(936.08f, 135.2f)
            lineToRelative(-5.09f, -0.59f)
            curveToRelative(-21.55f, -2.51f, -37.69f, -25.98f, -39.28f, -54.53f)
            lineToRelative(-0.37f, -7.13f)
            lineToRelative(5.25f, 4.84f)
            curveToRelative(15.89f, 14.68f, 28.3f, 32.51f, 37.41f, 52.75f)
            lineToRelative(2.09f, 4.66f)
            close()
        }
        path(
            fillAlpha = 0.5f,
            stroke = SolidColor(Color(0xFF292929)),
            strokeAlpha = 0.5f,
            strokeLineWidth = 6f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round
        ) {
            moveToRelative(730.53f, 124.2f)
            curveToRelative(0f, 0f, 79.68f, 22.6f, 105.38f, 31.98f)
            curveToRelative(26.84f, 9.8f, 98.86f, 39.15f, 98.86f, 39.15f)
            curveToRelative(0f, 0f, -8.74f, -42.47f, -30.48f, -57.92f)
            curveToRelative(-77.23f, -54.87f, -232.69f, -53.86f, -232.69f, -53.86f)
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1A1A1A),
                    1f to Color.Transparent.copy(alpha = 0f)
                ),
                start = Offset(826.7f, 123.01f),
                end = Offset(803.53f, 130.63f)
            )
        ) {
            moveToRelative(817.03f, 144.86f)
            lineToRelative(-4.44f, -2.34f)
            curveToRelative(0.99f, -1.16f, 1.8f, -2.43f, 2.38f, -3.84f)
            curveToRelative(4.8f, -11.72f, -10.74f, -29.24f, -26.88f, -35.78f)
            curveToRelative(-0.52f, -0.21f, -1.81f, -0.84f, -3.41f, -1.66f)
            lineToRelative(13.63f, 3.88f)
            curveToRelative(17.31f, 8.46f, 27.47f, 23.08f, 23f, 34f)
            curveToRelative(-0.92f, 2.24f, -2.38f, 4.17f, -4.28f, 5.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1A1A1A),
                    1f to Color.Transparent.copy(alpha = 0f)
                ),
                start = Offset(856.4f, 136.45f),
                end = Offset(844.64f, 136.39f)
            )
        ) {
            moveToRelative(825.61f, 149.32f)
            lineToRelative(-4.44f, -2.34f)
            curveToRelative(0.99f, -1.16f, 1.8f, -2.43f, 2.38f, -3.84f)
            curveToRelative(4.8f, -11.72f, -10.74f, -29.24f, -26.88f, -35.78f)
            curveToRelative(-0.52f, -0.21f, -1.81f, -0.84f, -3.41f, -1.66f)
            lineToRelative(13.63f, 3.88f)
            curveToRelative(17.31f, 8.46f, 27.47f, 23.08f, 23f, 34f)
            curveToRelative(-0.92f, 2.24f, -2.38f, 4.17f, -4.28f, 5.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1A1A1A),
                    1f to Color.Transparent.copy(alpha = 0f)
                ),
                start = Offset(854.59f, 128.71f),
                end = Offset(790.51f, 134.3f)
            )
        ) {
            moveToRelative(831.8f, 150.73f)
            lineToRelative(-4.44f, -2.34f)
            curveToRelative(0.99f, -1.16f, 1.8f, -2.43f, 2.38f, -3.84f)
            curveToRelative(4.8f, -11.72f, -10.74f, -29.24f, -26.88f, -35.78f)
            curveToRelative(-0.52f, -0.21f, -1.81f, -0.84f, -3.41f, -1.66f)
            lineToRelative(13.63f, 3.88f)
            curveToRelative(17.31f, 8.46f, 27.47f, 23.08f, 23f, 34f)
            curveToRelative(-0.92f, 2.24f, -2.38f, 4.17f, -4.28f, 5.75f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1A1A1A),
                    1f to Color.Transparent.copy(alpha = 0f)
                ),
                start = Offset(865.72f, 122.41f),
                end = Offset(852.26f, 129.44f)
            )
        ) {
            moveToRelative(848.71f, 155.01f)
            lineToRelative(-6.19f, -1.84f)
            curveToRelative(0.96f, -1.71f, 1.65f, -3.53f, 2.03f, -5.47f)
            curveToRelative(3.12f, -16.03f, -20.96f, -34.28f, -43.03f, -38.5f)
            curveToRelative(-3.39f, -0.65f, -28.88f, -8.58f, -32.16f, -8.8f)
            verticalLineToRelative(-4.13f)
            lineToRelative(41.44f, 12.15f)
            curveToRelative(26.28f, 5.5f, 44.95f, 22.45f, 41.88f, 38.25f)
            curveToRelative(-0.6f, 3.06f, -1.96f, 5.86f, -3.97f, 8.34f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1A1A1A),
                    1f to Color.Transparent.copy(alpha = 0f)
                ),
                start = Offset(849.21f, 112.76f),
                end = Offset(804.49f, 163.73f)
            )
        ) {
            moveToRelative(848.71f, 155.01f)
            lineToRelative(-6.19f, -1.84f)
            curveToRelative(0.96f, -1.71f, 1.65f, -3.53f, 2.03f, -5.47f)
            curveToRelative(3.12f, -16.03f, -20.96f, -34.28f, -43.03f, -38.5f)
            curveToRelative(-3.39f, -0.65f, -28.88f, -8.58f, -32.16f, -8.8f)
            verticalLineToRelative(-4.13f)
            lineToRelative(41.44f, 12.15f)
            curveToRelative(26.28f, 5.5f, 44.95f, 22.45f, 41.88f, 38.25f)
            curveToRelative(-0.6f, 3.06f, -1.96f, 5.86f, -3.97f, 8.34f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1A1A1A),
                    1f to Color.Transparent.copy(alpha = 0f)
                ),
                start = Offset(834.4f, 129.12f),
                end = Offset(760.6f, 128f)
            )
        ) {
            moveToRelative(804.18f, 140.24f)
            lineToRelative(-3.96f, -2.09f)
            curveToRelative(0.88f, -1.03f, 1.6f, -2.17f, 2.12f, -3.43f)
            curveToRelative(4.29f, -10.47f, -9.59f, -26.12f, -24.01f, -31.96f)
            curveToRelative(-0.46f, -0.19f, -1.62f, -0.75f, -3.04f, -1.48f)
            lineToRelative(12.17f, 3.46f)
            curveToRelative(15.46f, 7.56f, 24.54f, 20.62f, 20.55f, 30.37f)
            curveToRelative(-0.82f, 2f, -2.12f, 3.72f, -3.82f, 5.14f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1A1A1A),
                    1f to Color.Transparent.copy(alpha = 0f)
                ),
                start = Offset(813.44f, 117.35f),
                end = Offset(752.91f, 120.92f)
            )
        ) {
            moveToRelative(790.38f, 136.67f)
            lineToRelative(-3.96f, -2.09f)
            curveToRelative(0.88f, -1.03f, 1.6f, -2.17f, 2.12f, -3.43f)
            curveToRelative(4.29f, -10.47f, -9.59f, -26.12f, -24.01f, -31.96f)
            curveToRelative(-0.46f, -0.19f, -1.62f, -0.75f, -3.04f, -1.48f)
            lineToRelative(12.17f, 3.46f)
            curveToRelative(15.46f, 7.56f, 24.54f, 20.62f, 20.55f, 30.37f)
            curveToRelative(-0.82f, 2f, -2.12f, 3.72f, -3.82f, 5.14f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1A1A1A),
                    1f to Color.Transparent.copy(alpha = 0f)
                ),
                start = Offset(200.13f, 100.13f),
                end = Offset(177f, 108.86f)
            )
        ) {
            moveToRelative(180.33f, 116.97f)
            curveToRelative(8.29f, 2.02f, 15.49f, 1.48f, 19.8f, -5.79f)
            lineToRelative(-2.49f, -17.9f)
            curveToRelative(-6.88f, -6.17f, -13.75f, -4.95f, -20.63f, -0.16f)
            lineToRelative(3.32f, 23.84f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF1A1A1A),
                    1f to Color.Transparent.copy(alpha = 0f)
                ),
                start = Offset(219.44f, 97.65f),
                end = Offset(197.44f, 101.13f)
            )
        ) {
            moveToRelative(200.6f, 113.71f)
            curveToRelative(8.15f, 1.21f, 15.17f, 0.57f, 18.84f, -5.51f)
            lineToRelative(-2.37f, -17.03f)
            curveToRelative(-6.48f, -2.97f, -12.98f, -5.21f, -19.63f, -0.15f)
            lineToRelative(3.16f, 22.69f)
            close()
        }
        path(
            fill = SolidColor(Color(0xFF191919)),
            fillAlpha = 0.9f,
            strokeAlpha = 0.9f
        ) {
            moveToRelative(347.4f, 109.95f)
            curveToRelative(-33.45f, 0f, -65.49f, -1.79f, -95.09f, -5.06f)
            lineToRelative(-3.66f, -0.41f)
            lineToRelative(1.72f, -3.25f)
            curveToRelative(6.67f, -12.66f, 16.56f, -21.11f, 29.06f, -26.44f)
            curveToRelative(12.5f, -5.32f, 27.57f, -7.61f, 45.09f, -8.44f)
            curveToRelative(35.04f, -1.65f, 79.95f, 2.63f, 133.59f, 2f)
            curveToRelative(49.66f, -0.58f, 89.51f, -1.88f, 121.53f, -2.38f)
            lineToRelative(1.13f, 4.75f)
            curveToRelative(-47.85f, 23.67f, -134.36f, 39.22f, -233.37f, 39.22f)
            close()
            moveTo(347.4f, 104.95f)
            curveToRelative(91.17f, 0f, 171.75f, -13.48f, 220.09f, -33.72f)
            curveToRelative(-29.95f, 0.58f, -65.21f, 1.61f, -109.31f, 2.13f)
            curveToRelative(-53.94f, 0.63f, -98.98f, -3.65f, -133.4f, -2.03f)
            curveToRelative(-17.21f, 0.81f, -31.77f, 3.11f, -43.41f, 8.06f)
            curveToRelative(-10.45f, 4.45f, -18.49f, 11.15f, -24.5f, 20.91f)
            curveToRelative(28.31f, 2.98f, 58.74f, 4.66f, 90.53f, 4.66f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CarPreview() {
    JetGameTheme {
        val carColor = MaterialTheme.colorScheme.primary
        Image(
            modifier = Modifier.size(150.dp),
            imageVector = jetCarImageVector(carColor),
            contentDescription = "car"
        )
    }
}