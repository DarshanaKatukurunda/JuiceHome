package com.example.juicedelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class sign extends AppCompatActivity{
    private Button sumbitBtn;
    private EditText sName;
    private EditText sAddress;
    private EditText sNumder;
    private EditText sPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        sName = (EditText)findViewById(R.id.sName);
        sAddress = (EditText)findViewById(R.id.sAddress);
        sNumder = (EditText)findViewById(R.id.sNumber);
        sPassword = (EditText)findViewById(R.id.sPassword);
        sumbitBtn = (Button)findViewById(R.id.sumbitBtn);

        sumbitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sign.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

}