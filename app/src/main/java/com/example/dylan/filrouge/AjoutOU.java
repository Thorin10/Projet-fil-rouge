package com.example.dylan.filrouge;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AjoutOU extends AppCompatActivity {

    private Button btn;
    private EditText nomOU;
    private String ou;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajoutou);
    }

    public void validerOU(View v){
        nomOU = findViewById(R.id.edOU);
        ou = nomOU.getText().toString();
        OuDAO ouDAO = new OuDAO(this);
        if(TextUtils.isEmpty(ou)) {
            nomOU.setError("empty");
            return;
        }
        Ou ouadd = new Ou();
        ouadd.setNom_ou(ou);
        ouDAO.insertOccurence(ouadd);
        Intent myIntent = new Intent(AjoutOU.this,MainActivity.class);
        startActivity(myIntent);

    }
}
