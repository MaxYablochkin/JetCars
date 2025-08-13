@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3ExpressiveApi::class)

package com.dev.maxyablochkin.jetgame.presentation.game

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Bookmarks
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.FilledTonalIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.dev.maxyablochkin.jetgame.R
import com.dev.maxyablochkin.jetgame.core.data.PlayerEntity
import com.dev.maxyablochkin.jetgame.presentation.images_svg.Car
import com.dev.maxyablochkin.jetgame.presentation.navigation.AppNavGraph
import com.dev.maxyablochkin.jetgame.presentation.navigation.LocalNavController
import com.dev.maxyablochkin.jetgame.presentation.theme.JetGameTheme

internal fun NavGraphBuilder.game() {
    composable<AppNavGraph.Game> {
        GameScreenRoot()
    }
}

@Composable
private fun GameScreenRoot(viewModel: GameViewModel = hiltViewModel()) {
    val state by viewModel.state.collectAsStateWithLifecycle()
    val navController = LocalNavController.current

    GameScreen(
        state = state,
        onAction = viewModel::onAction,
        onNavigateResult = { navController.navigate(AppNavGraph.Result) },
        onNavigateBack = { navController.navigateUp() }
    )
}

@SuppressLint("UnusedBoxWithConstraintsScope")
@Composable
private fun GameScreen(
    state: GameState,
    onAction: (GameAction) -> Unit,
    onNavigateResult: () -> Unit,
    onNavigateBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                modifier = modifier,
                title = {
                    Text(
                        text = "${stringResource(R.string.score)}: ${state.score}",
                        color = MaterialTheme.colorScheme.tertiary,
                        style = MaterialTheme.typography.displaySmallEmphasized,
                        fontWeight = FontWeight.ExtraBold,
                        letterSpacing = 3.sp,
                        fontStyle = FontStyle.Italic
                    )
                },
                navigationIcon = {
                    FilledTonalIconButton(
                        onClick = onNavigateBack,
                        shapes = IconButtonDefaults.shapes()
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Rounded.ArrowBack,
                            contentDescription = "navigate up"
                        )
                    }
                },
                actions = {
                    IconButton(
                        onClick = onNavigateResult,
                        shapes = IconButtonDefaults.shapes()
                    ) {
                        Icon(imageVector = Icons.Rounded.Bookmarks, contentDescription = "results")
                    }
                }
            )
        }
    ) { innerPadding ->
        Box(
            modifier = modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(Color.DarkGray)
        ) {
            BoxWithConstraints(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth(0.4f)
                    .background(Color.Gray)
                    .align(Alignment.Center)
            ) {
                val roadWidthPx = constraints.maxWidth.toFloat()
                val roadHeightPx = constraints.maxHeight.toFloat()
                val density = LocalDensity.current

                val carSizeDp = 64.dp
                val carSizePx = with(density) { carSizeDp.toPx() }
                val carX = (state.carX * (roadWidthPx - carSizePx)).toInt()
                val carY = (roadHeightPx - carSizePx).toInt()

                Car(
                    modifier = Modifier
                        .size(carSizeDp)
                        // Render phase
                        .offset { IntOffset(x = carX, y = carY) },
                    color = MaterialTheme.colorScheme.primary
                )

                for (obs in state.obstacles) {
                    val obsSizePx = obs.size * roadWidthPx
                    val obsSizeDp = with(density) { obsSizePx.toDp() }
                    val obsX = (obs.x * (roadWidthPx - obsSizePx)).toInt()
                    val obsY = (obs.y * roadHeightPx).toInt()

                    Box(
                        modifier = Modifier
                            .offset { IntOffset(x = obsX, y = obsY) }
                            .size(obsSizeDp)
                            .background(Color(0xFF8B4513))
                    )
                }

                if (state.isGameOver) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.Black.copy(alpha = 0.3f))
                            .clickable { onAction(GameAction.Restart) },
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "${stringResource(R.string.game_over)}\n${stringResource(R.string.tap_to_restart)}",
                            color = Color.White,
                            fontSize = 24.sp,
                            textAlign = TextAlign.Center
                        )
                    }
                    onAction(GameAction.SavePlayer(PlayerEntity(score = state.score)))
                }
            }

            Row(
                modifier = Modifier.fillMaxSize()
            ) {
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight(0.5f)
                        .align(alignment = Alignment.Bottom)
                        .clickable { onAction(GameAction.MoveCar(Direction.LEFT)) }
                )
                Box(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight(0.5f)
                        .align(alignment = Alignment.Bottom)
                        .clickable { onAction(GameAction.MoveCar(Direction.RIGHT)) }
                )
            }
        }
    }
}

@Preview
@Composable
private fun GameScreenPreview() {
    JetGameTheme {
        GameScreen(
            state = GameState(),
            onAction = { },
            onNavigateResult = { },
            onNavigateBack = { }
        )
    }
}