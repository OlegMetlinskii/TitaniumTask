package com.example.metkinskiioleg.titaniumtask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    private boolean arr[];
    private int j;
    private int count;
    private TextView tvResult;
    private int Result;
    private int i;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        if(arr[j] == true) {
            Result = Result + i;
            ++i;

            count = count + Result;
            tvResult.setText(String.valueOf(count));
            ++j;

            int id = view.getId();
            Button button = (Button) findViewById(id);
            button.setEnabled(false);


        }else if(arr[j] == false){
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
    public void DisableButtons(Boolean state){
        Button buttonOne = (Button) findViewById(R.id.button);
        buttonOne.setEnabled(state);
        Button buttonTwo = (Button) findViewById(R.id.button2);
        buttonTwo.setEnabled(state);
        Button buttonThree = (Button) findViewById(R.id.button3);
        buttonThree.setEnabled(state);
        Button buttonFour = (Button) findViewById(R.id.button4);
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
        Button buttonTen = (Button) findViewById(R.id.button10);
        buttonTen.setEnabled(state);
    }

    public void Refresh(View view) {

        Intent refresh = new Intent(this, MainActivity.class);
        startActivity(refresh);
        this.finish();

    }
}






