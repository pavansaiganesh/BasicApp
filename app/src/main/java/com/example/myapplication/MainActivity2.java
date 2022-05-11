package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
   
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModelClass>userList;
    Adapter adapter;
    TextView linkTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        initData();
        initRecyclerView();



        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.home);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.favourites:
                        startActivity(new Intent(getApplicationContext()
                        ,Favourites.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.home:

                        return true;
                    case R.id.movies:
                        startActivity(new Intent(getApplicationContext()
                                ,Movies.class));
                        overridePendingTransition(0,0);
                        return true;


                }
                return false;
            }
        });

    }

    private void initData() {

        userList=new ArrayList<>(0);
        userList.add(new ModelClass(R.drawable.imgas1,"Data Structures","450",R.string.DS));
        userList.add(new ModelClass(R.drawable.imgas2,"JavaScript","30 days JS",R.string._450_q_s));
        userList.add(new ModelClass(R.drawable.imgas3,"PythonYT","Corey Schafer",R.string.python));
        userList.add(new ModelClass(R.drawable.imgas4,"CodePen","websites",R.string.codepen));
        userList.add(new ModelClass(R.drawable.imgas1,"Data Structures","450",R.string.DS));
        userList.add(new ModelClass(R.drawable.imgas2,"JavaScript","30 days JS",R.string._450_q_s));
        userList.add(new ModelClass(R.drawable.imgas3,"PythonYT","Corey Schafer",R.string.python));
        userList.add(new ModelClass(R.drawable.imgas4,"CodePen","websites",R.string.codepen));
        userList.add(new ModelClass(R.drawable.imgas1,"Data Structures","450",R.string.DS));
        userList.add(new ModelClass(R.drawable.imgas2,"JavaScript","30 days JS",R.string._450_q_s));
        userList.add(new ModelClass(R.drawable.imgas3,"PythonYT","Corey Schafer",R.string.python));
        userList.add(new ModelClass(R.drawable.imgas4,"CodePen","websites",R.string.codepen));


    }

    private void initRecyclerView() {
        recyclerView=findViewById(R.id.recyclerView);
        layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }
}