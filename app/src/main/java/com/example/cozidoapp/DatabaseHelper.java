package com.example.cozidoapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    // Nome do banco de dados
    public static final String DATABASE_NAME = "user.db";

  /*  // Nome da tabela
    public static final String TABLE_NAME1 = "usuario";
*/

    // Nome da tabela
    public static final String TABLE_NAME2 = "receita";

/*
    // Nome das colunas da tabela1
    public static final String T1_COL_1 = "ID";
    public static final String T1_COL_2 = "NOME";
    public static final String T1_COL_3 = "SENHA";
*/

    // Nome das colunas da tabela2
    public static final String T2_COL_1 = "ID";
    public static final String T2_COL_2 = "IMAGE_PATH";
    public static final String T2_COL_3 = "TITULO";
    public static final String T2_COL_4 = "CALORIAS";
    public static final String T2_COL_5 = "PORCAO";
    public static final String T2_COL_6 = "TEMPO_COZEDURA";
    public static final String T2_COL_7 = "INGREDIENTES";
    public static final String T2_COL_8 = "MODO_PREPARO";

    // Construtor
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }


    // Método chamado quando o banco de dados é criado pela primeira vez
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_NAME1 + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, NOME TEXT, SENHA TEXT)");

        db.execSQL("CREATE TABLE " + TABLE_NAME2 + " (ID INTEGER PRIMARY KEY AUTOINCREMENT, IMAGE_PATH TEXT, TITULO TEXT, CALORIAS TEXT, PORCAO TEXT, TEMPO_COZEDURA TEXT, INGREDIENTES TEXT, MODO_PREPARO TEXT)");

        addUser("Alex", "12345");
/*
        insertReceita( R.drawable.waffle_sem_ovos, "waffle sem ovos", "30 min", "4 porções", "2.5 g", " - 2 xicara Trigo \n - 2 xicara Bebiba de soja \n - 1/4 xicara açucar mascavo \n - 1 colher de sopa de canela \n - 1 pitada de sal \n - 2 colheres de cafe \n - 4 colheres de sopa de oleo \n - 2 maçãs pequenas", "1 Em um bowl misture os ingredientes secos: a farinha, o açúcar, a canela, o fermento e o sal. Adicione a bebida de soja e o óleo e misture muito bem, de preferência com um fouet para não se formarem grumos.\n " +
                "2 Em seguida descasque e rale ou pique finamente as maçãs e incorpore na massa dos waffles. Assim você consegue preparar um waffle simples sem ovo! \n" +
                "3" +
                "Unte a máquina de waffles e coloque porções da massa para cozinhar." );*/
    }

    // Método chamado quando a versão do banco de dados é atualizada
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME1);
        onCreate(db);
    }

    // Método para inserir um novo usuário no banco de dados
    public boolean insertData(String nome, String senha) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(T1_COL_2, nome);
        contentValues.put(T1_COL_3, senha);
        long result = db.insert(TABLE_NAME1, null, contentValues);
        return result != -1;
    }

    public void addUser(String nome, String senha) {
        // Obtém a referência da base de dados para escrita
        SQLiteDatabase db = this.getWritableDatabase();

        // Cria um mapa de valores onde as chaves são os nomes das colunas e os valores são os valores a serem inseridos
        ContentValues values = new ContentValues();
        values.put(T1_COL_2, nome);
        values.put(T1_COL_3, senha);

        // Insere o novo usuário na tabela
        db.insert(TABLE_NAME1, null, values);

        // Fecha a conexão com a base de dados
        db.close();
    }

    public boolean checkUser(String name, String password) {
        // Define a consulta SQL
        String query = "SELECT * FROM " + TABLE_NAME1 + " WHERE " + T1_COL_2 + " = ?" + " AND " + T1_COL_3 + " = ?";

        // Obtém a referência da base de dados para leitura
        SQLiteDatabase db = this.getReadableDatabase();

        // Executa a consulta
        Cursor cursor = db.rawQuery(query, new String[]{name, password});

        // Verifica se o cursor possui algum resultado
        if (cursor.moveToFirst()) {
            // Fecha o cursor e a conexão com a base de dados
            cursor.close();
            db.close();
            return true;
        }
        return false;
    }

    // Método para obter o nome do usuário com a senha especial
    public String getNome(String senha) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT NOME FROM " + TABLE_NAME1 + " WHERE SENHA=?", new String[]{senha});
        if (cursor.moveToFirst()) {
            return cursor.getString(0);
        }
        return null;
    }

    // Método para inserir uma nova receita no banco de dados
    public boolean insertReceita(int imagePath, String titulo, String calorias, String
            porcao, String tempoCozedura, String ingredientes, String modoPreparo) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(T2_COL_2, imagePath);
        contentValues.put(T2_COL_3, titulo);
        contentValues.put(T2_COL_4, calorias);
        contentValues.put(T2_COL_5, porcao);
        contentValues.put(T2_COL_6, tempoCozedura);
        contentValues.put(T2_COL_7, ingredientes);
        contentValues.put(T2_COL_8, modoPreparo);
        long result = db.insert(TABLE_NAME2, null, contentValues);
        return result != -1;
    }

    public Cursor getReceita() {
        // Define a consulta SQL
        String query = "SELECT * FROM " + DatabaseHelper.TABLE_NAME2;

// Executa a consulta e obtém os resultados em um objeto do tipo Cursor
        Cursor cursor = getWritableDatabase().rawQuery(query, null);
        return cursor;
    }
}