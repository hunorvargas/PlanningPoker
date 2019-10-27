package com.example.planningpoker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class SessionActivity extends AppCompatActivity {

    Button createSessionButton;
    Switch privateSwitchButton;
    EditText sessionNameEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session);

        init();
        session();
    }

    private void session() {
            createSessionButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                }
            });
    }

    private void init() {

        createSessionButton=(Button)findViewById(R.id.creatSessionButton);
        privateSwitchButton=(Switch) findViewById(R.id.privateswitchbutton);
        sessionNameEditText=(EditText)findViewById(R.id.sessionNameeditText);
    }

}
