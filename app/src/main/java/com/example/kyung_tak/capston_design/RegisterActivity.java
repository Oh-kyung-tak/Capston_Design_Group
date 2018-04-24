package com.example.kyung_tak.capston_design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button register_check_Button = findViewById(R.id.register_check_Button);

        register_check_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(check_register()){
                    Toast.makeText(getApplicationContext(), "Register Success!", Toast.LENGTH_LONG).show();
                    Intent loginIntent = new Intent(RegisterActivity.this, LoginActivity.class);
                    RegisterActivity.this.startActivity(loginIntent);
                }
                else
                    Toast.makeText(getApplicationContext(), "register fail!", Toast.LENGTH_LONG).show();
            }
        });

    }

    protected boolean check_register() {
        EditText idText = findViewById(R.id.idText);
        EditText passwordText = findViewById(R.id.passwordText);
        EditText password_checkText = findViewById(R.id.password_checkText);

        return !idText.getText().toString().equals("") && !passwordText.getText().toString().equals("") && !password_checkText.getText().toString().equals("");
    }
}
