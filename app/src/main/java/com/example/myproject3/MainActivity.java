package com.example.myproject3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CustomButton customButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        customButton = findViewById(R.id.button_play);

        customButton.setIcon(ContextCompat.getDrawable(getApplicationContext(),R.drawable.ic_detail_play));
        customButton.setText("Play");
        customButton.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                customButton.setIsFocused(b);
            }
        });
    }
}