package com.github.moqigit.app.dashboard

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.widget.PopupWindow
import com.github.moqigit.app.databinding.ViewVideoPageSelectorBinding
import com.github.moqigit.app.ext.OnClickListener

/**
 *
 * created by reol at 2021/6/1
 */
class ActionPopupWindow(context: Context) : PopupWindow(context) {

    private val vb: ViewVideoPageSelectorBinding = ViewVideoPageSelectorBinding.inflate(LayoutInflater.from(context))

    var actionSingle: OnClickListener? = null
    var actionPager: OnClickListener? = null
    var actionList: OnClickListener? = null

    init {
        contentView = vb.root
        setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        vb.btnSingleVideo.setOnClickListener {
//            it.findNavController().navigate(R.id.action_dashBoardFragment_to_singleVideoFragment)
            actionSingle?.invoke()
//            toast("btnSingleVideo")
            dismiss()
        }

        vb.btnVideoPager.setOnClickListener {
//            it.findNavController().navigate(R.id.action_dashBoardFragment_to_videoPagerFragment)
            actionPager?.invoke()
//            toast("btnVideoPager")
            dismiss()
        }

        vb.btnVideoList.setOnClickListener {
//            it.findNavController().navigate(R.id.action_dashBoardFragment_to_videoListFragment)
            actionList?.invoke()
//            toast("btnVideoList")
            dismiss()
        }

        isOutsideTouchable = true
        isTouchable = true
        isFocusable = true

    }
}