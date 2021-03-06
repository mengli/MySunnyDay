package com.limeng.mysunnyday

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.limeng.mysunnyday.databinding.FragmentWeatherHostBinding
import com.limeng.mysunnyday.viewpager.WeatherDetailAdapter

/** A [Fragment] that hosts the weather details view pager. */
class WeatherHostFragment : Fragment() {

  private var _binding: FragmentWeatherHostBinding? = null

  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
      inflater: LayoutInflater, container: ViewGroup?,
      savedInstanceState: Bundle?
  ): View? {
    _binding = FragmentWeatherHostBinding.inflate(inflater, container, false)
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    binding.viewpager.adapter = WeatherDetailAdapter(this, listOf("Santa Clara", "San Jose"))
    TabLayoutMediator(binding.indicator, binding.viewpager) { _, _ -> }.attach()
  }

  override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
  }
}