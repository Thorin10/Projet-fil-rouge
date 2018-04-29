package com.example.dylan.filrouge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class AjoutGroup extends AppCompatActivity {
    private Bundle extras;
    private int id;
    private EditText nomGroup;
    private String Groupnom;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajoutgroup);
        extras = getIntent().getExtras();
        id = Integer.valueOf(extras.getString("id"));
    }

    public void validerGroup(View v){
        nomGroup = findViewById(R.id.edGroup);
        Groupnom = nomGroup.getText().toString();
        GroupeDAO groupDAO = new GroupeDAO(this);
        if(TextUtils.isEmpty(Groupnom)) {
            nomGroup.setError("empty");
            return;
        }
        Groupe groupadd = new Groupe();
        groupadd.setNom_group(Groupnom);
        groupadd.setOu_id(id);
        groupDAO.insertOccurence(groupadd);
        Intent myIntent = new Intent(AjoutGroup.this,GroupActivity.class);
        Bundle extras = new Bundle();
        extras.putString("id",String.valueOf(id));
        myIntent.putExtras(extras);
        startActivity(myIntent);

    }
}
