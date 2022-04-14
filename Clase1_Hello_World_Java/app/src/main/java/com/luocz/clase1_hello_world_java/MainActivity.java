package com.luocz.clase1_hello_world_java;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton=findViewById(R.id.button);
        TextView textView=findViewById(R.id.textView);
        EditText editTextpass=findViewById(R.id.editTextNumberPassword);
        //primera forma para hacer un clicklistener
        boton.setOnClickListener(view->{
            Toast.makeText(this,"Actividad 2",Toast.LENGTH_SHORT).show();
            Intent intent=new Intent(this,MainActivity2.class);
            intent.putExtra("Contra",editTextpass.getText().toString());
            startActivity(intent);
            finish();
        });
        textView.setOnClickListener(this);

    }
    //segunda forma para hacer un clicklistener
    @Override
    public void onClick(View v) {
        Toast.makeText(this,"Click en el texto ",Toast.LENGTH_LONG).show();
    }
    //Ciclo de vida de una aplicacion
    @Override
    protected void onStart(){
        super.onStart();
        Log.i("CICLO","Entramos en metodo onStart");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i("CICLO","Entramos en metodo onResume");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i("CICLO","Entramos en metodo onRestart");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.i("CICLO","Entramos en metodo onPause");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.i("CICLO","Entramos en metodo onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}