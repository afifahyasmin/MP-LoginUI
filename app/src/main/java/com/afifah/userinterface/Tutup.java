package com.afifah.userinterface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Tutup extends AppCompatActivity {
    String Tutup = "tutup";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutup);

        Button tutup = findViewById(R.id.tutup);

        tutup.setOnClickListener(view -> finish());
    }

    public void clickTutup(View view) {
    }
}

