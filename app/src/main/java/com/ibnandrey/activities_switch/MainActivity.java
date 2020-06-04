package com.ibnandrey.activities_switch;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
public class MainActivity extends AppCompatActivity {
    public static final String ACTION ="com.ibnandrey.SECOND_ACTIVITY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }     public void onClick(View view) {
        Intent intent = new Intent(ACTION);
        startActivity(intent);
    } }
