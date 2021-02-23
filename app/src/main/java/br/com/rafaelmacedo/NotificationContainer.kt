package br.com.rafaelmacedo

import android.content.Context
import android.util.AttributeSet
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.snackbar.BaseTransientBottomBar
import java.util.jar.Attributes

class NotificationContainer @JvmOverloads constructor(
    context: Context,
    attributes: AttributeSet?,
    defStyleAttr: Int = 0
) : CoordinatorLayout(context, attributes, defStyleAttr) {

    private var notificationSheet = NotificationSheet.factory(
        this,
        SimpleNotificationView(context).apply { setDescription("Should do something like this") })

    init {
        rotation = 180F
    }

    fun show(@BaseTransientBottomBar.Duration duration: Int) {
        notificationSheet.duration = duration
        notificationSheet.show()
    }

    fun dismiss() {
        notificationSheet.dismiss()
    }
}