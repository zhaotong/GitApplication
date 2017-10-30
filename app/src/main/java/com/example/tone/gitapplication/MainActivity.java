package com.example.tone.gitapplication;

import android.annotation.SuppressLint;
import android.os.Build;
import android.provider.FontRequest;
import android.provider.FontsContract;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void testGit(){

        android.util.Log.d("", "testGit: ");
        //git checkout -b mybranch
        Toast.makeText(this,"mybranch",Toast.LENGTH_LONG).show();
        //git checkout -b mybranch2
        Toast.makeText(this,"mybranch2",Toast.LENGTH_LONG).show();
    }




    @RequiresApi(api = Build.VERSION_CODES.O)
    private void  testPush(){
        FontRequest request = new FontRequest("","","");

    }

}
