package com.example.greeting;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
public class EnglishGreeting implements  Greeting{
    @Override
    public void wish() {
        System.out.println("Happy new year... !");
    }
}
