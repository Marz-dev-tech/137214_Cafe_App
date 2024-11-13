package com.example.cafe_app

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_order)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun onRadioButtonClicked(view: View){
        if (view is RadioButton){
            val checked = view.isChecked
            when(view.id){
                R.id.sameday -> if(checked){
                    Toast.makeText(this,"Same day messenger service selected", Toast.LENGTH_SHORT).show()}
                R.id.nextday -> if(checked){
                    Toast.makeText(this,"Next day ground delivery selected", Toast.LENGTH_SHORT).show()}
                R.id.pickup -> if(checked){
                    Toast.makeText(this,"Self pick up selected", Toast.LENGTH_SHORT).show()}
                    }
                }
            }
    fun submitForm(view: View){
        val intent = Intent(this,
            OrderDetailsActivity::class.java)
        startActivity(intent)
    }
}