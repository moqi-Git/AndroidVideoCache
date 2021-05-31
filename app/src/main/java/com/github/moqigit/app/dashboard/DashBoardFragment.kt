package com.github.moqigit.app.dashboard

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.github.moqigit.app.R
import com.github.moqigit.app.databinding.FragmentDashboardBinding

/**
 *
 * created by reol at 2021/6/1
 */
class DashBoardFragment : Fragment() {

    private lateinit var vb: FragmentDashboardBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        vb = FragmentDashboardBinding.inflate(inflater, container, false)
        return vb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        vb.btnAction.setOnClickListener {
            val location = IntArray(2)
            it.getLocationOnScreen(location)
            ActionPopupWindow(requireContext())
                .apply {
                    actionSingle = {
                        findNavController().navigate(R.id.action_dashBoardFragment_to_singleVideoFragment)
                    }
                    actionPager = {
                        findNavController().navigate(R.id.action_dashBoardFragment_to_videoPagerFragment)
                    }
                    actionList = {
                        findNavController().navigate(R.id.action_dashBoardFragment_to_videoListFragment)
                    }
                }
                .showAtLocation(requireActivity().window.decorView, Gravity.NO_GRAVITY, location[0] + 20, location[1] - 300)
        }
    }

}