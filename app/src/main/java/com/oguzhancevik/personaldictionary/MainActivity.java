package com.oguzhancevik.personaldictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editTextTextMultiLine;
    SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        editTextTextMultiLine = findViewById(R.id.editTextTextMultiLine);

        sharedPreferences = this.getSharedPreferences("package com.oguzhancevik.personaldictionary", Context.MODE_PRIVATE);

        String storedText = sharedPreferences.getString("storedText", "");
        editTextTextMultiLine.setText(storedText);

        String storedtext1 = sharedPreferences.getString("storedText1","");
        editText.setText(storedtext1);

    }



    public void back(View view){
        Intent intent = new Intent(MainActivity.this,EnterActivity.class);
        startActivity(intent);
    }
    public void extra(View view){
        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }
    public void save(View view) {

        String partText = editTextTextMultiLine.getText().toString();
        editTextTextMultiLine.setText(partText);
        sharedPreferences.edit().putString("storedText",partText).apply();

        String partText1 = editText.getText().toString();
        editText.setText(partText1);
        sharedPreferences.edit().putString("storedText1",partText1).apply();

    }







}