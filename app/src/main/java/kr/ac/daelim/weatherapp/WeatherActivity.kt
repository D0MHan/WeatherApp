package kr.ac.daelim.weatherapp

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import androidx.annotation.RequiresApi
import kr.ac.daelim.weatherapp.databinding.ActivityWeatherBinding

@RequiresApi(Build.VERSION_CODES.M)
class WeatherActivity : AppCompatActivity() {
    val binding by lazy { ActivityWeatherBinding.inflate(layoutInflater) }

    private val TAG: String = WeatherActivity::class.java.simpleName
    private var viewModel: WeatherViewModel = WeatherViewModel()

    private lateinit var fabOpen: Animation
    private lateinit var fabClose: Animation
    private var isFabOpen: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }

    private fun initView() {
        fabOpen
    }
}