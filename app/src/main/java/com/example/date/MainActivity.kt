package com.example.date

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.date.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(),View.OnClickListener {

    private var binding:ActivityMainBinding? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // По умолчанию скрываем 2 этих индикатора загрузки
        binding?.linear?.hide()
        binding?.circule?.hide()

        // Тап по кнопкам
        binding?.showCircule?.setOnClickListener(this)
        binding?.hideCircule?.setOnClickListener(this)
        binding?.showLinear?.setOnClickListener(this)
        binding?.hideLinear?.setOnClickListener(this)


    }

    // Реализуем тап по кнопкам
    override fun onClick(view: View) {

        when(view.id) {
            R.id.showCircule -> binding?.circule?.show()
            R.id.hideCircule -> binding?.circule?.hide()
            R.id.showLinear -> binding?.linear?.show()
            R.id.hideLinear -> binding?.linear?.hide()
        }
    }

}