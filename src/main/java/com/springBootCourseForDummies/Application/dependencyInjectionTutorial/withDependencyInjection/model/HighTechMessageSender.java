package com.springBootCourseForDummies.Application.dependencyInjectionTutorial.withDependencyInjection.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HighTechMessageSender {

    @Autowired
    @Qualifier("emailService")
    MessageService messageService1;

    @Autowired
    MessageService messageService2;

    public void sendMessage(String message)
    {
        this.messageService1.sentMessage(message);
        this.messageService2.sentMessage(message);
    }

}
