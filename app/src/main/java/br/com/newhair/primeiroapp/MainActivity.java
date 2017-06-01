package br.com.newhair.primeiroapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botaoSegundoActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoSegundoActivity = (Button) findViewById(R.id.btnIrSegundaActivity);
        //procura uma view pelo ID, todos os itens dentro do xml sao viw

        botaoSegundoActivity.setOnClickListener(new View.OnClickListener() {
            //está adicionando um clique ao botao
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                startActivity(intent);
                finish();

            }
        });
    }
}
