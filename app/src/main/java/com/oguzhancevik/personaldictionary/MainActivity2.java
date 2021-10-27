package com.oguzhancevik.personaldictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    EditText editTextTextMultiLine2;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editTextTextMultiLine2 = findViewById(R.id.editTextTextMultiLine2);

        sharedPreferences = this.getSharedPreferences("package com.oguzhancevik.personaldictionary", Context.MODE_PRIVATE);
        String text = sharedPreferences.getString("text","");
        editTextTextMultiLine2.setText(text);




    }

    public void back(View view){
        Intent intent = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(intent);
    }
    public void Save(View view){
        String text1 = editTextTextMultiLine2.getText().toString();
        editTextTextMultiLine2.setText(text1);
        sharedPreferences.edit().putString("text",text1).apply();




    }
}