@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3ExpressiveApi::class)

package com.dev.maxyablochkin.jetgame.presentation.result

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.displayCutout
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.union
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.FilledTonalIconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.dev.maxyablochkin.jetgame.R
import com.dev.maxyablochkin.jetgame.core.data.PlayerEntity
import com.dev.maxyablochkin.jetgame.presentation.navigation.AppNavGraph
import com.dev.maxyablochkin.jetgame.presentation.navigation.LocalNavController
import com.dev.maxyablochkin.jetgame.presentation.theme.JetGameTheme

internal fun NavGraphBuilder.result() {
    composable<AppNavGraph.Result> {
        ResultScreenRoot()
    }
}

@Composable
private fun ResultScreenRoot(viewModel: ResultViewModel = hiltViewModel()) {
    val playerData by viewModel.getPlayerData.collectAsStateWithLifecycle(initialValue = emptyList())
    val navController = LocalNavController.current

    ResultScreen(
        playerData = playerData,
        onNavigateBack = { navController.navigateUp() }
    )
}

@Composable
private fun ResultScreen(
    playerData: List<PlayerEntity>,
    onNavigateBack: () -> Unit,
    modifier: Modifier = Modifier
) {
    Scaffold(
        modifier = modifier,
        contentWindowInsets = WindowInsets.statusBars.union(insets = WindowInsets.displayCutout),
        topBar = {
            CenterAlignedTopAppBar(
                modifier = modifier,
                title = {
                    Text(
                        text = stringResource(R.string.results),
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
                }
            )
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentAlignment = Alignment.BottomCenter
        ) {
            Surface(
                modifier = Modifier.fillMaxHeight(0.95f),
                shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp),
                color = MaterialTheme.colorScheme.surfaceContainerHigh
            ) {
                LazyColumn(
                    contentPadding = PaddingValues(25.dp),
                    verticalArrangement = Arrangement.spacedBy(15.dp)
                ) {
                    items(items = playerData, key = { it.id!! }) { playerData ->
                        ResultItem(
                            modifier = Modifier.fillParentMaxWidth(),
                            score = playerData.score
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun ResultItem(modifier: Modifier = Modifier, score: Int) {
    Surface(
        modifier = modifier.height(74.dp),
        shape = RoundedCornerShape(50.dp),
        color = MaterialTheme.colorScheme.surfaceContainerLow
    ) {
        Box(contentAlignment = Alignment.Center) {
            Text(
                text = "$score",
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.displayMedium,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview
@Composable
private fun ResultScreenPreview() {
    val wrongPlayerData = listOf(
        PlayerEntity(id = 0, score = 15),
        PlayerEntity(id = 1, score = 16),
        PlayerEntity(id = 2, score = 77),
        PlayerEntity(id = 3, score = 4),
        PlayerEntity(id = 4, score = 7),
        PlayerEntity(id = 5, score = 88),
        PlayerEntity(id = 6, score = 1),
        PlayerEntity(id = 7, score = 14),
        PlayerEntity(id = 8, score = 16),
        PlayerEntity(id = 9, score = 17),
        PlayerEntity(id = 10, score = 17),
        PlayerEntity(id = 11, score = 19),
        PlayerEntity(id = 12, score = 22),
        PlayerEntity(id = 13, score = 23),
    )

    JetGameTheme {
        ResultScreen(
            playerData = wrongPlayerData,
            onNavigateBack = { }
        )
    }
}