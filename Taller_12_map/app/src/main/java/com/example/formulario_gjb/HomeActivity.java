package com.example.formulario_gjb;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import java.net.URI;

public class HomeActivity extends AppCompatActivity {

    ImageButton wp, inst;
    String url_inst = "https://www.instagram.com/giovannyjb/";
    String url_wp = "https://api.whatsapp.com/send?phone=+573135193670";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        wp = findViewById(R.id.wp);
        inst = findViewById(R.id.inst);

        wp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _link = Uri.parse(url_wp);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);

            }
        });

        inst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri _link = Uri.parse(url_inst);
                Intent i = new Intent(Intent.ACTION_VIEW, _link);
                startActivity(i);
            }
        });
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
                startActivity(new Intent(HomeActivity.this, MainActivity.class));
                break;
            case R.id.home:
                startActivity(new Intent(HomeActivity.this, HomeActivity.class));
                break;
            case R.id.menu:
                startActivity(new Intent(HomeActivity.this, MenuActivity.class));
                break;
            case R.id.welcome:
                startActivity(new Intent(HomeActivity.this, WelcomeActivity.class));
                break;
            case  R.id.map:
                startActivity(new Intent(HomeActivity.this, MapsActivity.class));

                break;
        }

        return super.onOptionsItemSelected(item);
    }
}