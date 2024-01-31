package uz.bahrom.effective_mobile.data.source.local.preferenc

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class MySharedPref @Inject constructor(
    @ApplicationContext context: Context
) {
    private val pref = context.getSharedPreferences("EFFECTIVE_MOBILE", Context.MODE_PRIVATE)


}