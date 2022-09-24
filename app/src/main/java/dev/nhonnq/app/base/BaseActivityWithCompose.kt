package dev.nhonnq.app.base

import android.os.Bundle
import androidx.activity.ComponentActivity

abstract class BaseActivityWithCompose : ComponentActivity() {

    abstract fun observeViewModel()
    abstract fun showError(errorCode: Int)
    abstract fun showLoadingView()
    abstract fun hideLoadingView()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        observeViewModel()

    }

}
