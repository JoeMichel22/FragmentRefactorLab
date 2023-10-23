package edu.temple.fragmentrefactor

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class FormFragment: Fragment() {
    override fun onCreate(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        val layout= inflater.inflate(R.layout.fragment_form, container, false)
        val displayTextView = findViewById<TextView>(R.id.displayTextView)
        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val changeButton = findViewById<Button>(R.id.changeButton)

        changeButton.setOnClickListener {
            val name = nameEditText.text

            displayTextView.text = if (name.isNotBlank()) {
                "Hello, $name!"
            } else {
                "Please enter your name"
            }
        }

        return layout
    }
}