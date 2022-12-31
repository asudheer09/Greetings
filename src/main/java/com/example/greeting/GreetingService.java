package com.example.greeting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreetingService {
    //@Autowired
    Greeting greeting;

    //@Autowired
   /* public GreetingService(Greeting greeting){
        this.greeting=greeting;
    }*/

    @Autowired
    public void setGreeting(Greeting greeting) {
        this.greeting = greeting;
    }

    public void printWishes(){
        greeting.wish();
    }

}
