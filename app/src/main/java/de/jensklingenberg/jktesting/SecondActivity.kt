package de.jensklingenberg.jktesting

import android.content.Context
import android.net.ConnectivityManager
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        testBTN.setOnClickListener { testBTN.text="BYE" }

        if (test(this)) {
            Log.d("MainActivity","HIer")
        }else{
            Log.d("MainActivity","No")

        }

    }






fun test(context: Context): Boolean {
    return (context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager).activeNetworkInfo.isConnected
}
}
