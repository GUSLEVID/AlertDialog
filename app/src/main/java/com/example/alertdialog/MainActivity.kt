package com.example.alertdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createSimpleDialog()
    }
    private fun createSimpleDialog()
    {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("This is Dialog")
        builder.setMessage("This is my dialog")
        builder.setNegativeButton("NO",DialogInterface.OnClickListener { dialogInterface, i ->  })
        builder.setPositiveButton("YES",DialogInterface.OnClickListener { dialogInterface, i ->  })
        builder.setNeutralButton("INFO",DialogInterface.OnClickListener { dialogInterface, i ->  })
        builder.show()
    }
}