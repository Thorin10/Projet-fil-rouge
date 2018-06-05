package com.example.dylan.filrouge;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class UserActivity  extends AppCompatActivity {
    private Bundle extras;
    private int id;
    private ArrayList<User> allUser = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        extras = getIntent().getExtras();
        id = Integer.valueOf(extras.getString("id"));
        UserDAO userDAO = new UserDAO(this);
        userDAO.getAllUser(id);
        allUser = userDAO.getAllUse();
        ListView LLContent = findViewById(R.id.tableLayout);
        UserAdapteur adapteur= new UserAdapteur(UserActivity.this,allUser);
        LLContent.setAdapter(adapteur);
    }
    public void ajoutUser(View v){
        Intent myIntent = new Intent(UserActivity.this,AjoutUser.class);
        Bundle extras = new Bundle();
        extras.putString("id",String.valueOf(id));
        myIntent.putExtras(extras);
        startActivity(myIntent);
    }



}
