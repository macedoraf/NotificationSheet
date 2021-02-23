package br.com.rafaelmacedo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.BaseTransientBottomBar

class MainActivity : AppCompatActivity() {

    lateinit var notificationContainer: NotificationContainer
    lateinit var toast: Button
    var flagVisible = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        notificationContainer = findViewById<NotificationContainer>(R.id.notificationContainer)
        toast = findViewById(R.id.toast)

        toast.setOnClickListener {
            if (flagVisible) {
                flagVisible = false
                notificationContainer.dismiss()
            } else {
                flagVisible = true
                notificationContainer.show(BaseTransientBottomBar.LENGTH_INDEFINITE)
            }
        }
    }
}