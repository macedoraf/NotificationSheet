package br.com.rafaelmacedo


import android.view.ViewGroup
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.BaseTransientBottomBar

class NotificationSheet constructor(
    parent: ViewGroup,
    content: NotificationSheetView
) : BaseTransientBottomBar<NotificationSheet>(parent, content, content) {

    companion object {
        fun <T : NotificationSheetView> factory(
            parent: CoordinatorLayout,
            contentView: T
        ): NotificationSheet {
            return NotificationSheet(parent = parent, content = contentView)
        }
    }

    init {
        setupBackground()
        reverseLayout()
        animationMode = ANIMATION_MODE_SLIDE
    }

    private fun setupBackground() {
        view.setBackgroundColor(ContextCompat.getColor(view.context, android.R.color.transparent))
        view.setPadding(0, 0, 0, 0)
    }

    private fun reverseLayout() {
        val count = view.childCount
        for (i in 0 until count) {
            view.getChildAt(i).rotation = 180f
        }
    }
}