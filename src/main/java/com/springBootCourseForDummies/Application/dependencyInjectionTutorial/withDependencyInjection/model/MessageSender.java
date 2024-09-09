package com.springBootCourseForDummies.Application.dependencyInjectionTutorial.withDependencyInjection.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("messageSender")
public class MessageSender {
    MessageService messageService;


    public MessageSender(@Qualifier("emailService") MessageService messageService) {
        this.messageService = messageService;
    }

    public void SendMessage(String message) {
        this.messageService.sentMessage(message);
    }

}
