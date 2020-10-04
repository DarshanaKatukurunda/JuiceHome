package com.example.juicedelivery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Orders extends AppCompatActivity {
    private Button button37;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orders);
        button37 = (Button)findViewById(R.id.button37);

        button37.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent = new Intent(Orders.this,OrderConf.class);
                                            startActivity(intent);

                                        }
                                    }
        );
    }
}
