package com.springBootCourseForDummies.Application.dependencyInjectionTutorial.withoutDependencyInjection.model;


import org.springframework.stereotype.Component;

@Component("smsService")
public class SMSService {

    void sendMessage(String message)
    {
        System.out.println("SMS Sent : " + message);
    }
}
