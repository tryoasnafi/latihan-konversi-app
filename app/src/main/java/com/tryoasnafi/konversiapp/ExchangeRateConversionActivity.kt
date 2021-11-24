package com.tryoasnafi.konversiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ExchangeRateConversionActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var edtRupiah: EditText
    private lateinit var tvResult: TextView
    private lateinit var btnCalculateExchangeRate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exchange_rate_conversion)

        edtRupiah = findViewById(R.id.edt_rupiah)
        tvResult = findViewById(R.id.tv_result)
        btnCalculateExchangeRate = findViewById(R.id.btn_calculate_exchange_rate)

        btnCalculateExchangeRate.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_calculate_exchange_rate) {
            val inputRupiah = edtRupiah.text.toString().trim()
            if (inputRupiah.isNotEmpty()) {
                val result = inputRupiah.toDouble() / 15000
                tvResult.setText("%.2f".format(result))
            } else {
                edtRupiah.error = "Field ini tidak boleh kosong!"
            }
        }
    }
}