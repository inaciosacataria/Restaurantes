package com.decode.restaurantes.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.decode.restaurantes.R;

public class tips extends AppCompatActivity {

    TextView textView;
    Button btnContinuar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        textView= findViewById(R.id.txtSaudacao);
        String first = "Olá ,";
        String nome = "<font color='#FFCC00'> Inácio</font>";
        String next = "<br> seja bem-vindo <br> ao nosso novo app <br>";
        String appname = "<font color='#FFCC00'> Refeições</font>";
        String ponto=".";
        textView.setText(Html.fromHtml(first +nome+ next+appname+ponto));

        btnContinuar=findViewById(R.id.btnContinuar);
        btnContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getApplicationContext(),Home.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
