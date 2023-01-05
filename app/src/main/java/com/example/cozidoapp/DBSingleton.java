package com.example.cozidoapp;
public class DBSingleton {
    
        private static DBSingleton instance;
        private DatabaseHelper databaseHelper ;

        private DBSingleton() {}

        public static DBSingleton getInstance() {
            if (instance == null) {
                instance = new DBSingleton();
            }
            return instance;
        }

    public DatabaseHelper getDatabaseHelper() {
        return databaseHelper;
    }

    public void setDatabaseHelper(DatabaseHelper databaseHelper) {
        this.databaseHelper = databaseHelper;
    }
}
