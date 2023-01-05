package com.example.cozidoapp;

import android.provider.BaseColumns;

public class FeedReaderContract {
    private FeedReaderContract() {}

    /* Inner class that defines the table contents */
    public static class FeedEntry implements BaseColumns {
        // Nome da tabela
        public static final String TABLE_NAME1 = "usuario";
        // Nome das colunas da tabela1
        public static final String T1_COL_1 = "ID";
        public static final String T1_COL_2 = "NOME";
        public static final String T1_COL_3 = "SENHA";
        public static final String SQL_CREATE_ENTRIES = ;

        private static final String SQL_CREATE_ENTRIES =
                "CREATE TABLE " + FeedEntry.TABLE_NAME1 + " (" +
                        FeedEntry.T1_COL_1 + " INTEGER PRIMARY KEY," +
                        FeedEntry.T1_COL_2 + " TEXT)" +
                        FeedEntry.T1_COL_3 + " TEXT)";
    }


}
