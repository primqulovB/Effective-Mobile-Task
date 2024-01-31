package uz.bahrom.effective_mobile.utils.navigator

import androidx.navigation.NavDirections

interface AppNavigator {
    suspend fun navigateTo(directions: NavDirections)
    suspend fun navigateUp()
}