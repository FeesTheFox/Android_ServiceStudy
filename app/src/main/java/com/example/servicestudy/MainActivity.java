package com.example.servicestudy;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.example.servicestudy.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
    }

    public void click(View v){
        Intent i = new Intent(this, MediaService.class);
        if (v.getId()==R.id.start){
            startService(i);
        }
        else {
            stopService(i);
        }
    }
}