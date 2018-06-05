package com.example.dylan.filrouge;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Dylan on 29/11/2017.
 */

abstract class DAO {
    private final static int VERSION = 1;
    private final static String NOM = "projet.db";
    private SQLiteDatabase mDb = null;
    private DatabaseHandler mHandler = null;

    DAO(Context pContext) {
        this.mHandler = new DatabaseHandler(pContext, NOM, null, VERSION);
    }

    private void open() {
        mDb = mHandler.getWritableDatabase();
    }

    SQLiteDatabase getDB() { //Accès à la base en mode singleton
        if (mDb == null)
            open();
        return mDb;

    }
}

