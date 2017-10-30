package com.example.tone.gitapplication;

import android.annotation.SuppressLint;
import android.os.Build;
import android.provider.FontRequest;
import android.provider.FontsContract;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void testGit(){

        findViewById()

        android.util.Log.d("", "testGit: ");
    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    private void  testPush(){
        FontRequest request = new FontRequest("","","");

    }

}
