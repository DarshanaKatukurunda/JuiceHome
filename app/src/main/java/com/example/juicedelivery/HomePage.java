package com.example.juicedelivery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class HomePage extends AppCompatActivity {
    private SearchView searchBtn;
    private ListView myList;
    private ArrayList<String> list;
    private ArrayAdapter<String>adapter;
    private Button button1;
    private Button button2;
    private  Button button4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button4 = (Button)findViewById(R.id.button4);
        searchBtn = (SearchView)findViewById(R.id.searchBtn);
        myList = (ListView)findViewById(R.id.myList);


        list.add("vagitable juice");
        list.add("fruit juice");
        list.add("milkshake");
        list.add("soft Drink");

        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);
        myList.setAdapter(adapter);

        button1.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           Intent intent = new Intent(HomePage.this,Vegetable.class);
                                           startActivity(intent);

                                       }
                                   }
        );
        button2.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           Intent intent = new Intent(HomePage.this,FruitJuice.class);
                                           startActivity(intent);

                                       }
                                   }
        );

        button4.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           Intent intent = new Intent(HomePage.this,SoftDrinks.class);
                                           startActivity(intent);

                                       }
                                   }
        );

        searchBtn.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return false;
            }
        });
    }

}
