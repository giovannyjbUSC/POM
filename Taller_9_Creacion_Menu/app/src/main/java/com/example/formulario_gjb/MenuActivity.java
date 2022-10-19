package com.example.formulario_gjb;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
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
                startActivity(new Intent(MenuActivity.this, MainActivity.class));
                break;
            case R.id.home:
                startActivity(new Intent(MenuActivity.this, HomeActivity.class));
                break;
            case R.id.menu:
                startActivity(new Intent(MenuActivity.this, MenuActivity.class));
                break;
            case R.id.welcome:
                startActivity(new Intent(MenuActivity.this, WelcomeActivity.class));
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}