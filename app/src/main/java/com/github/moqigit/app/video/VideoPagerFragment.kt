package com.github.moqigit.app.video

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.github.moqigit.app.databinding.FragmentPlaceHolderBinding

/**
 *
 * created by reol at 2021/6/1
 */
class VideoPagerFragment: Fragment() {
    private lateinit var vb: FragmentPlaceHolderBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        vb = FragmentPlaceHolderBinding.inflate(inflater, container, false)
        return vb.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        vb.tvPlaceHolder.text = "VideoPagerFragment"
    }
}