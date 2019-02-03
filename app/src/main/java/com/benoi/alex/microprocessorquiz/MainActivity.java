package com.benoi.alex.microprocessorquiz;


import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText inputanswer1, inputanswer3;
    RadioButton answerA2,answerB2,answerC2,answerD2,answerA4,answerB4,answerA5,answerB5,answerC5,answerD5;
    CheckBox answer6A, answer6B, answer6C, answer6D, answer7A, answer7B, answer7C, answer7D,answer7E, answer8A, answer8B, answer8C, answer8D;
    boolean checkanswer6A,checkanswer6B, checkanswer6C, checkanswer6D, checkanswer7A, checkanswer7B, checkanswer7C,checkanswer7D, checkanswer7E, checkanswer8A, checkanswer8B, checkanswer8C, checkanswer8D;
    int answer1_score,answer2_score,answer3_score,answer4_score,answer5_score,answer6_score,answer7_score,answer8_score,final_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void question2answer(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch ((view.getId())) {
            case R.id.A2:
                if (checked) {
                    break;
                }
            case R.id.B2:
                if (checked) {
                    break;
                }
            case R.id.C2:
                if (checked) {
                    break;
                }
            case R.id.D2:
                if (checked) {
                    break;
                }
        }
    }

    public void question4answer(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch ((view.getId())) {
            case R.id.A4:
                if (checked) {
                    break;
                }
            case R.id.B4:
                if (checked) {
                    break;
                }
        }
    }

    public void question5answer(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch ((view.getId())) {
            case R.id.A5:
                if (checked) {
                    break;
                }
            case R.id.B5:
                if (checked) {
                    break;
                }
            case R.id.C5:
                if (checked) {
                    break;
                }
            case R.id.D5:
                if (checked) {
                    break;
                }
        }
    }

    private int calculatescore() {


        answer6A = (CheckBox) this.findViewById(R.id.A6);
        checkanswer6A = answer6A.isChecked();
        answer6B = (CheckBox) this.findViewById(R.id.B6);
        checkanswer6B = answer6B.isChecked();
        answer6C = (CheckBox) this.findViewById(R.id.C6);
        checkanswer6C = answer6C.isChecked();
        answer6D = (CheckBox) this.findViewById(R.id.D6);
        checkanswer6D = answer6D.isChecked();
        answer7A = (CheckBox) this.findViewById(R.id.A7);
        checkanswer7A = answer7A.isChecked();
        answer7B = (CheckBox) this.findViewById(R.id.B7);
        checkanswer7B = answer7B.isChecked();
        answer7C = (CheckBox) this.findViewById(R.id.C7);
        checkanswer7C = answer7C.isChecked();
        answer7D = (CheckBox) this.findViewById(R.id.D7);
        checkanswer7D = answer7D.isChecked();
        answer7E = (CheckBox) this.findViewById(R.id.E7);
        checkanswer7E = answer7E.isChecked();
        answer8A = (CheckBox) this.findViewById(R.id.A8);
        checkanswer8A = answer8A.isChecked();
        answer8B = (CheckBox) this.findViewById(R.id.B8);
        checkanswer8B = answer8B.isChecked();
        answer8C = (CheckBox) this.findViewById(R.id.C8);
        checkanswer8C = answer8C.isChecked();
        answer8D = (CheckBox) this.findViewById(R.id.D8);
        checkanswer8D = answer8D.isChecked();

        // Question 1
        String answer1;
        inputanswer1 = (EditText) this.findViewById(R.id.answer1);
        answer1 = inputanswer1.getText().toString();
        if (answer1.equals("8086")) {
            answer1_score =1;
        } else {
            answer1_score = 0;
        }

        //Question 2
        Boolean answer2;
        answerB2 = (RadioButton) this.findViewById(R.id.B2);
        answer2 = answerB2.isChecked();
        if (answer2) {
            answer2_score = 1;
        } else {
            answer2_score = 0;
        }

        // Question 3
        String answer3;
        inputanswer3 = (EditText) this.findViewById(R.id.answer3);
        answer3 = inputanswer3.getText().toString();
        if (answer3.equals("1 MB")) {
            answer3_score =1;
        } else {
            answer3_score = 0;
        }

        // Question 4
        Boolean answer4;
        answerB4 = (RadioButton) this.findViewById(R.id.B4);
        answer4 = answerB4.isChecked();
        if (answer4) {
            answer4_score = 1;
        } else {
            answer4_score = 0;
        }

        // Question 5
        Boolean answer5;
        answerA5 = (RadioButton) this.findViewById(R.id.A5);
        answer5 = answerA5.isChecked();
        if (answer5) {
            answer5_score = 1;
        } else {
            answer5_score = 0;
        }

        // Question 6
        if (checkanswer6A && !checkanswer6B &&checkanswer6C &&checkanswer6D) {
            answer6_score = 1;
        } else {
            answer6_score = 0;
        }


        //Question 7
        if (checkanswer7A && checkanswer7B && checkanswer7C && !checkanswer7D && checkanswer7E) {
            answer7_score = 1;
        } else {
            answer7_score = 0;
        }

        // Question 8
        if (checkanswer8A && checkanswer8B && checkanswer8C && checkanswer8D) {
            answer8_score =1;
        } else {
            answer8_score = 0;
        }

        final_score = answer1_score + answer2_score + answer3_score + answer4_score + answer5_score +
                answer6_score + answer7_score + answer8_score;
        return final_score;
    }

    public int submit(View view) {
        calculatescore();
        String Display;
        if (final_score == 8) {
            Display = "Perfect! You scored 8 out of 8";
        } else {
            Display = "Try again. You scored " + final_score + " out of 8";
        }
        Toast.makeText(MainActivity.this, "Your Score is " + Display, Toast.LENGTH_SHORT).show();

        // to uncheck all the checkboxes
        if (answer6A.isChecked()){
            answer6A.setChecked(false);
        }
        if (answer6B.isChecked()){
            answer6B.setChecked(false);
        }
        if (answer6C.isChecked()){
            answer6C.setChecked(false);
        }
        if (answer6D.isChecked()){
            answer6D.setChecked(false);
        }
        if (answer7A.isChecked()){
            answer7A.setChecked(false);
        }
        if (answer7B.isChecked()){
            answer7B.setChecked(false);
        }
        if (answer7C.isChecked()){
            answer7C.setChecked(false);
        }
        if (answer7D.isChecked()){
            answer7D.setChecked(false);
        }
        if (answer7E.isChecked()){
            answer7E.setChecked(false);
        }
        if (answer8A.isChecked()){
            answer8A.setChecked(false);
        }
        if (answer8B.isChecked()){
            answer8B.setChecked(false);
        }
        if (answer8C.isChecked()){
            answer8C.setChecked(false);
        }
        if (answer8D.isChecked()){
            answer8D.setChecked(false);
        }

        //to uncheck all the radiobutton
        answerA2 = (RadioButton) findViewById(R.id.A2);
        answerB2 = (RadioButton) findViewById(R.id.B2);
        answerC2 = (RadioButton) findViewById(R.id.C2);
        answerD2 = (RadioButton) findViewById(R.id.D2);
        answerA4 = (RadioButton) findViewById(R.id.A4);
        answerB4 = (RadioButton) findViewById(R.id.B4);
        answerA5 = (RadioButton) findViewById(R.id.A5);
        answerB5 = (RadioButton) findViewById(R.id.B5);
        answerC5 = (RadioButton) findViewById(R.id.C5);
        answerD5 = (RadioButton) findViewById(R.id.D5);


        answerA2.setChecked(false);
        answerB2.setChecked(false);
        answerC2.setChecked(false);
        answerD2.setChecked(false);
        answerA4.setChecked(false);
        answerB4.setChecked(false);
        answerA5.setChecked(false);
        answerB5.setChecked(false);
        answerC5.setChecked(false);
        answerD5.setChecked(false);

        inputanswer1.setText(null);
        inputanswer3.setText(null);

        return final_score = 0;
    }
}
