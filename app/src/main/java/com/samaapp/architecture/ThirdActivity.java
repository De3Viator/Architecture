package com.samaapp.architecture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ThirdActivity extends AppCompatActivity {
    Button btnBackSpace;
    EditText etPhone;
    Button btnClearAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        findViewById(R.id.btnBackspace);
        findViewById(R.id.etPhone);
        findViewById(R.id.btnClearAll);

        btnBackSpace.setOnClickListener(view -> {
            String word = etPhone.getText().toString();
            int wordLength = word.length();
            if (wordLength > 0){
                etPhone.setText(word.substring(0, wordLength-1));
            }else {
                System.out.println("Поле ввода пусто");
            }
        });

        btnClearAll.setOnClickListener(view -> {
            String word = etPhone.getText().toString();
            int wordLength = word.length();
            if (wordLength > 0){
                etPhone.setText(word.substring(0, wordLength-wordLength));
                System.out.println("Поле ввода очищено");
            }else {
                System.out.println("Поле ввода пусто");
            }
        });
    }
}