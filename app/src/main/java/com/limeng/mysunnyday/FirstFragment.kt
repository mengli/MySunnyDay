package com.limeng.mysunnyday

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import com.limeng.mysunnyday.databinding.FragmentFirstBinding
import com.limeng.mysunnyday.viewpager.WeatherDetailAdapter

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.viewpager.adapter = WeatherDetailAdapter(
                requireContext(),
                listOf("Santa Clara", "San Jose"),
                true)

        //Custom bind indicator
        binding.indicator.highlighterViewDelegate = {
            val highlighter = View(requireContext())
            highlighter.layoutParams = FrameLayout.LayoutParams(160, 20)
            highlighter.setBackgroundColor(resources.getColor(R.color.white))
            highlighter
        }
        binding.indicator.unselectedViewDelegate = {
            val unselected = View(requireContext())
            unselected.layoutParams = LinearLayout.LayoutParams(160, 20)
            unselected.setBackgroundColor(resources.getColor(R.color.white))
            unselected.alpha = 0.4f
            unselected
        }
        binding.viewpager.onIndicatorProgress = { selectingPosition, progress ->
            binding.indicator.onPageScrolled(selectingPosition, progress)
        }
        binding.indicator.updateIndicatorCounts(binding.viewpager.indicatorCount)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}