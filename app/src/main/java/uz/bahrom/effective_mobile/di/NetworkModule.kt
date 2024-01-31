package uz.bahrom.effective_mobile.di

import android.content.Context
import com.chuckerteam.chucker.api.ChuckerInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import uz.bahrom.effective_mobile.data.source.remote.api.EffectiveApi
import uz.bahrom.effective_mobile.utils.Constants.BASE_URL
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @[Provides Singleton]
    fun provideClient(@ApplicationContext context: Context): OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(ChuckerInterceptor.Builder(context).build())
        .build()

    @[Provides Singleton]
    fun provideRetrofit(client: OkHttpClient): Retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .baseUrl(BASE_URL)
        .build()

    @[Provides Singleton]
    fun provideApi(retrofit: Retrofit): EffectiveApi = retrofit.create()
}
