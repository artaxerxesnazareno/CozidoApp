package com.example.cozidoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Receita extends AppCompatActivity {
/*Bundle bundle = getIntent().getExtras();
String string = bundle.getString("Selecionar");*/

    ImageView img;
    TextView txtName;
    TextView txtCozer;
    TextView txtPorcao;
    TextView txtCalaria;
    TextView txtIngredietes;
    TextView txtPreparo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receita);
        Intent intent = getIntent();

        img = findViewById(R.id.img_circle);
        txtName = findViewById(R.id.tetFoodTitle);
        txtCalaria = findViewById(R.id.caloria);
        txtPorcao = findViewById(R.id.porcao);
        txtCozer = findViewById(R.id.cozer);
        txtIngredietes = findViewById(R.id.txtIdIngrediete);
        txtPreparo = findViewById(R.id.txtIdPreparo);
        if (intent.hasExtra("name")) {

            String name = (String) intent.getStringExtra("name");
            int adapterImg = (int) intent.getIntExtra("img", 0);
            String adapterCalorias = intent.getStringExtra("AdapterCaloria");
            String adapterCozer = intent.getStringExtra("AdapterCozer");
            String adapterPorcao = intent.getStringExtra("AdapterPorcao");
            String adapterIngredientes = intent.getStringExtra("AdapterIngredientes");
            String adapterPreparo = intent.getStringExtra("AdapterPreparo");
            txtName.setText(name);

           /* txtCozer.setText(intent.getIntExtra("AdapterCozer", 0));
            txtPorcao.setText(intent.getIntExtra("AdapterPorcao", 0));*/
            txtCalaria.setText(adapterCalorias);
            txtCozer.setText(adapterCozer);
            txtPorcao.setText(adapterPorcao);
            img.setImageResource(adapterImg);
            txtIngredietes.setText(adapterIngredientes);
            txtPreparo.setText(adapterPreparo);

            Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
        }


    }

    public void clickFechar(View view) {
        finish();
    }
}