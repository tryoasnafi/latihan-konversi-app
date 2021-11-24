package com.tryoasnafi.konversiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class TemperatureConversionActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtCelcius: EditText
    private lateinit var tvResultFahrenheit: TextView
    private lateinit var tvResultReaumur: TextView
    private lateinit var tvResultKelvin: TextView
    private lateinit var btnCalculate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temperature_conversion)

        edtCelcius = findViewById(R.id.edt_celcius)
        tvResultFahrenheit = findViewById(R.id.tv_result_fahrenheit)
        tvResultReaumur = findViewById(R.id.tv_result_reaumur)
        tvResultKelvin = findViewById(R.id.tv_result_kelvin)

        btnCalculate = findViewById(R.id.btn_calculate_temperature)
        btnCalculate.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_calculate_temperature) {
            val inputCelcius = edtCelcius.text.toString().trim()
            if (inputCelcius.isNotEmpty()) {
                val celciusToFahrenheit = inputCelcius.toDouble() * 1.8 + 32
                val celciusToReaumur = inputCelcius.toDouble() * 0.8
                val celciusToKelvin = inputCelcius.toDouble() + 273.15

                tvResultFahrenheit.setText("%.2f".format(celciusToFahrenheit))
                tvResultReaumur.setText("%.2f".format(celciusToReaumur))
                tvResultKelvin.setText("%.2f".format(celciusToKelvin))
            } else {
                edtCelcius.error = "Field ini tidak boleh kosong!"
            }
        }
    }
}