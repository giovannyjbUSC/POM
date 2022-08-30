package com.example.formulario_gjb;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private TextView text1, text2, text3, text4;
    private View view;

    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.textView);
        text2 = findViewById(R.id.textView2);
        text3 = findViewById(R.id.textView3);
        text4 = findViewById(R.id.textView4);
        linearLayout = findViewById(R.id.div_1);

        text1.setTextColor(Color.rgb(38, 198, 218));
        text2.setTextColor(Color.rgb(187, 222, 251));
        text3.setTextColor(Color.rgb(236, 239, 241));
        text4.setTextColor(Color.rgb(236, 239, 241));

        view = findViewById(R.id.view);

        view.setBackgroundColor(Color.rgb(187, 222, 251));

    }
}