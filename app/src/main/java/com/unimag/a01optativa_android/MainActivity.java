package com.unimag.a01optativa_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    protected EditText username, password;
    protected Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        btn = findViewById(R.id.buttonform);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.print(username);
                if(!username.getText().toString().isEmpty() && !password.getText().toString().isEmpty()){
                    Intent i = new Intent(getApplicationContext(), operacionesActivity.class);
                    startActivity(i);
                }
            }
        });

    }
}
