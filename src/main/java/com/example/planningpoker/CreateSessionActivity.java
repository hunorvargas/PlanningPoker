package com.example.planningpoker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CreateSessionActivity extends AppCompatActivity {

    Button createSessionButton,joinSessionButton,showHistroyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        init();
        creatsession();
        joinsession();
        showHistroy();

    }


    private void showHistroy() {

            showHistroyButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                }
            });
    }

    private void joinsession() {

            joinSessionButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent intent = new Intent(CreateSessionActivity.this,JoinActivity.class);
                    startActivity(intent);
                }
            });
    }


    private void creatsession() {
        createSessionButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                    Intent intent = new Intent(CreateSessionActivity.this,SessionActivity.class);
                    startActivity(intent);
                }

        });
    }


    private void init() {

        createSessionButton = (Button)findViewById(R.id.creatSessionButton);
        joinSessionButton = (Button)findViewById(R.id.joinSessionButton);
        showHistroyButton = (Button)findViewById(R.id.historyButton);
    }


}
