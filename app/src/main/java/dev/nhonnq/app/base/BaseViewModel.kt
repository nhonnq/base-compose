package dev.nhonnq.app.base

import androidx.lifecycle.ViewModel
import dev.nhonnq.app.utils.NetworkConnectivity
import javax.inject.Inject

abstract class BaseViewModel : ViewModel() {

    @Inject
    lateinit var networkConnectivity: NetworkConnectivity

    fun isNetworkAvailable(): Boolean {
        return networkConnectivity.isConnected()
    }

}
