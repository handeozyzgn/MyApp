package com.example.handeozyazgan.myapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {

    private Button mSendData;
    private Firebase mref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Firebase.setAndroidContext(this);

        mref = new Firebase("https://mnemonica-15b7e.firebaseio.com/");
        mSendData = (Button) findViewById(R.id.sendData);

        mSendData.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Firebase mRefChild  = mref.child("Name");
                mRefChild.setValue("Hande");
            }

        });

    }
}
