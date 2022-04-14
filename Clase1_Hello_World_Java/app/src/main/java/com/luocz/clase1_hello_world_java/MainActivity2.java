package com.luocz.clase1_hello_world_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        String message=intent.getStringExtra("Contra");
        TextView textView=findViewById(R.id.textView2);
        Toast.makeText(this, message,Toast.LENGTH_LONG).show();
        textView.setText(message);
    }

    public void actividad(View view) {
        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);
        finish();
    }

    public void clickMale(View view) {
        boolean checked=((RadioButton)view).isChecked();
        switch(view.getId()){
            case R.id.radioButton:
                if (checked)
                    Toast.makeText(this,"Hombre",Toast.LENGTH_LONG).show();
                    break;
            case R.id.radioButton2:
                if (checked)
                    Toast.makeText(this,"Mujer",Toast.LENGTH_LONG).show();
                    break;
        }
    }

    public void clickOnHobby(View view) {
        //primera forma
        boolean checked=((CheckBox)view).isChecked();
        //segunda forma
        CheckBox checkBox1=findViewById(R.id.checkBox1);
        CheckBox checkBox2=findViewById(R.id.checkBox2);

        boolean checked1=checkBox1.isChecked();
        boolean checked2=checkBox2.isChecked();
        switch(view.getId()){
            case R.id.checkBox1:
                //checke1
                if(checked){
                    Toast.makeText(this, "Se ha marcado en Deporte",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this, "Se ha desmarcado  en Deporte",Toast.LENGTH_LONG).show();
                }

                break;
            case R.id.checkBox2:
                //checke2
                if(checked){
                    Toast.makeText(this,"Se ha marcado en No Deportes",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this,"Se ha desmarcado en No Deportes",Toast.LENGTH_LONG).show();
                }
                break;
            default:
                break;
        }
    }
}