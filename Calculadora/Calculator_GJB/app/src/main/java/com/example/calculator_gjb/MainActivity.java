package com.example.calculator_gjb;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {

    ArrayList<Button> buttons;

    Button percent, square_root, pow, one_about, ce, c, delete, split, nine, eight, seven, six, five, four, three, two, one,
            multiplication, subtraction, add, multiply_sub, zero, point, equal;

    TextView result;

    TextView preview;

    Boolean aux = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initial_buttons();

        start_life();


    }

    public Object cal(String text) {
        String Operation = text;
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");
        Object result = "";
        try {
            result = engine.eval(Operation);
            Log.d("Calculator", "Operation: " + Operation + " result: " + result);
        } catch (ScriptException e) {
            Log.d("Calculator", " ScriptEngine error: " + e.getMessage());
        }


        return result;
    }

    public String last_number(String text) {


        if (text.length() - 1 != -1) {
            return text.substring(0, text.length() - 1);
        }

        return text;
    }

    public void initial_buttons() {


        //Buttons
        this.percent = findViewById(R.id.button1);
        this.square_root = findViewById(R.id.button2);
        this.pow = findViewById(R.id.button3);
        this.one_about = findViewById(R.id.button4);
        this.ce = findViewById(R.id.button5);
        this.c = findViewById(R.id.button6);
        this.delete = findViewById(R.id.button7);
        this.split = findViewById(R.id.button8);

        //Numeric
        this.seven = findViewById(R.id.button9);
        this.eight = findViewById(R.id.button10);
        this.nine = findViewById(R.id.button11);
        this.multiplication = findViewById(R.id.button12);

        this.four = findViewById(R.id.button13);
        this.five = findViewById(R.id.button14);
        this.six = findViewById(R.id.button15);
        this.subtraction = findViewById(R.id.button16);

        this.one = findViewById(R.id.button17);
        this.two = findViewById(R.id.button18);
        this.three = findViewById(R.id.button19);
        this.add = findViewById(R.id.button20);

        this.multiply_sub = findViewById(R.id.button21);
        this.zero = findViewById(R.id.button22);
        this.point = findViewById(R.id.button23);
        this.equal = findViewById(R.id.button24);

        //Text
        preview = findViewById(R.id.preview);
        result = findViewById(R.id.result);


    }


    public void start_life() {
        this.percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preview.setText(preview.getText() + "/100");
            }
        });

        this.square_root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preview.setText(preview.getText() + "^1/2");
            }
        });

        this.pow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preview.setText(preview.getText() + "^(2)");
            }
        });
        this.one_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preview.setText(preview.getText() + "1/");
            }
        });
        this.ce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preview.setText(preview.length() > 0 ? preview.getText().toString().substring(0, preview.length() - 1) : "");
            }
        });
        this.c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preview.setText("");
                result.setText("");
            }
        });

        this.split.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(cal(result.getText().toString() + preview.getText().toString()).toString() + "/");
                preview.setText(last_number(result.getText().toString()));
                aux = true;
            }
        });


        this.seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (aux == true) {
                    preview.setText("7");
                } else {
                    preview.setText(preview.getText() + "7");
                }

                aux = false;
            }
        });

        this.eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (aux == true) {
                    preview.setText("8");
                } else {
                    preview.setText(preview.getText() + "8");
                }

                aux = false;
            }
        });

        this.nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (aux == true) {
                    preview.setText("9");
                } else {
                    preview.setText(preview.getText() + "9");
                }

                aux = false;
            }
        });


        this.multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(cal(result.getText().toString() + preview.getText().toString()).toString() + "*");
                preview.setText(last_number(result.getText().toString()));
                aux = true;
            }
        });

        this.four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (aux == true) {
                    preview.setText("4");
                } else {
                    preview.setText(preview.getText() + "4");
                }


                aux = false;
            }
        });

        this.five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (aux == true) {
                    preview.setText("5");
                } else {
                    preview.setText(preview.getText() + "5");
                }

                aux = false;
            }
        });
        this.six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (aux == true) {
                    preview.setText("6");
                } else {
                    preview.setText(preview.getText() + "6");
                }

                aux = false;
            }
        });

        this.subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(cal(result.getText().toString() + preview.getText().toString()).toString() + "-");
                preview.setText(last_number(result.getText().toString()));
                aux = true;
            }
        });

        this.one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (aux == true) {
                    preview.setText("1");
                } else {
                    preview.setText(preview.getText() + "1");
                }

                aux = false;
            }
        });

        this.two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (aux == true) {
                    preview.setText("2");
                } else {
                    preview.setText(preview.getText() + "2");
                }

                aux = false;
            }
        });

        this.three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (aux == true) {
                    preview.setText("3");
                } else {
                    preview.setText(preview.getText() + "3");
                }

                aux = false;
            }
        });
        this.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(cal(result.getText().toString() + preview.getText().toString()).toString() + "+");
                preview.setText(last_number(result.getText().toString()));
                aux = true;


            }
        });
        this.multiply_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preview.setText(preview.getText() + "+/-");
            }
        });

        this.zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (aux == true) {
                    preview.setText("0");
                } else {
                    preview.setText(preview.getText() + "0");
                }

                aux = false;
            }
        });

        this.point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preview.setText(preview.getText() + ".");
            }
        });

        this.equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText() + "" + preview.getText());
                preview.setText(cal(result.getText().toString()).toString());
                result.setText(result.getText().toString() + "=");
                aux = true;
            }
        });
        this.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                preview.setText(preview.length() > 0 ? preview.getText().toString().substring(0, preview.length() - 1) : "");
                aux = false;
            }
        });
    }
}