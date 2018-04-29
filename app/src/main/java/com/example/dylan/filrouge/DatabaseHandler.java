package com.example.dylan.filrouge;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Dylan on 29/11/2017.
 */

public class DatabaseHandler extends SQLiteOpenHelper{
    public static final String id_user = "id_user";
    public static final String nom_user = "nom_user";
    public static final String prenom_user = "prenom_user";
    public static final String mail_user = "mail_user";
    public static final String group_id = "group_id";
    static final String user_table_name="User";
    public static final String id_group = "id_group";
    public static final String nom_group = "nom_group";
    public static final String ou_id = "ou_id";
    static final String group_table_name = "Groupe";
    public static final String id_ou = "id_ou";
    public static final String nom_ou = "nom_ou";
    static final String ou_table_name = "Ou";
    public static SQLiteDatabase bdd;
    private static final String TABLE_USER_CREATE =
            " CREATE TABLE IF NOT EXISTS " + user_table_name+ " ( " +
                    id_user + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
                    nom_user + " TEXT NOT NULL, "+
                    prenom_user + " TEXT NOT NULL, " +
                    group_id + " INTEGER NOT NULL, " +
                    mail_user + " TEXT NOT NULL ); ";
    private static final String TABLE_GROUP_CREATE =
            " CREATE TABLE IF NOT EXISTS "+ group_table_name+ "( "+
                    id_group + " INTEGER PRIMARY KEY AUTOINCREMENT, "+
                    ou_id + " INTEGER NOT NULL, " +
                    nom_group + " TEXT NOT NULL ); ";
    private static final String TABLE_OU_CREATE =
            " CREATE TABLE IF NOT EXISTS " + ou_table_name+ " ( "+
                    id_ou+ " INTEGER PRIMARY KEY AUTOINCREMENT, "+
                    nom_ou + " TEXT NOT NULL ); ";

    public DatabaseHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public SQLiteDatabase getBDD(){
        return bdd;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_USER_CREATE);
        db.execSQL(TABLE_GROUP_CREATE);
        db.execSQL(TABLE_OU_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        switch (oldVersion) {
            case 1: // Passage de 1.00 à Version 2.00
                //Même principe que dans le onCreate pour executer des requêtes.
                break;
        }
    }

}
