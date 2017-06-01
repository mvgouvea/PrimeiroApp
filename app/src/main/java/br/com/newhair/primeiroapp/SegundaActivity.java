package br.com.newhair.primeiroapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SegundaActivity extends AppCompatActivity {

    private Button botaoPaginaInicial;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        botaoPaginaInicial = (Button) findViewById(R.id.btnIrPrimeiraActivity);

        botaoPaginaInicial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SegundaActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}