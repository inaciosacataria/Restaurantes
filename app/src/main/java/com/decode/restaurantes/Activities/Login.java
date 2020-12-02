package com.decode.restaurantes.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.decode.restaurantes.R;

public class Login extends AppCompatActivity {

    EditText email,password;
    Button login; TextView btnEsqueceuSenha, btnCriarConta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email=findViewById(R.id.editTextEmailLogin);
        password=findViewById(R.id.editPasswordLogin);

        login=findViewById(R.id.btnEntrar);
        btnEsqueceuSenha=findViewById(R.id.btnEsqueceuSenha);
        btnEsqueceuSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Recovery.class);
                startActivity(intent);
            }
        });


        btnCriarConta=findViewById(R.id.btnCriarConta);
        btnCriarConta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Register.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Login.this,tips.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
