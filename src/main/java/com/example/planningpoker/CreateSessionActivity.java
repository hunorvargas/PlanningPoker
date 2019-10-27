package com.example.planningpoker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.analytics.FirebaseAnalytics;

public class CreateSessionActivity extends AppCompatActivity {
    private FirebaseAnalytics mFirebaseAnalytics;
    Button createSessionButton,joinSessionButton,showHistroyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
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

                }
            });
    }


    private void creatsession() {
        createSessionButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
    }


    private void init() {

        createSessionButton = (Button)findViewById(R.id.creatSessionButton);
        joinSessionButton = (Button)findViewById(R.id.joinSessionButton);
        showHistroyButton = (Button)findViewById(R.id.historyButton);
    }


}
