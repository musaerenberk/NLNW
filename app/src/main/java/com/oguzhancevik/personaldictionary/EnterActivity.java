package com.oguzhancevik.personaldictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class EnterActivity extends AppCompatActivity {
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
        imageView = findViewById(R.id.imageView);
    }

    public void start(View view){

        Intent intent = new Intent(EnterActivity.this,MainActivity.class);
        startActivity(intent);
    }
}