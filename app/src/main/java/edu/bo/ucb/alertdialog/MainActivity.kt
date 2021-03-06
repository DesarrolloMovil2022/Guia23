package edu.bo.ucb.alertdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            val builder = AlertDialog.Builder(this)
            builder.setTitle("Are you sure!")
            builder.setMessage("Do you want to close the app?")
            builder.setPositiveButton("Yes", { dialogInterface: DialogInterface, i: Int -> finish() })
            builder.setNegativeButton("No", { dialogInterface: DialogInterface, i: Int -> })
            builder.show()

    }
}