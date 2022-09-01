package com.example.taller6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    TextView result;
    Button buton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        result = findViewById(R.id.textView6);

        Bundle bundle = this.getIntent().getExtras();

        if (bundle !=null){
            result.setText(bundle.getString("text"));
        }


        buton = findViewById(R.id.button10);

        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity((new Intent(MainActivity3.this, MainActivity2.class)));
            }
        });


    }
}