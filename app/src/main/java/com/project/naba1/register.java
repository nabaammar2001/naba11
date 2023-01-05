package com.project.naba1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.project.naba1.databinding.ActivityRegisterBinding;

public class register extends AppCompatActivity {
private ActivityRegisterBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.pagelogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(register.this,MainActivity.class));
            }
        });
        binding.btnSingup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                validateData();
            }
        });
    }
    private String name="",password="";

    private void validateData() {
        name=binding.etUsername.getText().toString().trim();
        password=binding.etPassword.getText().toString().trim();
        String cPassword=binding.etPassword2.getText().toString().trim();

        if(TextUtils.isEmpty(name)) {
            Toast.makeText(this,"enter username",Toast.LENGTH_SHORT).show();

        }

        else if(TextUtils.isEmpty(password)) {
            Toast.makeText(this,"enter password",Toast.LENGTH_SHORT).show();

        }
        else if(TextUtils.isEmpty(password)) {
            Toast.makeText(this,"confirm passsword",Toast.LENGTH_SHORT).show();

        }
        else if(!password.equals(cPassword)) {
            Toast.makeText(this,"password is not  match",Toast.LENGTH_SHORT).show();

        }
        else {

            startActivity(new Intent(register.this,MainActivity.class));
            finish();
        }
    }
}