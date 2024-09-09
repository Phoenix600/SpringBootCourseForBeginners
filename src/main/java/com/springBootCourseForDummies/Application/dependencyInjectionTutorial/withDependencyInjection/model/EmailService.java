package com.springBootCourseForDummies.Application.dependencyInjectionTutorial.withDependencyInjection.model;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("emailService")
public class EmailService implements MessageService{

    @Override
    public void sentMessage(String message) {
        System.out.println("Email Sent : " + message);
    }
}
