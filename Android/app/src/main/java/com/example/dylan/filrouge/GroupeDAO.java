package com.example.dylan.filrouge;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;

public class GroupeDAO extends DAO {
    public GroupeDAO(Context pContext) {
        super(pContext);
    }

    public void insertOccurence( Groupe groupe){
        ContentValues value = new ContentValues();
        value.put(DatabaseHandler.nom_group, groupe.getNom_group());
        value.put(DatabaseHandler.ou_id, groupe.getOu_id());
        getDB().insert(DatabaseHandler.group_table_name,null,value);
    }
    private ArrayList<Groupe> allGroup = new ArrayList<>();

    public void getAllGroup(int id){
        Cursor c = super.getDB().query(DatabaseHandler.group_table_name, new String[]{DatabaseHandler.nom_group, DatabaseHandler.id_group, DatabaseHandler.ou_id}, null, null, null, null, null);
        c.moveToFirst();
        Groupe group = new Groupe();
        group.setNom_group(c.getString(c.getColumnIndex(DatabaseHandler.nom_group)));
        group.setId_group(c.getInt(c.getColumnIndex(DatabaseHandler.id_group)));
        group.setOu_id(c.getInt(c.getColumnIndex(DatabaseHandler.ou_id)));
        if (group.getOu_id()==id){
            allGroup.add(group);
        }
        while (c.moveToNext()) {
            Groupe group1 = new Groupe();
            group1.setNom_group(c.getString(c.getColumnIndex(DatabaseHandler.nom_group)));
            group1.setId_group(c.getInt(c.getColumnIndex(DatabaseHandler.id_group)));
            group1.setOu_id(c.getInt(c.getColumnIndex(DatabaseHandler.ou_id)));

            if (group1.getOu_id()==id){
                allGroup.add(group1);
            }
        }
        c.close();
    }

    public ArrayList<Groupe> getAllGroup() {
        return allGroup;
    }

    public void setAllGroup(ArrayList<Groupe> allGroup) {
        this.allGroup = allGroup;
    }
}
