package com.example.cozidoapp;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // Cria um objeto da classe DatabaseHelper
        DatabaseHelper databaseHelper = new DatabaseHelper(this);

// Obtém uma referência para o banco de dados
        SQLiteDatabase db = databaseHelper.getWritableDatabase();

// Chama o método onCreate para criar a tabela "receita"
        databaseHelper.onCreate(db);

        boolean b =databaseHelper.checkUser("Alex","12345");
        if (b) {
// Mostra o nome do usuário em uma Toast
            Toast.makeText(this, "certo", Toast.LENGTH_SHORT).show();
        }
    }
}