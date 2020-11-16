package com.example.throne.event.base.events;

import com.example.throne.event.base.answers.Answer;

public class TestEvent4 extends Event{
    @Override
    public void setEventText() {
        eventText = "This is one of the first's events in game! Enjoy!\n(Test Event 4)";
    }

    @Override
    public void setEventAnswers() {
        numberOfAnswers = 4;
        Answer answer = new Answer(0, 200, 10, 150, 0, "First Variant");
        eventAnswers.add(answer);
        answer.changeVariables(0, 200, 10, 150, 0, "Second VAriant" );
        eventAnswers.add(answer);
        answer.changeVariables(0, 200, 10, 150, 0, "Third Variant");
        eventAnswers.add(answer);
        answer.changeVariables(0, 200, 10, 150, 0, "Fourth Variant");
        eventAnswers.add(answer);
    }
}
