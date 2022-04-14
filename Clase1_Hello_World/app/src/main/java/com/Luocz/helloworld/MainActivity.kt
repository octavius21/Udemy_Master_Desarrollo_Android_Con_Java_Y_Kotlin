package com.Luocz.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.OnClickAction
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //TODO: Ya se creo el HelloWorld
        val boton:Button= findViewById(R.id.button)
        val editTextTextPassword:EditText=findViewById(R.id.editTextTextPassword)
        //Primera forma para hacer un ClickListener
        boton.setOnClickListener { view->
            Toast.makeText(this,"Boton para actividad 2",Toast.LENGTH_LONG).show()
            val intent = Intent(this, MainActivity2::class.java).apply {
                putExtra("Contra",editTextTextPassword.text.toString())
            }
            startActivity(intent)
        }
        val textview:TextView=findViewById(R.id.textView)
        textview.setOnClickListener(this)

    }

    //segunda forma para hacer un clicklistener
    override fun onClick(v: View?) {
        Toast.makeText(this,"Click en el texto 2",Toast.LENGTH_LONG).show()
    }
    //Ciclo de vida de una aplicacion
    override fun onStart() {
        super.onStart()
        Log.i("CICLO","Entramos en metodo onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("CICLO","Entramos en metodo onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("CICLO","Entramos en metodo onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i("CICLO","Entramos en metodo onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("CICLO","Entramos en metodo onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("CICLO","Entramos en metodo onDestroy")
    }


}