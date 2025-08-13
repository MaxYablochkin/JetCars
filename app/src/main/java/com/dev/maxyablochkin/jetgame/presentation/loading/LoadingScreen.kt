@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3ExpressiveApi::class)

package com.dev.maxyablochkin.jetgame.presentation.loading

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DirectionsCar
import androidx.compose.material3.CircularWavyProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ProgressIndicatorDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.dev.maxyablochkin.jetgame.presentation.navigation.AppNavGraph
import com.dev.maxyablochkin.jetgame.presentation.navigation.LocalNavController
import com.dev.maxyablochkin.jetgame.presentation.theme.JetGameTheme

internal fun NavGraphBuilder.loading() {
    composable<AppNavGraph.Loading> {
        LoadingScreenRoot()
    }
}

@Composable
private fun LoadingScreenRoot(viewModel: LoadingViewModel = viewModel()) {
    val state by viewModel.loadingState.collectAsStateWithLifecycle()
    val navController = LocalNavController.current

    LoadingScreen(
        state = state,
        onAction = viewModel::onAction,
        onNavigateStart = { navController.navigate(AppNavGraph.Start) }
    )
}

@Composable
private fun LoadingScreen(
    state: LoadingState,
    onAction: (LoadingAction) -> Unit,
    onNavigateStart: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        onAction(LoadingAction.ProgressChange)
        JetCarsLoading(progress = state.progress)

        if (state.progress >= 1f) {
            onNavigateStart()
        }
    }
}

@Composable
private fun JetCarsLoading(modifier: Modifier = Modifier, progress: Float) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        val animatedProgress by animateFloatAsState(
            targetValue = progress,
            animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec
        )

        CircularWavyProgressIndicator(
            modifier = Modifier.size(300.dp),
            progress = { animatedProgress },
            amplitude = { animatedProgress },
            wavelength = 100.dp,
            trackStroke = Stroke(width = 50f, cap = StrokeCap.Round),
            stroke = Stroke(width = 50f, cap = StrokeCap.Round)
        )

        Icon(
            modifier = Modifier.size(150.dp),
            imageVector = Icons.Default.DirectionsCar,
            tint = MaterialTheme.colorScheme.onSurface,
            contentDescription = "car"
        )
    }
}

@Preview()
@Composable
private fun LoadingScreenPreview() {
    JetGameTheme {
        LoadingScreen(
            state = LoadingState(),
            onAction = { },
            onNavigateStart = { }
        )
    }
}