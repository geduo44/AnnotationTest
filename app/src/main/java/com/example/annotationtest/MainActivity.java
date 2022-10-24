package com.example.annotationtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.loglib.MethodProcessor;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @MethodProcessor (fileName = "MainActivity", newString = "Hello new world!")
    public void changeText(View view) {
        //MainActivity$$Log newLog = new MainActivity$$Log();
        //((TextView)view).setText(newLog.getMessage());
    }
}