package com.example.throne.event.base.answers;

public class Answer {
    private long peopleAttitude;
    private long money;
    private long military;
    private long food;
    private long karma;
    private String textOfAnswer;

    public Answer(long peopleAttitude, long money, long military, long food, long karma, String textOfAnswer) {
        this.peopleAttitude = peopleAttitude;
        this.money = money;
        this.military = military;
        this.food = food;
        this.karma = karma;
        this.textOfAnswer = textOfAnswer;
    }

    public void changeVariables(long peopleAttitude, long money, long military, long food, long karma, String textOfAnswer){
        this.peopleAttitude = peopleAttitude;
        this.money = money;
        this.military = military;
        this.food = food;
        this.karma = karma;
        this.textOfAnswer = textOfAnswer;
    }
    public String getTextOfAnswer(){
        return textOfAnswer;
    }
}
