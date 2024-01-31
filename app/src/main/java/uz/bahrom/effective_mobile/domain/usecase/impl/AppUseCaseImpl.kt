package uz.bahrom.effective_mobile.domain.usecase.impl

import uz.bahrom.effective_mobile.domain.repository.AppRepository
import uz.bahrom.effective_mobile.domain.usecase.AppUseCase
import javax.inject.Inject

class AppUseCaseImpl @Inject constructor(
    private val repository: AppRepository
) : AppUseCase {
}