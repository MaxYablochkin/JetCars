@file:OptIn(ExperimentalMaterial3ExpressiveApi::class, ExperimentalMaterial3Api::class)

package com.dev.maxyablochkin.jetgame.presentation.start

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DirectionsCar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExperimentalMaterial3ExpressiveApi
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.dev.maxyablochkin.jetgame.R
import com.dev.maxyablochkin.jetgame.presentation.navigation.AppNavGraph
import com.dev.maxyablochkin.jetgame.presentation.navigation.LocalNavController
import com.dev.maxyablochkin.jetgame.presentation.theme.JetGameTheme

internal fun NavGraphBuilder.start() {
    composable<AppNavGraph.Start> {
        StartScreenRoot()
    }
}

@Composable
private fun StartScreenRoot() {
    val navController = LocalNavController.current

    StartScreen(onNavigateGame = { navController.navigate(AppNavGraph.Game) })
}

@Composable
private fun StartScreen(
    modifier: Modifier = Modifier,
    onNavigateGame: () -> Unit
) {
    Scaffold(
        modifier = modifier,
        topBar = { JetCarsTopAppBar() }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentAlignment = Alignment.Center
        ) {
            JetCarsButton { onNavigateGame() }
        }
    }
}

@Composable
private fun JetCarsTopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        modifier = modifier,
        expandedHeight = 100.dp,
        title = {
            Text(
                text = stringResource(R.string.app_name),
                color = MaterialTheme.colorScheme.tertiary,
                style = MaterialTheme.typography.displayLargeEmphasized.copy(
                    shadow = Shadow(
                        color = MaterialTheme.colorScheme.onTertiaryContainer,
                        blurRadius = 50f
                    ),
                ),
                fontWeight = FontWeight.ExtraBold,
                letterSpacing = 3.sp,
                fontStyle = FontStyle.Italic
            )
        }
    )
}

@Composable
private fun JetCarsButton(modifier: Modifier = Modifier, onClick: () -> Unit) {
    val buttonHeight = ButtonDefaults.ExtraLargeContainerHeight

    Button(
        onClick = onClick,
        modifier = modifier.heightIn(buttonHeight),
        contentPadding = ButtonDefaults.contentPaddingFor(buttonHeight),
        shapes = ButtonDefaults.shapesFor(buttonHeight)
    ) {
        Icon(
            imageVector = Icons.Filled.DirectionsCar,
            contentDescription = "car",
            modifier = Modifier.size(ButtonDefaults.iconSizeFor(buttonHeight)),
        )
        Spacer(modifier = Modifier.size(ButtonDefaults.iconSpacingFor(buttonHeight)))
        Text(
            text = stringResource(R.string.start_btn),
            style = ButtonDefaults.textStyleFor(buttonHeight),
            fontWeight = Bold,
            letterSpacing = 5.sp,
            fontStyle = FontStyle.Italic
        )
    }
}

@Preview
@Composable
private fun StartScreenPreview() {
    JetGameTheme {
        StartScreen { }
    }
}