package com.example.greeting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class GreetingsApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(GreetingsApplication.class, args);

        //String result=	add();
        GreetingService greetingService = context.getBean(GreetingService.class);
        greetingService.printWishes();
    }

    public static String add() {
        return "add";
    }

}
