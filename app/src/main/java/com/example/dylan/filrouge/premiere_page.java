package com.example.dylan.filrouge;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class premiere_page extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        OuDAO ouDAO = new OuDAO(this);
        GroupeDAO groupeDAO = new GroupeDAO(this);
        UserDAO userDAO = new UserDAO(this);

        Ou ou1 = new Ou("recherche");
        ouDAO.insertOccurence(ou1);
        Ou ou2 = new Ou("develeoppement");
        ouDAO.insertOccurence(ou2);
        Ou ou3 = new Ou("web");
        ouDAO.insertOccurence(ou3);
        Groupe group1 =  new Groupe("chercheur",1);
        groupeDAO.insertOccurence(group1);
        Groupe groupe2 = new Groupe("chef",1);
        groupeDAO.insertOccurence(groupe2);
        User user1 = new User("engler","dylan","dylan.engler@ynov.com",1);
        userDAO.insertOccurence(user1);
        User user2 = new User("aubineau","alexis","alexis.aubineau@ynov.com",2);
        userDAO.insertOccurence(user2);
        User user3 = new User("maurin","thomas","thomas.maurin@ynov.com",2);
        userDAO.insertOccurence(user3);
        Intent myIntent = new Intent(premiere_page.this,MainActivity.class);
        startActivity(myIntent);
    }
}
