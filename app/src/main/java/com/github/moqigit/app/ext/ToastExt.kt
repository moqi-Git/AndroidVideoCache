package com.github.moqigit.app.ext

import android.widget.Toast

/**
 *
 * created by reol at 2021/6/1
 */

fun toast(message: String) {
    Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
}