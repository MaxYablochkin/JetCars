package com.dev.maxyablochkin.jetgame.presentation.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.dev.maxyablochkin.jetgame.presentation.game.game
import com.dev.maxyablochkin.jetgame.presentation.loading.loading
import com.dev.maxyablochkin.jetgame.presentation.result.result
import com.dev.maxyablochkin.jetgame.presentation.start.start

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    startDestination: AppNavGraph = AppNavGraph.Loading
) {
    val navController = rememberNavController()

    CompositionLocalProvider(LocalNavController provides navController) {
        NavHost(
            modifier = modifier,
            navController = navController,
            startDestination = startDestination,
            enterTransition = {
                fadeIn(
                    animationSpec = tween(
                        durationMillis = 250,
                        easing = LinearEasing
                    )
                ) + slideIntoContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Start,
                    animationSpec = tween(400)
                )
            },
            exitTransition = {
                fadeOut(
                    animationSpec = tween(
                        durationMillis = 250,
                        easing = LinearEasing
                    )
                ) + slideOutOfContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Start,
                    animationSpec = tween(400)
                )
            },
            popEnterTransition = {
                fadeIn(
                    animationSpec = tween(
                        durationMillis = 250,
                        easing = LinearEasing
                    )
                ) + slideIntoContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.End,
                    animationSpec = tween(400)
                )
            },
            popExitTransition = {
                fadeOut(
                    animationSpec = tween(
                        durationMillis = 250,
                        easing = LinearEasing
                    )
                ) + slideOutOfContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.End,
                    animationSpec = tween(400)
                )
            },
            builder = { loading(); start(); game(); result() },
        )
    }
}

val LocalNavController = staticCompositionLocalOf<NavHostController> { error("No provided") }