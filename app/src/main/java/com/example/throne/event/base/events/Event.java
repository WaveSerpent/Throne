package com.example.throne.event.base.events;


import com.example.throne.event.base.answers.Answer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public abstract class Event {

    protected String eventText;
    protected int numberOfAnswers;
    protected ArrayList<Answer> eventAnswers = new ArrayList<Answer>();

    public Event(){

    }

    public void setEventText(){
        eventText = null;
    }

    public void setEventAnswers(){
        numberOfAnswers = 0;
        eventAnswers = null;
    }

    public String getEventText() {
        return eventText;
    }

    public int getNumberOfAnswers() {
        return numberOfAnswers;
    }

    public ArrayList<Answer> getEventAnswers(){
        return eventAnswers;
    }

}
