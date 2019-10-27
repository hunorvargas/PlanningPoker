package com.example.planningpoker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class JoinActivity extends AppCompatActivity {

    Button joinButton;
    EditText nameEditText,sessionIdEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);
        init();
        join();

    }

    private void join() {
        joinButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
    }

    private void init() {
        joinButton = (Button)findViewById(R.id.joinButton);
        nameEditText = (EditText) findViewById(R.id.sessionNameeditText);
        sessionIdEditText=(EditText) findViewById(R.id.SessionIdeditText);
    }
}
