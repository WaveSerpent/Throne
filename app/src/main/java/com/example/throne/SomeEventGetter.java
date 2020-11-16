package com.example.throne;

import com.example.throne.event.base.events.Event;
import com.example.throne.event.base.events.TestEvent1;
import com.example.throne.event.base.events.TestEvent2;
import com.example.throne.event.base.events.TestEvent3;
import com.example.throne.event.base.events.TestEvent4;

import java.util.Random;

public class SomeEventGetter {

        private  Random random = new Random();
        private  int numberOfEvent;

        public Event getSomeEvent(){
            numberOfEvent = random.nextInt(4)+1;
            switch (numberOfEvent){
                case 1:
                    Event event1 = new TestEvent1();
                    return event1;
                case 2:
                    Event event2 = new TestEvent2();
                    return event2;
                case 3:
                    Event event3 = new TestEvent3();
                    return event3;
                case 4:
                    Event event4 = new TestEvent4();
                    return event4;
                default:
                    Event event5 = new TestEvent4();
                    return event5;
            }
        }

}
