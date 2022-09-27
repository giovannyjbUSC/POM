package com.example.formulario_gjb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        email = findViewById(R.id.email2);

        Bundle bundle =this.getIntent().getExtras();

        if (bundle!=null){
            Log.d("Test5",bundle.getString("email"));
            email.setText(bundle.getString("email"));
        }



    }
}