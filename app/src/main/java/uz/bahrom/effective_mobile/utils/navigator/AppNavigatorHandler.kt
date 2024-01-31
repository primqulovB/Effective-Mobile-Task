package uz.bahrom.effective_mobile.utils.navigator

import androidx.navigation.NavController
import kotlinx.coroutines.flow.SharedFlow

typealias AppNavigationArgs = NavController.() -> Unit

interface AppNavigatorHandler {
    val buffer: SharedFlow<AppNavigationArgs>
}