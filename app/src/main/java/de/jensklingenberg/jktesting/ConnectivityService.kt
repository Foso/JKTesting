package de.jensklingenberg.jktesting

import android.content.Context
import android.net.ConnectivityManager
import javax.inject.Inject

interface IConnectivityService {
    fun isWifiEnabled(): Boolean
}

class ConnectivityService(val context: Context) : IConnectivityService {

    override fun isWifiEnabled(): Boolean {
        return (context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager).activeNetworkInfo.isConnected
    }

}