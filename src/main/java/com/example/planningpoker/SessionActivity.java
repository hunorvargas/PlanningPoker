package com.example.planningpoker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Map;

public class SessionActivity extends AppCompatActivity {

    private FirebaseDatabase mDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference mDatabaseReference = mDatabase.getReference();
    Button createSessionButton;
    Switch privateSwitchButton;
    EditText sessionNameEditText,userNameEditText;
    private Session newSession;
    private String sessionID;
    private String TAG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session);

        init();
        setSessionid();
        session();


        //sessiondatabase();
    }

    private void setSessionid() {


        private void getData(){
            firebaseDatabaseInstance = FirebaseDatabase.getInstance();

            // get reference to 'users' node
            booksInstance = firebaseDatabaseInstance.getReference("mainAlbum");

            booksInstance.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    setData(dataSnapshot);
                }


                @Override
                public void onCancelled(DatabaseError error) {
                    // Failed to read value
                    Log.w(TAG, "Failed to read value.", error.toException());
                }
            });

        }

        List<List<String>> booksInfo;
        List<String> temp;
        private void setData(DataSnapshot dataSnapshot){
            booksInfo = new ArrayList<>();

            for (DataSnapshot alert: dataSnapshot.getChildren()) {
                n = n + 1;
                while(alert.child("pic"+n).exists());
                temp = new ArrayList<>();
                Log.d("image_name", (String) alert.child("image_name").getValue());
                Log.d("id", (String) alert.child("id").getValue());
                Log.d("image_path", (String) alert.child("image_path").getValue());
                temp.add((String) alert.child("image_name").getValue());
                temp.add((String) alert.child("id").getValue());
                temp.add((String) alert.child("image_path").getValue());
                booksInfo.add(temp);
            }

        }




    private void session() {
            createSessionButton.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    newSession.setId(sessionID);
                    newSession.setSessionName(sessionNameEditText.getText().toString());
                    mDatabaseReference = mDatabase.getReference().child("Session");
                    mDatabaseReference.child("firstName").setValue(userNameEditText.getText().toString());
                    mDatabaseReference.setValue(newSession);
                }
            });
    }

    private void init() {

        createSessionButton=(Button)findViewById(R.id.creatSessionButton);
        privateSwitchButton=(Switch) findViewById(R.id.privateswitchbutton);
        sessionNameEditText=(EditText)findViewById(R.id.sessionNameeditText);
        userNameEditText=(EditText)findViewById(R.id.sessionyoutNameEdittext);
        newSession= new Session();
    }

}
