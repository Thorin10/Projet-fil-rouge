package com.example.dylan.filrouge;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;

import java.util.ArrayList;

public class UserDAO extends DAO {
    public UserDAO(Context pContext) {
        super(pContext);
    }

    public void insertOccurence( User user){
        ContentValues value = new ContentValues();
        value.put(DatabaseHandler.prenom_user, user.getPrenom_user());
        value.put(DatabaseHandler.nom_user, user.getNom_user());
        value.put(DatabaseHandler.mail_user, user.getmail_user());
        value.put(DatabaseHandler.group_id, user.getGroup_id());
        getDB().insert(DatabaseHandler.user_table_name,null,value);
    }

    private ArrayList<User> allUse = new ArrayList<>();

    public void getAllUser(int id){
        Cursor c = super.getDB().query(DatabaseHandler.user_table_name, new String[]{DatabaseHandler.nom_user, DatabaseHandler.prenom_user, DatabaseHandler.mail_user, DatabaseHandler.group_id}, null, null, null, null, null);
        c.moveToFirst();
        User user = new User();
        user.setNom_user(c.getString(c.getColumnIndex(DatabaseHandler.nom_user)));
        user.setPrenom_user(c.getString(c.getColumnIndex(DatabaseHandler.prenom_user)));
        user.setGroup_id(c.getInt(c.getColumnIndex(DatabaseHandler.group_id)));
        user.setmail_user(c.getString(c.getColumnIndex(DatabaseHandler.mail_user)));
        if (user.getGroup_id()==id){
            allUse.add(user);
        }
        while (c.moveToNext()) {
            User user1 = new User();
            user1.setNom_user(c.getString(c.getColumnIndex(DatabaseHandler.nom_user)));
            user1.setPrenom_user(c.getString(c.getColumnIndex(DatabaseHandler.prenom_user)));
            user1.setGroup_id(c.getInt(c.getColumnIndex(DatabaseHandler.group_id)));
            user1.setmail_user(c.getString(c.getColumnIndex(DatabaseHandler.mail_user)));
            if (user1.getGroup_id()==id){
                allUse.add(user1);
            }
        }
        c.close();
    }

    public ArrayList<User> getAllUse() {
        return allUse;
    }

    public void setAllUse(ArrayList<User> allUse) {
        this.allUse = allUse;
    }
}
