package com.example.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Content extends AppCompatActivity {

    TextView txtEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        Bundle extras = getIntent().getExtras();
        String email;

        if(extras != null){
            email = extras.getString("email");
            txtEmail.setText(email);
        }

    }
}
