package br.com.rafaelmacedo

import android.content.Context
import android.view.View
import androidx.appcompat.widget.AppCompatTextView

class SimpleNotificationView(context: Context) :
    NotificationSheetView(context) {

    init {
        View.inflate(context, R.layout.view_simple_notification, this)
    }

    fun setDescription(description: String) {
        findViewById<AppCompatTextView>(R.id.tv_simple_notification).text = description
    }
}