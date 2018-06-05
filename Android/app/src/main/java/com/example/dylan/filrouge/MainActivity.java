package com.example.dylan.filrouge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Ou> allOu = new ArrayList<>();
    private ArrayList<User> allUser = new ArrayList<>();
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OuDAO ouDAO = new OuDAO(this);
        ouDAO.getAllOu();
        allOu = ouDAO.getAllou();
        ListView LLContent = findViewById(R.id.tableLayout);

        OuAdapteur adapteur= new OuAdapteur(MainActivity.this,allOu);
        LLContent.setAdapter(adapteur);
        LLContent.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent myIntent = new Intent(MainActivity.this,GroupActivity.class);
                Bundle extras = new Bundle();
                extras.putString("id",String.valueOf(i+1));
                myIntent.putExtras(extras);
                startActivity(myIntent);
            }
        });

    }



    public void ajoutOU(View v){
        Intent myIntent = new Intent(MainActivity.this,AjoutOU.class);
        startActivity(myIntent);
    }
}
