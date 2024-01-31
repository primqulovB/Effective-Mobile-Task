package uz.bahrom.effective_mobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.NavHostFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import uz.bahrom.effective_mobile.databinding.ActivityMainBinding
import uz.bahrom.effective_mobile.utils.navigator.AppNavigatorHandler
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var handler: AppNavigatorHandler
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val container = binding.fcvContainer
        val navController = container.getFragment<NavHostFragment>().navController


        handler.buffer
            .onEach { actionCallBack ->
                navController.actionCallBack()
            }.launchIn(lifecycleScope)
    }
}