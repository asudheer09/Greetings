package com.example.greeting;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HindiGreeting implements Greeting{
    @Override
    public void wish() {
        System.out.println("shuba ka nay varsh ...!");
    }
}
