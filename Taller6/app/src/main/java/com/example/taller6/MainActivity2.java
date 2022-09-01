package com.example.taller6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    Button button_atras, button_siguiente;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        start_life();

    }


    public void start_life() {

        button_atras = findViewById(R.id.atras);

        button_atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prev(view);
            }
        });

        button_siguiente = findViewById(R.id.siguiente2);

        button_siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                next(view);
            }
        });

        editText = findViewById(R.id.editTextTextPersonName);
    }

    public void prev(View view) {

        startActivity((new Intent(MainActivity2.this, MainActivity.class)));
    }

    public void next(View view) {
        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
        Bundle bundle = new Bundle();
        bundle.putString("text", editText.getText().toString());

        intent.putExtras(bundle);
        startActivity(intent);


    }
}