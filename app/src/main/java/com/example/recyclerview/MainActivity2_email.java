package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.recyclerview.JavaMail.JavaMailAPI;

public class MainActivity2_email extends AppCompatActivity {

    private EditText et_correo;
    private EditText et_asunto;
    private EditText et_mensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2_email);

        et_asunto = (EditText) findViewById(R.id.et_asunto);
        et_correo = (EditText) findViewById(R.id.et_mail);
        et_mensaje = (EditText) findViewById(R.id.et_mensaje);
    }

    public void Enviar_mail(View view){
        String mail = et_correo.getText().toString().trim();
        String asunto = et_asunto.getText().toString();
        String mensaje = et_mensaje.getText().toString();

        if (mail.equals("")||asunto.equals("") || mensaje.equals("")){
            Toast.makeText(this,"Debes llenar todos los campos",Toast.LENGTH_SHORT).show();
        }else {
            JavaMailAPI javaMailAPI = new JavaMailAPI(this, mail, asunto, mensaje);
            javaMailAPI.execute();
            et_mensaje.setText("");
            et_correo.setText("");
            et_asunto.setText("");

        }



    }
}