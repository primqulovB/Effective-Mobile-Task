package uz.bahrom.effective_mobile.data.repository

import uz.bahrom.effective_mobile.data.source.remote.api.EffectiveApi
import uz.bahrom.effective_mobile.domain.repository.AppRepository
import javax.inject.Inject

class AppRepositoryImpl @Inject constructor(
    private val api: EffectiveApi
) : AppRepository {
}