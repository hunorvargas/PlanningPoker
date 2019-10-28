package com.example.planningpoker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class SessionActivity extends AppCompatActivity {
    DatabaseReference database;
    Button createSessionButton;
    Switch privateSwitchButton;
    EditText sessionNameEditText,userNameEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session);
        database=FirebaseDatabase.getInstance().getReference("Session");
        init();
        session();
        sessiondatabase();
    }

    private void sessiondatabase() {

        database.child(String.valueOf(50)).child("userName").setValue(userNameEditText.getText().toString());
        database.child(String.valueOf(50)).child("sessionName").setValue(sessionNameEditText.getText().toString());
        database.child(String.valueOf(50)).child("sessionId").setValue(50);
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
        userNameEditText=(EditText)findViewById(R.id.sessionyoutNameEdittext);
    }

}
