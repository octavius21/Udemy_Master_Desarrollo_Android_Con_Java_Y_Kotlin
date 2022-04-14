package com.Luocz.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val textview: TextView =findViewById(R.id.textView2)
        val message = intent.getStringExtra("Contra")
        Toast.makeText(this, message,Toast.LENGTH_LONG).show()
        Log.i("CICLO", message.toString())
        textview.setText(message.toString())
    }

    fun clickOnHobby(view: android.view.View) {
        val checkBox:CheckBox=view as CheckBox
        val contra="hola"
        checkBox.setText(contra)
        val checked:Boolean=checkBox.isChecked
        when(view.id){
            R.id.checkBox1->{
                if(checked){
                    Toast.makeText(this, "Se ha marcado en Deporte",Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this, "Se ha desmarcado  en Deporte",Toast.LENGTH_LONG).show()
                }

            }
            R.id.checkBox2->{
                if(checked){
                    Toast.makeText(this,"Se ha marcado en No Deportes",Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this,"Se ha desmarcado en No Deportes",Toast.LENGTH_LONG).show()
                }

            }
        }
    }

    fun clickMale(view: android.view.View) {
        val radioButtonseleccionado:RadioButton=view as RadioButton
        when(view.id){
            R.id.radioButton->{
                Toast.makeText(this,"Hombre",Toast.LENGTH_LONG).show()
            }
            R.id.radioButton2->{
                Toast.makeText(this,"Mujer",Toast.LENGTH_LONG).show()
            }
        }
    }

    fun actividad(view: android.view.View) {
        val intent = Intent(this, MainActivity3::class.java).apply {
        }
        startActivity(intent)
    }
}