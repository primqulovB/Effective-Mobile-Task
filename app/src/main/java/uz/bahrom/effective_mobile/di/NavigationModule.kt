package uz.bahrom.effective_mobile.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import uz.bahrom.effective_mobile.utils.navigator.AppNavigationDispatcher
import uz.bahrom.effective_mobile.utils.navigator.AppNavigator
import uz.bahrom.effective_mobile.utils.navigator.AppNavigatorHandler

@[Module InstallIn(SingletonComponent::class)]
interface NavigationModule {

    @Binds
    fun bindAppNavigator(impl: AppNavigationDispatcher): AppNavigator

    @Binds
    fun bindAppNavigatorHandler(impl: AppNavigationDispatcher): AppNavigatorHandler
}