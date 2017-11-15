package com.example.opilane.simplequiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;

public class AnswerActivity extends AppCompatActivity {

    private Questions MyQuestions = new Questions();
    private TextView vastusedj2rjest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        vastusedj2rjest = (TextView) findViewById(R.id.vastusedJ2rjest);
        int arraySize = MyQuestions.MyCorrectAnswers.length;
        for (int i = 0; i < arraySize; i++){
            vastusedj2rjest.append(i+1 + ". " + MyQuestions.MyCorrectAnswers[i] + "\n");
        }
    }
    public void onUuesti(View view) {
        Intent intent = new Intent(AnswerActivity.this,
                MainActivity.class);
        startActivity(intent);
    }
    public void onTagasi(View view) {
        Intent intent = new Intent(AnswerActivity.this,
                HighestScoreActivity.class);
        startActivity(intent);
    }
}
