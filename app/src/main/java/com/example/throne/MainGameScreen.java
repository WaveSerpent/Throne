package com.example.throne;

import android.content.Intent;
import android.icu.text.Edits;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.throne.event.base.answers.Answer;
import com.example.throne.event.base.events.Event;

import android.view.View;
import android.widget.Button;

import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MainGameScreen extends AppCompatActivity {
    private long peopleAttitude;
    private long money;
    private long military;
    private long food;
    private int percentOfIncome;
    private int shadowVariable1;
    private int karma;
    SomeEventGetter eventGetter = new SomeEventGetter();
    private Button answerButton1;
    private Button answerButton2;
    private Button answerButton3;
    private Button answerButton4;


    private Collection<Button> answersButtons;
    private TextView textOnScreen;

    Intent sendIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standart_event);

        Intent gottenIntent = getIntent();

        peopleAttitude = gottenIntent.getLongExtra("peopleAttitude", 50);
        money = gottenIntent.getLongExtra("money", 50);
        military = gottenIntent.getLongExtra("military", 30);
        food = gottenIntent.getLongExtra("food", 30);
        percentOfIncome = gottenIntent.getIntExtra("percentOfIncome", 5);
        shadowVariable1 = gottenIntent.getIntExtra("shadowVariable1", 0);
        karma = gottenIntent.getIntExtra("karma", 0);

        Toast.makeText(this, "New event started", Toast.LENGTH_SHORT).show();
        Event eventForNow = new Event(){
        };
        eventForNow = eventGetter.getSomeEvent();

        ArrayList<Answer> nowEventAnswers = new ArrayList<>(eventForNow.getEventAnswers());

        System.out.println(nowEventAnswers.size());
        System.out.println(eventForNow.getEventText());
        int thisEventNumberOfAnswers = eventForNow.getNumberOfAnswers();

        answerButton1 = findViewById(R.id.BT_STNDMN_1);
        answerButton2 = findViewById(R.id.BT_STNDMN_2);
        answerButton3 = findViewById(R.id.BT_STNDMN_3);
        answerButton4 = findViewById(R.id.BT_STNDMN_4);

        takeButtons(thisEventNumberOfAnswers, nowEventAnswers);

        textOnScreen = findViewById(R.id.TV_EVENT_TEXT);

        textOnScreen.setText(eventForNow.getEventText());

        sendIntent = new Intent(this, MainGameScreen.class);

        sendIntent.putExtra("peopleAttitude", peopleAttitude);
        sendIntent.putExtra("money", money);
        sendIntent.putExtra("military", military);
        sendIntent.putExtra("food", food);
        sendIntent.putExtra("percentOfIncome", percentOfIncome);
        sendIntent.putExtra("shadowVariable1", shadowVariable1);
        sendIntent.putExtra("karma", karma);


    }

    private void takeButtons(int quantityOfAnswers, ArrayList<Answer> answerArrayList) {
        System.out.println(quantityOfAnswers);
        Answer answer = answerArrayList.get(0);
        answerButton1.setText(answer.getTextOfAnswer());
        answer = answerArrayList.get(1);
        answerButton2.setText(answer.getTextOfAnswer());
        answer = answerArrayList.get(2);
        answerButton3.setText(answer.getTextOfAnswer());
        answer = answerArrayList.get(3);
        answerButton4.setText(answer.getTextOfAnswer());
    }


    public void onFirstButtonClick(View view) {
        Toast.makeText(this, "First Answer", Toast.LENGTH_SHORT).show();
        startActivity(sendIntent);
    }

    public void onSecondButtonClick(View view) {
        Toast.makeText(this, "Second Answer", Toast.LENGTH_SHORT).show();
        startActivity(sendIntent);
    }

    public void onThirdButtonClick(View view) {
        Toast.makeText(this, "Third Answer", Toast.LENGTH_SHORT).show();
        startActivity(sendIntent);
    }

    public void onFourthButtonClick(View view) {
        Toast.makeText(this, "Fourth Answer", Toast.LENGTH_SHORT).show();
        startActivity(sendIntent);
    }
}
