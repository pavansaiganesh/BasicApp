package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText ed1,ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.btnLogin);
        ed1 = (EditText) findViewById(R.id.textInputLayout);
        ed2 = (EditText) findViewById(R.id.textInputLayout2);


        b1.setOnClickListener(v -> {
            if (ed1.getText().toString().equals("sac") &&
                    ed2.getText().toString().equals("sac")) {

                openActivity2();
                Toast.makeText(getApplicationContext(),
                        "Let's go!", Toast.LENGTH_SHORT).show();

            }
            else{
                Toast.makeText(getApplicationContext(), "Wrong Credentials",Toast.LENGTH_SHORT).show();
            }
        });
    }
        public void openActivity2(){
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        }
}