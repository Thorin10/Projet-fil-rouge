package com.example.dylan.filrouge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

public class AjoutUser extends AppCompatActivity {
    private Bundle extras;
    private int id;
    private EditText nomUser;
    private EditText prenomUser;
    private String Usernom;
    private String Userprenom;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajoutuser);
        extras = getIntent().getExtras();
        id = Integer.valueOf(extras.getString("id"));
    }

    public void validerGroup(View v){
        nomUser = findViewById(R.id.edNomUser);
        Usernom = nomUser.getText().toString();
        prenomUser = findViewById(R.id.edNomUser);
        Userprenom = prenomUser.getText().toString();
        UserDAO userDAO = new UserDAO(this);
        if(TextUtils.isEmpty(Usernom)) {
            nomUser.setError("empty");
            return;
        }
        if(TextUtils.isEmpty(Userprenom)) {
            prenomUser.setError("empty");
            return;
        }
        User useradd = new User();
        useradd.setNom_user(Usernom);
        useradd.setPrenom_user(Userprenom);
        useradd.setGroup_id(id);
        userDAO.insertOccurence(useradd);
        Intent myIntent = new Intent(AjoutUser.this,UserActivity.class);
        Bundle extras = new Bundle();
        extras.putString("id",String.valueOf(id));
        myIntent.putExtras(extras);
        startActivity(myIntent);

    }
}
