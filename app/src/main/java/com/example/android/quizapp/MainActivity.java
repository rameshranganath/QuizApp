package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;

import static com.example.android.quizapp.R.id.display_Score;
import static com.example.android.quizapp.R.id.question_1;
import static com.example.android.quizapp.R.id.question_2;
import static com.example.android.quizapp.R.id.question_3;
import static com.example.android.quizapp.R.id.question_4;
import static com.example.android.quizapp.R.id.question_5;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score = 0;

    public void submitAnswer(View view) {

        RadioGroup getValue = (RadioGroup) findViewById(question_1);

        if (getValue.getCheckedRadioButtonId() == R.id.question1answer1) {
            score = score + 0;

        } else if (getValue.getCheckedRadioButtonId() == R.id.question1answer2) {
            score = score + 0;
        } else if (getValue.getCheckedRadioButtonId() == R.id.question1answer3) {
            score = score + 20;
        }

        RadioGroup getValue2 = (RadioGroup) findViewById(question_2);

        if (getValue2.getCheckedRadioButtonId() == R.id.question2answer1) {
            score = score + 0;

        } else if (getValue2.getCheckedRadioButtonId() == R.id.question2answer2) {
            score = score + 20;
        } else if (getValue2.getCheckedRadioButtonId() == R.id.question2answer3) {
            score = score + 0;
        }

        RadioGroup getValue3 = (RadioGroup) findViewById(question_3);

        if (getValue3.getCheckedRadioButtonId() == R.id.question3answer1) {
            score = score + 20;

        } else if (getValue3.getCheckedRadioButtonId() == R.id.question3answer2) {
            score = score + 0;
        } else if (getValue3.getCheckedRadioButtonId() == R.id.question3answer3) {
            score = score + 0;
        }

        RadioGroup getValue4 = (RadioGroup) findViewById(question_4);

        if (getValue4.getCheckedRadioButtonId() == R.id.question4answer1) {
            score = score + 0;

        } else if (getValue4.getCheckedRadioButtonId() == R.id.question4answer2) {
            score = score + 20;
        } else if (getValue4.getCheckedRadioButtonId() == R.id.question4answer3) {
            score = score + 0;
        }
        RadioGroup getValue5 = (RadioGroup) findViewById(question_5);

        if (getValue5.getCheckedRadioButtonId() == R.id.question5answer1) {
            score = score + 0;

        } else if (getValue5.getCheckedRadioButtonId() == R.id.question5answer2) {
            score = score + 0;
        } else if (getValue5.getCheckedRadioButtonId() == R.id.question5answer3) {
            score = score + 20;
        }
        display(score);

        getValue.clearCheck();
        getValue2.clearCheck();
        getValue3.clearCheck();
        getValue4.clearCheck();
        getValue5.clearCheck();
    }

    public void display(int value) {
        TextView displayScore = (TextView) findViewById(display_Score);
        displayScore.setText(" Your Total Score is : " + score);
        score = 0;
    }

    public void onReset(View view) {
        TextView displayScore = (TextView) findViewById(display_Score);
        displayScore.setText(" ");
    }
}

