package com.example.formulario_gjb;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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

    @Override
    public  boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public  boolean onOptionsItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()){
            case R.id.login:
                startActivity(new Intent(MainActivity.this, MainActivity.class));
                break;
            case R.id.home:
                startActivity(new Intent(MainActivity.this, HomeActivity.class));
                break;
            case R.id.menu:
                startActivity(new Intent(MainActivity.this, MenuActivity.class));
                break;
            case R.id.welcome:
                startActivity(new Intent(MainActivity.this, WelcomeActivity.class));
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}