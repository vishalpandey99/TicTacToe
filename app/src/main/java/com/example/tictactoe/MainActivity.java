package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    String b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int flag = 0;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vinit();
    }
    private void vinit(){
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
    }
    public void check(View view){
        Button btncurrent = (Button) view;

        if (btncurrent.getText().toString().equals("")) {
            count++;
            if (flag == 0) {
                btncurrent.setText("X");
                flag = 1;
            } else {
                btncurrent.setText("0");
                flag = 0;
            }
            if (count > 4) {

                b1 = btn1.getText().toString();
                b2 = btn1.getText().toString();
                b3 = btn1.getText().toString();
                b4 = btn1.getText().toString();
                b5 = btn1.getText().toString();
                b6 = btn1.getText().toString();
                b7 = btn1.getText().toString();
                b8 = btn1.getText().toString();

                // Condition

                if (b1.equals(b2) && b2.equals(b3) && !b3.equals("")) {
                    Toast.makeText(this, "Winner : " + b1, Toast.LENGTH_SHORT).show();
                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    Toast.makeText(this, "Winner : " + b4, Toast.LENGTH_SHORT).show();
                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals((""))) {
                    Toast.makeText(this, "Winner : " + b7, Toast.LENGTH_SHORT).show();
                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                    Toast.makeText(this, "Winner : " + b1, Toast.LENGTH_SHORT).show();
                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    Toast.makeText(this, "Winner : " + b2, Toast.LENGTH_SHORT).show();
                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    Toast.makeText(this, "Winner : " + b3, Toast.LENGTH_SHORT).show();
                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    Toast.makeText(this, "Winner : " + b1, Toast.LENGTH_SHORT).show();
                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    Toast.makeText(this, "Winner : " + b3, Toast.LENGTH_SHORT).show();
                }

            }
        }
    }
}