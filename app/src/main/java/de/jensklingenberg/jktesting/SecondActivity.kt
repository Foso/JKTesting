package de.jensklingenberg.jktesting

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class SecondActivity : AppCompatActivity() {

    @Inject
    lateinit var connectivityManager: IConnectivityService

    private fun initializeDagger() = (application as App).appComponent.inject(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeDagger()

        testBTN.setOnClickListener { testBTN.text="BYE" }

        button.setOnClickListener { Toast.makeText(this,getString(R.string.hello),Toast.LENGTH_SHORT).show() }

        if (connectivityManager.isWifiEnabled()) {
            Log.d("MainActivity","HIer")
             Toast.makeText(this,"COnnected",Toast.LENGTH_SHORT).show()
        }else{
            Log.d("MainActivity","No")
           Toast.makeText(this,"Nicht connected",Toast.LENGTH_SHORT).show()
        }

    }




}
