package com.shailey.braintrainer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.gridlayout.widget.GridLayout;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {
        TextView answer;
        Button button;
        Button button2;
        GridLayout gridLayout;
        TextView timer;
        TextView counter;
        TextView question;
        CountDownTimer countTimer;
        TextView o1;
        TextView o2;
        TextView o3;
        TextView o4;
        int x = 0;
        int y = 0;
        boolean isRunning;

    int randomOpt;
        int random1;
        int random2;
        int ans;
        int opt1;
        int opt2;
        int opt3 ;
        int opt4 ;
        String Ans;

    public void go (View view){
        randomOpt = new Random().nextInt((3 - 0) + 1) + 0;
        random1 = new Random().nextInt((30 - 0) + 1) + 0;
        random2 = new Random().nextInt((30 - 0) + 1) + 0;
        ans = random1 + random2;
        opt1 = new Random().nextInt((60 - 0) + 1) + 0;
        opt2 = new Random().nextInt((60 - 0) + 1) + 0;
        opt3 = new Random().nextInt((60 - 0) + 1) + 0;
        opt4 = new Random().nextInt((60 - 0) + 1) + 0;
        Ans = Integer.toString(ans);
        counter.setText("0/0");


        button.setVisibility(View.GONE);
        gridLayout.setVisibility(View.VISIBLE);
        counter.setVisibility(View.VISIBLE);
        question.setVisibility(View.VISIBLE);
        timer.setVisibility(View.VISIBLE);
        question.setText(random1 +"+" +random2 +"=?");



        o1 = findViewById(R.id.o1);
        o2 = findViewById(R.id.o2);
        o3 = findViewById(R.id.o3);
        o4 = findViewById(R.id.o4);
        ArrayList options = new ArrayList();
        options.add(opt1);
        options.add(opt2);
        options.add(opt3);
        options.add(opt4);
        options.set(randomOpt, ans);
        o1.setText(options.get(0).toString());
        o2.setText(options.get(1).toString());
        o3.setText(options.get(2).toString());
        o4.setText(options.get(3).toString());


        countTimer = new CountDownTimer(30000, 1000) {
            int x = 29;
            public void onTick(long millisUntilFinished) {
                isRunning = true;

                timer.setText("0:" +x);
                x--;
            }

            public void onFinish() {
                answer.setText("FINISHED!");
                isRunning = false;
                button2.setVisibility(View.VISIBLE);

            }
        }.start();

    }


    public void check(View view){
if(isRunning == true){
if(o1.getText()== Ans){

answer.setText("Correct!!");
    x++;
    y++;
counter.setText(x+"/" +y);


}
else{answer.setText("Wrong :(");
y++;
counter.setText(x +"/" +y);
}
        randomOpt = new Random().nextInt((3 - 0) + 1) + 0;
        random1 = new Random().nextInt((30 - 0) + 1) + 0;
        random2 = new Random().nextInt((30 - 0) + 1) + 0;
        ans = random1 + random2;
        opt1 = new Random().nextInt((60 - 0) + 1) + 0;
        opt2 = new Random().nextInt((60 - 0) + 1) + 0;
        opt3 = new Random().nextInt((60 - 0) + 1) + 0;
        opt4 = new Random().nextInt((60 - 0) + 1) + 0;
        Ans = Integer.toString(ans);


        button.setVisibility(View.GONE);
        gridLayout.setVisibility(View.VISIBLE);
        counter.setVisibility(View.VISIBLE);
        question.setVisibility(View.VISIBLE);
        timer.setVisibility(View.VISIBLE);
        question.setText(random1 +"+" +random2 +"=?");



        o1 = findViewById(R.id.o1);
        o2 = findViewById(R.id.o2);
        o3 = findViewById(R.id.o3);
        o4 = findViewById(R.id.o4);
        ArrayList options = new ArrayList();
        options.add(opt1);
        options.add(opt2);
        options.add(opt3);
        options.add(opt4);
        options.set(randomOpt, ans);
        o1.setText(options.get(0).toString());
        o2.setText(options.get(1).toString());
        o3.setText(options.get(2).toString());
        o4.setText(options.get(3).toString());

    }
        }
    public void check1(View view) {
        if (isRunning == true) {

            if (o2.getText() == Ans) {

                answer.setText("Correct!!");
                x++;
                y++;
                counter.setText(x + "/" + y);


            } else {
                answer.setText("Wrong :(");
                y++;
                counter.setText(x + "/" + y);
            }
            randomOpt = new Random().nextInt((3 - 0) + 1) + 0;
            random1 = new Random().nextInt((30 - 0) + 1) + 0;
            random2 = new Random().nextInt((30 - 0) + 1) + 0;
            ans = random1 + random2;
            opt1 = new Random().nextInt((60 - 0) + 1) + 0;
            opt2 = new Random().nextInt((60 - 0) + 1) + 0;
            opt3 = new Random().nextInt((60 - 0) + 1) + 0;
            opt4 = new Random().nextInt((60 - 0) + 1) + 0;
            Ans = Integer.toString(ans);


            button.setVisibility(View.GONE);
            gridLayout.setVisibility(View.VISIBLE);
            counter.setVisibility(View.VISIBLE);
            question.setVisibility(View.VISIBLE);
            timer.setVisibility(View.VISIBLE);
            question.setText(random1 + "+" + random2 + "=?");


            o1 = findViewById(R.id.o1);
            o2 = findViewById(R.id.o2);
            o3 = findViewById(R.id.o3);
            o4 = findViewById(R.id.o4);
            ArrayList options = new ArrayList();
            options.add(opt1);
            options.add(opt2);
            options.add(opt3);
            options.add(opt4);
            options.set(randomOpt, ans);
            o1.setText(options.get(0).toString());
            o2.setText(options.get(1).toString());
            o3.setText(options.get(2).toString());
            o4.setText(options.get(3).toString());

        }
    }
    public void check2(View view){
        if(isRunning == true) {

            if (o3.getText() == Ans) {

                answer.setText("Correct!!");
                x++;
                y++;
                counter.setText(x + "/" + y);


            } else {
                answer.setText("Wrong :(");
                y++;
                counter.setText(x + "/" + y);
            }
            randomOpt = new Random().nextInt((3 - 0) + 1) + 0;
            random1 = new Random().nextInt((30 - 0) + 1) + 0;
            random2 = new Random().nextInt((30 - 0) + 1) + 0;
            ans = random1 + random2;
            opt1 = new Random().nextInt((60 - 0) + 1) + 0;
            opt2 = new Random().nextInt((60 - 0) + 1) + 0;
            opt3 = new Random().nextInt((60 - 0) + 1) + 0;
            opt4 = new Random().nextInt((60 - 0) + 1) + 0;
            Ans = Integer.toString(ans);


            button.setVisibility(View.GONE);
            gridLayout.setVisibility(View.VISIBLE);
            counter.setVisibility(View.VISIBLE);
            question.setVisibility(View.VISIBLE);
            timer.setVisibility(View.VISIBLE);
            question.setText(random1 + "+" + random2 + "=?");


            o1 = findViewById(R.id.o1);
            o2 = findViewById(R.id.o2);
            o3 = findViewById(R.id.o3);
            o4 = findViewById(R.id.o4);
            ArrayList options = new ArrayList();
            options.add(opt1);
            options.add(opt2);
            options.add(opt3);
            options.add(opt4);
            options.set(randomOpt, ans);
            o1.setText(options.get(0).toString());
            o2.setText(options.get(1).toString());
            o3.setText(options.get(2).toString());
            o4.setText(options.get(3).toString());
        }
    }
    public void check3(View view) {
        if (isRunning == true) {

            if (o4.getText() == Ans) {

                answer.setText("Correct!!");
                x++;
                y++;
                counter.setText(x + "/" + y);


            } else {
                answer.setText("Wrong :(");
                y++;
                counter.setText(x + "/" + y);
            }
            randomOpt = new Random().nextInt((3 - 0) + 1) + 0;
            random1 = new Random().nextInt((30 - 0) + 1) + 0;
            random2 = new Random().nextInt((30 - 0) + 1) + 0;
            ans = random1 + random2;
            opt1 = new Random().nextInt((60 - 0) + 1) + 0;
            opt2 = new Random().nextInt((60 - 0) + 1) + 0;
            opt3 = new Random().nextInt((60 - 0) + 1) + 0;
            opt4 = new Random().nextInt((60 - 0) + 1) + 0;
            Ans = Integer.toString(ans);


            button.setVisibility(View.GONE);
            gridLayout.setVisibility(View.VISIBLE);
            counter.setVisibility(View.VISIBLE);
            question.setVisibility(View.VISIBLE);
            timer.setVisibility(View.VISIBLE);
            question.setText(random1 + "+" + random2 + "=?");


            o1 = findViewById(R.id.o1);
            o2 = findViewById(R.id.o2);
            o3 = findViewById(R.id.o3);
            o4 = findViewById(R.id.o4);
            ArrayList options = new ArrayList();
            options.add(opt1);
            options.add(opt2);
            options.add(opt3);
            options.add(opt4);
            options.set(randomOpt, ans);
            o1.setText(options.get(0).toString());
            o2.setText(options.get(1).toString());
            o3.setText(options.get(2).toString());
            o4.setText(options.get(3).toString());

        }
    }
    public void reset(View view){
        counter.setText("0/0");

        randomOpt = new Random().nextInt((3 - 0) + 1) + 0;
        random1 = new Random().nextInt((30 - 0) + 1) + 0;
        random2 = new Random().nextInt((30 - 0) + 1) + 0;
        ans = random1 + random2;
        opt1 = new Random().nextInt((60 - 0) + 1) + 0;
        opt2 = new Random().nextInt((60 - 0) + 1) + 0;
        opt3 = new Random().nextInt((60 - 0) + 1) + 0;
        opt4 = new Random().nextInt((60 - 0) + 1) + 0;
        Ans = Integer.toString(ans);


        o1 = findViewById(R.id.o1);
        o2 = findViewById(R.id.o2);
        o3 = findViewById(R.id.o3);
        o4 = findViewById(R.id.o4);
        ArrayList options = new ArrayList();
        options.add(opt1);
        options.add(opt2);
        options.add(opt3);
        options.add(opt4);
        options.set(randomOpt, ans);
        o1.setText(options.get(0).toString());
        o2.setText(options.get(1).toString());
        o3.setText(options.get(2).toString());
        o4.setText(options.get(3).toString());


        countTimer = new CountDownTimer(30000, 1000) {
            int x = 29;
            public void onTick(long millisUntilFinished) {
                isRunning = true;

                timer.setText("0:" +x);
                x--;
            }

            public void onFinish() {
                answer.setText("FINISHED!");
                isRunning = false;
                button2.setVisibility(View.VISIBLE);

            }
        }.start();
        button2.setVisibility(View.INVISIBLE);

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        gridLayout = findViewById(R.id.gridLayout);
        timer = findViewById(R.id.timer);
        counter = findViewById(R.id.counter);
        question = findViewById(R.id.question);
        answer = findViewById(R.id.answer);
        button2= findViewById(R.id.button2);

    }
}
