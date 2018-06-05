package com.example.dylan.filrouge;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;

public class OuDAO extends DAO {
    public OuDAO(Context pContext) {
        super(pContext);
    }
    public void insertOccurence( Ou ou){
        ContentValues value = new ContentValues();
        value.put(DatabaseHandler.nom_ou, ou.getNom_ou());
        getDB().insert(DatabaseHandler.ou_table_name,null,value);
    }

    private ArrayList<Ou> allou = new ArrayList<>();

    public void getAllOu(){
        Cursor c = super.getDB().query(DatabaseHandler.ou_table_name, new String[]{DatabaseHandler.nom_ou}, null, null, null, null, null);
        c.moveToFirst();
        Ou ou = new Ou();
        ou.setNom_ou(c.getString(c.getColumnIndex(DatabaseHandler.nom_ou)));
        allou.add(ou);
        while (c.moveToNext()) {
            Ou ou1 = new Ou();
            ou1.setNom_ou(c.getString(c.getColumnIndex(DatabaseHandler.nom_ou)));
            allou.add(ou1);
        }
        c.close();
    }

    public boolean bddtrue(){
        try {
            Cursor c = super.getDB().query(DatabaseHandler.ou_table_name, new String[]{DatabaseHandler.nom_ou}, null, null, null, null, null);
            c.moveToFirst();
            Ou ou = new Ou();
            ou.setNom_ou(c.getString(c.getColumnIndex(DatabaseHandler.nom_ou)));
            allou.add(ou);
            if (allou.size()==1){
                return false;
            }
            else{
                return true;
            }
        }catch (Exception e){
            return false;
        }
    }

    public void setAllou(ArrayList<Ou> allOu) {
        this.allou = allOu;
    }

    public ArrayList<Ou> getAllou() {
        return allou;
    }
}
