package com.example.juicedelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText eName;
    private EditText ePassword;
    private Button eLogin;
    private TextView eAttemps;
    private Button eSignup;

    private String UserName = "Admin";
    private String Password = "123";
    boolean isValid = false;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eName = (EditText)findViewById(R.id.eName);
        ePassword = (EditText)findViewById(R.id.ePassword);
        eLogin = (Button)findViewById(R.id.eLogin);
        eAttemps = (TextView)findViewById(R.id.eAttemps);
        eSignup = (Button)findViewById(R.id.eSignup);

        eSignup.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           Intent intent = new Intent(MainActivity.this,sign.class);
                                           startActivity(intent);

                                       }
                                   }
        );

        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String inputName = eName.getText().toString();
                String inputPassword = ePassword.getText().toString();

                if(inputName.isEmpty() || inputPassword.isEmpty()){
                    Toast.makeText(MainActivity.this,"please enter the details Connently",Toast.LENGTH_LONG).show();
                }
                else{
                    isValid = validate(inputName,inputPassword);

                    if (isValid){
                        counter--;
                        Toast.makeText(MainActivity.this,"Incorrent cradetils entered  ",Toast.LENGTH_LONG).show();
                        eAttemps.setText("No of attemps remaining"+counter);

                        if (counter == 0){
                            eLogin.setEnabled(false);
                        }
                        else {
                            Toast.makeText(MainActivity.this,"Login succassful ",Toast.LENGTH_LONG).show();

                            //add the new activity
                            Intent intent = new Intent(MainActivity.this,HomePage.class);
                            startActivity(intent);

                        }
                    }


                }
            }
        });

    }
    private boolean validate(String name, String password){
        if (name.equals(UserName) && password.equals(password)){
            return true;
        }
        return false;
    }


}
