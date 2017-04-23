package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

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

        if (getValue.getCheckedRadioButtonId() == R.id.question1answer3) {
            score = ++score;
        }
        RadioGroup getValue2 = (RadioGroup) findViewById(question_2);

        if (getValue2.getCheckedRadioButtonId() == R.id.question2answer2) {
            score = ++score;

        }
        RadioGroup getValue3 = (RadioGroup) findViewById(question_3);

        if (getValue3.getCheckedRadioButtonId() == R.id.question3answer1) {
            score = ++score;

        }

        RadioGroup getValue4 = (RadioGroup) findViewById(question_4);

        if (getValue4.getCheckedRadioButtonId() == R.id.question4answer2) {
            score = ++score;

        }
        RadioGroup getValue5 = (RadioGroup) findViewById(question_5);

        if (getValue5.getCheckedRadioButtonId() == R.id.question5answer3) {
            score = ++score;

        }

        CheckBox Answer1 = (CheckBox) findViewById(R.id.question6answer1);
        Boolean isAnswer1 = Answer1.isChecked();
        CheckBox Answer2 = (CheckBox) findViewById(R.id.question6answer2);
        Boolean isAnswer2 = Answer2.isChecked();
        CheckBox Answer3 = (CheckBox) findViewById(R.id.question6answer3);
        Boolean isAnswer3 = Answer3.isChecked();
        CheckBox Answer4 = (CheckBox) findViewById(R.id.question6answer4);
        Boolean isAnswer4 = Answer4.isChecked();


        if (isAnswer3) {
            score = ++score;

        }
        if (((isAnswer1 && isAnswer3) || (isAnswer2 && isAnswer3) || (isAnswer3 && isAnswer4))) {
            score = --score;
        } else if (isAnswer1 && isAnswer2 || isAnswer1 && isAnswer4 || isAnswer2 && isAnswer4) {
            score = score;
        }

        EditText getAnswer = (EditText) findViewById(R.id.userInputText);
        String enteredValue = getAnswer.getText().toString();
        if (enteredValue.equals("Java.lang.object")) {
            score = ++score;
        } else {
            score = score;
        }
        display(score);

        getValue.clearCheck();
        getValue2.clearCheck();
        getValue3.clearCheck();
        getValue4.clearCheck();
        getValue5.clearCheck();
        if (Answer1.isChecked()) {
            Answer1.toggle();
        }
        if (Answer2.isChecked()) {
            Answer2.toggle();
        }
        if (Answer3.isChecked()) {
            Answer3.toggle();
        }
        if (Answer4.isChecked()) {
            Answer4.toggle();
        }
    }

    public void display(int value) {
        TextView displayScore = (TextView) findViewById(display_Score);
        if (score > 5) {
            Toast.makeText(this, "Awesome!!!", Toast.LENGTH_SHORT).show();
            displayScore.setText(" Your Total Score is : " + score);
        } else if (score >= 4 && score <= 6) {
            Toast.makeText(this, "Good Job!!!", Toast.LENGTH_SHORT).show();
            displayScore.setText(" Your Total Score is : " + score);
        } else if (score >= 2 && score <= 3) {
            Toast.makeText(this, "You are almost there, try again!!!", Toast.LENGTH_SHORT).show();
            displayScore.setText(" Your Total Score is : " + score);
        } else {
            Toast.makeText(this, "Better luck next time", Toast.LENGTH_SHORT).show();
            displayScore.setText(" Your Total Score is : " + score);
        }
        score = 0;
    }

    public void onReset(View view) {
        TextView displayScore = (TextView) findViewById(display_Score);
        displayScore.setText(" ");
    }
}

