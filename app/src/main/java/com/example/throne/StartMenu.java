package com.example.throne;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class StartMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_meny);
    }

    public void onStartButtonClick(View view){
        Intent intent = new Intent(this, MainGameScreen.class);
        Toast.makeText(this, "Let's go!", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }

    public void onSettingsButtonClick(View view){

    }

    public void onExitButtonClick(View view){
        onDestroy();
    }

}