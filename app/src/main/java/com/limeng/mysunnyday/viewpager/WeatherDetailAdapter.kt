package com.limeng.mysunnyday.viewpager

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.asksira.loopingviewpager.LoopingPagerAdapter
import com.limeng.mysunnyday.R

class WeatherDetailAdapter(
        context: Context,
        itemList: List<String>,
        isInfinite: Boolean
) : LoopingPagerAdapter<String>(context, itemList, isInfinite) {

    //This method will be triggered if the item View has not been inflated before.
    override fun inflateView(
            viewType: Int,
            container: ViewGroup,
            listPosition: Int
    ): View {
        return LayoutInflater.from(context).inflate(R.layout.weather_item, container, false)
    }

    override fun bindView(
            convertView: View,
            listPosition: Int,
            viewType: Int
    ) {

    }
}