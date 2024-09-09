package com.springBootCourseForDummies.Application.dependencyInjectionTutorial.withDependencyInjection.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AdaptiveModernMessageSender {

    private MessageService messageService;
    private MessageService emailService;

    public void sendMessage(String message)
    {
        this.messageService.sentMessage(message);
        this.emailService.sentMessage(message);
    }


    // Setter
    @Autowired
    public void setMessageService(MessageService messageService)
    {
        System.out.println("Setter Based Dependency Injection");
        this.messageService = messageService;
    }

    @Autowired
    public void setEmailService(MessageService emailService)
    {
        System.out.println("Setter Based Dependency Injection");
        this.emailService = emailService;
    }

}
