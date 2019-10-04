package com.example.mylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MyListActivity extends AppCompatActivity {

    private String[] players = {"Ronaldo", "Buffon", "Paijo"};
    private ArrayList<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_list);

        ListView lvItem = findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new
        ArrayAdapter<String>(MyListActivity.this,
        android.R.layout.simple_list_item_1,
                android.R.id.text1, players);

        lvItem.setAdapter(adapter);
    }
}
