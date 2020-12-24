package com.limeng.mysunnyday.viewpager

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.limeng.mysunnyday.WeatherContentFragment

class WeatherDetailAdapter(
    fragment: Fragment,
    private val listOfPagerContents: List<String>
) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = listOfPagerContents.size

    override fun createFragment(position: Int): Fragment {
        return WeatherContentFragment()
    }
}