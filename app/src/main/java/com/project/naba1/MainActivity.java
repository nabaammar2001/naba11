package com.project.naba1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.project.naba1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                validateData();
            }
        });
    }

    private String username="",password="";
    private void validateData() {


        username = binding.etUsername.getText().toString().trim();
        password = binding.etPassword.getText().toString().trim();
        if (TextUtils.isEmpty(username)) {

            Toast.makeText(this, "enter username", Toast.LENGTH_SHORT).show();

        } else if (TextUtils.isEmpty(password)) {
            Toast.makeText(this, "enter password", Toast.LENGTH_SHORT).show();

        } else if(username.equals("naba") && password.equals("1999")) {


            Toast.makeText(this, "sucessed", Toast.LENGTH_SHORT).show();

        }
        else {
            Toast.makeText(this, "username or password is incorrect", Toast.LENGTH_SHORT).show();
        }
    }
}