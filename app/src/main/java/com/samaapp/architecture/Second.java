package com.samaapp.architecture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Button btnStart2;

        setContentView(R.layout.activity_second);
        btnStart2 = findViewById(R.id.btnStart2);

        btnStart2.setOnClickListener(view ->{
            Intent intent2 = new Intent(this,ThirdActivity.class);
            startActivity(intent2);
            finish();

        });
    }
}