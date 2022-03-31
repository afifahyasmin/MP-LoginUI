package com.afifah.userinterface;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

        String username = "Admin";
        String password = "admin123";

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            EditText txt_user = findViewById(R.id.txt_user);
            EditText txt_pass = findViewById(R.id.txt_pass);
            Button login = findViewById(R.id.login);
            Button tutup = findViewById(R.id.tutup);

            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View View) {
                    if (txt_user.getText().toString().equalsIgnoreCase(username) && txt_pass.getText().toString().equalsIgnoreCase(password)) {
                        startActivity(new Intent(Login.this, Tutup.class));
                    } else {
                        Toast.makeText(Login.this, "Input Username", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
}

