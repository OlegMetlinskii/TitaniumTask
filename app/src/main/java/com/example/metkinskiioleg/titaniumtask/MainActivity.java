package com.example.metkinskiioleg.titaniumtask;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    private boolean arr[];
    private int j;
    private int count;
    private TextView tvResult;
    private TextView tv;
    private int Result;
    private int i;
    private int llCount;
    private LinearLayout ll;
    private LinearLayout ll2;
    private LinearLayout ll3;
    private LinearLayout ll4;
    private LinearLayout ll5;
    private LinearLayout ll6;
    private LinearLayout ll7;
    private LinearLayout ll8;
    private LinearLayout ll9;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll = (LinearLayout) findViewById(R.id.linearLayout);
        ll2 = (LinearLayout) findViewById(R.id.linearLayout2);
        ll3 = (LinearLayout) findViewById(R.id.linearLayout3);
        ll4 = (LinearLayout) findViewById(R.id.linearLayout4);
        ll5 = (LinearLayout) findViewById(R.id.linearLayout5);
        ll6 = (LinearLayout) findViewById(R.id.linearLayout6);
        ll7 = (LinearLayout) findViewById(R.id.linearLayout7);
        ll8 = (LinearLayout) findViewById(R.id.linearLayout8);
        ll9 = (LinearLayout) findViewById(R.id.linearLayout9);

        llCount = 0;
        tv = (TextView) findViewById(R.id.textView12);
        tvResult = (TextView) findViewById(R.id.textView);
        count = 0;
        i = 1;
        j = 0;
        Result = 0;
        arr = new boolean[10];
        arrAdd();
        for (boolean x : arr) {
            if (x = !false) {
                arrAdd();
                Random random = new Random();
                arr[random.nextInt(10)] = false;
            }
        }
    }


    public void Click(View view) {
        if (arr[j] == true) {
            Result = Result + i;
            ++i;
            if (llCount == 0) {
                ll2.setVisibility(View.VISIBLE);
                ll.setVisibility(View.INVISIBLE);
            }
            if (llCount == 1) {
                ll3.setVisibility(View.VISIBLE);
                ll2.setVisibility(View.INVISIBLE);
            }
            if (llCount == 2) {
                ll4.setVisibility(View.VISIBLE);
                ll3.setVisibility(View.INVISIBLE);
            }
            if (llCount == 3) {
                ll5.setVisibility(View.VISIBLE);
                ll4.setVisibility(View.INVISIBLE);
            }
            if (llCount == 4) {
                ll6.setVisibility(View.VISIBLE);
                ll5.setVisibility(View.INVISIBLE);
            }
            if (llCount == 5) {
                ll7.setVisibility(View.VISIBLE);
                ll6.setVisibility(View.INVISIBLE);
            }
            if (llCount == 6) {
                ll8.setVisibility(View.VISIBLE);
                ll7.setVisibility(View.INVISIBLE);
            }
            if (llCount == 7) {
                ll9.setVisibility(View.VISIBLE);
                ll8.setVisibility(View.INVISIBLE);
            }
            if (llCount == 8) {
                ll9.setVisibility(View.INVISIBLE);
                Toast.makeText(this, "You WIN", Toast.LENGTH_SHORT).show();
                tv.setText("");
            }


            llCount++;
            Random rnd = new Random();
            int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));

            count = count + Result;
            tvResult.setTextColor(color);
            tvResult.setText(String.valueOf(count));

            ++j;
            int id = view.getId();
            Button button = (Button) findViewById(id);
            button.setEnabled(false);

            tv.setText("Welcome to the NEXT Level");
            tv.setTextColor(color);

        } else if (arr[j] == false) {
            Toast.makeText(this, "Ti Proigral", Toast.LENGTH_SHORT).show();
            DisableButtons(false);

        }
    }

    public static boolean getRandomBool(int percentage) {
        Random random = new Random();
        return (random.nextInt(100) < percentage);
    }

    public void arrAdd() {
        for (int i = 0; i < 10; i++) {
            arr[i] = getRandomBool(100);
        }
    }

    public void DisableButtons(Boolean state) {
        Button buttonTwo = (Button) findViewById(R.id.button2);
        buttonTwo.setEnabled(state);
        Button buttonThree = (Button) findViewById(R.id.button4);
        buttonThree.setEnabled(state);
        Button buttonFour = (Button) findViewById(R.id.button3);
        buttonFour.setEnabled(state);
        Button buttonFive = (Button) findViewById(R.id.button5);
        buttonFive.setEnabled(state);
        Button buttonSix = (Button) findViewById(R.id.button6);
        buttonSix.setEnabled(state);
        Button buttonSeven = (Button) findViewById(R.id.button7);
        buttonSeven.setEnabled(state);
        Button buttonEight = (Button) findViewById(R.id.button8);
        buttonEight.setEnabled(state);
        Button buttonNine = (Button) findViewById(R.id.button9);
        buttonNine.setEnabled(state);
        Button buttonTen = (Button) findViewById(R.id.button12);
        buttonTen.setEnabled(state);
        Button buttonOne = (Button) findViewById(R.id.button13);
        buttonOne.setEnabled(state);
    }

    public void Refresh(View view) {

        Intent refresh = new Intent(this, MainActivity.class);
        startActivity(refresh);
        this.finish();

    }
}






