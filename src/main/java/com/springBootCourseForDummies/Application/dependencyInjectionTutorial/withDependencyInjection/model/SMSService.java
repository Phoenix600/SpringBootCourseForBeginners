package com.springBootCourseForDummies.Application.dependencyInjectionTutorial.withDependencyInjection.model;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("smsService")
@Primary
public class SMSService implements MessageService{

    @Override
    public void sentMessage(String message) {
        System.out.println("SMS Sent : " + message);
    }
}
