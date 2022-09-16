package com.example.webthreedroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list_item);

        List<String> list = new ArrayList<>();
        list.add("HTML");
        list.add("CSS");
        list.add("JAVASCRIPT");
        list.add("SQL");
        list.add("PHP");
        list.add("PYTHON");
        list.add("JAVA");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);
         listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position == 0){
                   startActivity(new Intent(MainActivity.this,htmlActivity.class));
                }

                else if (position ==1){
                    startActivity(new Intent(MainActivity.this,cssActivity.class));
                    //redirect to css

                }

                else if(position == 2){
                    startActivity(new Intent(MainActivity.this,javascriptActivity.class));
                   // redirect to js
                }

                else if(position == 3){
                    startActivity(new Intent(MainActivity.this,sqlActivity.class));
                    //redirect to sql

                }

                else if(position == 4){
                    startActivity(new Intent(MainActivity.this,phpActivity.class));
                    //redirect to php

                }
                else if(position == 5){
                    startActivity(new Intent(MainActivity.this,pythonActivity.class));
                   //redirect to python
                }
                else if (position == 6){
                    startActivity(new Intent(MainActivity.this, JavaActivity.class));
                    //redirect to java
                }


            }
        });



    }
}