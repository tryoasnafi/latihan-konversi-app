package com.tryoasnafi.konversiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnExchangeRateConversion: Button = findViewById(R.id.btn_exchange_rate_conversion);
        val btnTemperatureConversion: Button = findViewById(R.id.btn_temperature_conversion);

        btnExchangeRateConversion.setOnClickListener(this)
        btnTemperatureConversion.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btn_exchange_rate_conversion -> {
                val exchangeRateConversionIntent = Intent(this@MainActivity, ExchangeRateConversionActivity::class.java)
                startActivity(exchangeRateConversionIntent)
            }
            R.id.btn_temperature_conversion -> {
                val temperatureConversionIntent = Intent(this@MainActivity, TemperatureConversionActivity::class.java)
                startActivity(temperatureConversionIntent)
            }
        }
    }
}