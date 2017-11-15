package com.example.opilane.simplequiz;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.widget.Toast;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Questions MyQuestions = new Questions();
    private ImageView myImageView;
    private Button vastus1;
    private Button vastus2;
    private Button vastus3;
    private Button vastus4;
    private TextView result;
    private TextView kysimus;
    private ImageView question;
    private String MyAnswer;
    private int MyScore =0;
    private int MyQuestionNumber =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vastus1 = (Button) findViewById(R.id.vastus1);
        vastus2 = (Button) findViewById(R.id.vastus2);
        vastus3 = (Button) findViewById(R.id.vastus3);
        vastus4 = (Button) findViewById(R.id.vastus4);
        result = (TextView) findViewById(R.id.result);
        kysimus = (TextView) findViewById(R.id.kysimus);
        updateQuestion();
        updateScore(MyScore);
    }

    private void updateQuestion() {
        if (MyQuestionNumber < MyQuestions.getLength()){
            kysimus.setText(MyQuestions.getQuestions(MyQuestionNumber));
            vastus1.setText(MyQuestions.getChoice(MyQuestionNumber,1));
            vastus2.setText(MyQuestions.getChoice(MyQuestionNumber,2));
            vastus3.setText(MyQuestions.getChoice(MyQuestionNumber,3));
            vastus4.setText(MyQuestions.getChoice(MyQuestionNumber,4));
            MyAnswer = MyQuestions.getCorrectAnswer(MyQuestionNumber);
            MyQuestionNumber++;
        }
        else{
            Toast.makeText(MainActivity.this, "See oli viimane küsimus!",Toast.LENGTH_SHORT).show();;
            Intent intent = new Intent(MainActivity.this, HighestScoreActivity.class);
            intent.putExtra("score", MyScore);
            startActivity(intent);
        }
    }
    private void updateScore(int point){
        result.setText(""+ MyScore +"/"+MyQuestions.getLength());
    }
    public void onClick(View view){
        Button answer = (Button) view;
        if(answer.getText()==MyAnswer){
            MyScore += 1;
            Toast.makeText(MainActivity.this,"Õige vastus!",Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MainActivity.this,"Vale vastus!",Toast.LENGTH_SHORT).show();
        }
        updateScore(MyScore);
        updateQuestion();
    }
}
