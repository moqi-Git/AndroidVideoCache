package com.github.moqigit.app.ext

import android.content.Context

/**
 *
 * created by reol at 2021/6/1
 */

object ContextContainer {
    var context: Context? = null

}

fun requireContext() = ContextContainer.context!!
