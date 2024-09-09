package com.springBootCourseForDummies.Application.dependencyInjectionTutorial.withoutDependencyInjection.model;

import org.springframework.stereotype.Component;

@Component("emailService")
public class EmailService {

    void sendMessage(String message)
    {
        System.out.println("Email Sent : " + message);
    }
}
