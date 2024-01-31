package uz.bahrom.effective_mobile.data.source.remote.api

import retrofit2.Response
import retrofit2.http.GET
import uz.bahrom.effective_mobile.data.source.remote.response.GetAllProductsResponse
import uz.bahrom.effective_mobile.utils.Constants.END_POINT

interface EffectiveApi {
    @GET(END_POINT)
    suspend fun getAllProducts(): Response<GetAllProductsResponse>
}