package com.example.formulario_gjb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {


    private TextView text1, text2, text3, text4;

    private EditText editTextTextEmailAddress,editTextTextPassword;
    private View view;

    private Button login;

    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start_life();
    }

    private void start_life(){

        editTextTextEmailAddress = findViewById(R.id.editTextTextEmailAddress);
        editTextTextPassword = findViewById(R.id.editTextTextPassword);

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

        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                readWs();
            }
        });
    }

    private   void readWs(){

        Log.d("Test1","Hola");
        String url = "https://22e9-190-1-251-54.ngrok.io/login";
        StringRequest postRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.d("Test",response);

                try {
                    JSONObject jsonObject =  new JSONObject(response);

                    String email = jsonObject.getString("email");

                    if (email != null ){
                        Log.d("Test4",email);

                        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                        Bundle bundle = new Bundle();
                        bundle.putString("email",email);

                        intent.putExtras(bundle);
                        startActivity(intent);
                    }




                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.d("TestE",error.getMessage());
            }
        })
        {
            protected Map<String,String> getParams(){
                Map<String, String> params = new HashMap<>();
                params.put("password",editTextTextPassword.getText().toString());
                params.put("email",editTextTextEmailAddress.getText().toString());

                return params;

            }
        };

        Volley.newRequestQueue(this).add(postRequest);
    }
}