package br.com.rafaelmacedo

import android.content.Context
import android.widget.LinearLayout
import com.google.android.material.snackbar.ContentViewCallback

abstract class NotificationSheetView @JvmOverloads constructor(context: Context) :
    LinearLayout(context), ContentViewCallback {

    override fun animateContentOut(delay: Int, duration: Int) {}

    override fun animateContentIn(delay: Int, duration: Int) {}
}