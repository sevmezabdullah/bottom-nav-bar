package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.myapplication.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var tasarim: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = DataBindingUtil.setContentView(this, R.layout.activity_main)

        toplama.setOnClickListener {
            val alinanSayi = birinciSayi.text.toString()
            val alinanSayi2 = ikinciSayi.text.toString()

            val sayi1 = alinanSayi.toInt()
            val sayi2 = alinanSayi2.toInt()

            val toplam = sayi1 + sayi2

            sonuc.text = toplam.toString()
        }
        carpma.setOnClickListener {

            val alinanSayi = birinciSayi.text.toString()
            val alinanSayi2 = ikinciSayi.text.toString()

            val sayi1 = alinanSayi.toInt()
            val sayi2 = alinanSayi2.toInt()

            val carpim = sayi1 * sayi2

            sonuc.text = carpim.toString()

        }


    }
}