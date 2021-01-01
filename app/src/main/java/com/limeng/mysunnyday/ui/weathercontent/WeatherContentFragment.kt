package com.limeng.mysunnyday.ui.weathercontent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.viewModels
import com.limeng.mysunnyday.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WeatherContentFragment : Fragment() {

    private val weatherContentViewModel: WeatherContentViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_weather_content, container, false).apply {
            findViewById<ComposeView>(R.id.weather_content).setContent {
                // In Compose world
                MaterialTheme {
                    Text("Hello Compose!")
                }
            }
        }
    }
}