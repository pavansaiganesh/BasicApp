package com.example.myapplication;

import static com.example.myapplication.R.id.home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Favourites extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.favourites);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.favourites:

                        return true;
                    case R.id.home:
                        startActivity(new Intent(getApplicationContext()
                                ,MainActivity2.class));
                        overridePendingTransition(0,0);
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
}