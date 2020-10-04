package com.example.juicedelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class OrderConfirmation extends AppCompatActivity {
    private Button button35;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_confimation);

        button35 = (Button) findViewById(R.id.button35);

        button35.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           Intent intent = new Intent(OrderConfirmation.this,HomePage.class);
                                           startActivity(intent);

                                       }
                                   }
        );
    }
}
