package com.example.dylan.filrouge;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class GroupActivity extends AppCompatActivity {
    private Bundle extras;
    private int id;
    private ArrayList<Groupe> allGroup = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);
        extras = getIntent().getExtras();
        id = Integer.valueOf(extras.getString("id"));
        GroupeDAO groupeDAO = new GroupeDAO(this);
        groupeDAO.getAllGroup(id);
        allGroup = groupeDAO.getAllGroup();
        ListView LLContent = findViewById(R.id.tablesLayout);
        GroupAdapteur adapteur= new GroupAdapteur(GroupActivity.this,allGroup);
        LLContent.setAdapter(adapteur);
        LLContent.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent myIntent = new Intent(GroupActivity.this,UserActivity.class);
                Bundle extras = new Bundle();
                extras.putString("id",String.valueOf(i+1));
                myIntent.putExtras(extras);
                startActivity(myIntent);
            }
        });
    }

    public void ajoutGroup(View v){
        Intent myIntent = new Intent(GroupActivity.this,AjoutGroup.class);
        Bundle extras = new Bundle();
        extras.putString("id",String.valueOf(id));
        myIntent.putExtras(extras);
        startActivity(myIntent);
    }

    public void deleteGroup(View v){

    }
}
