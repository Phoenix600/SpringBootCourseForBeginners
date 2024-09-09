package com.springBootCourseForDummies.Application.dependencyInjectionTutorial.withDependencyInjection.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ModernMessageSender {

    private final MessageService smsService;
    private MessageService emailService;

    public ModernMessageSender(@Qualifier("smsService") MessageService smsService) {
        this.smsService = smsService;
    }

    @Autowired
    public ModernMessageSender(@Qualifier("emailService") MessageService emailService, MessageService smsService) {
        this.emailService = emailService;
        this.smsService = smsService;
    }

    public void sendMessage(String message) {
        smsService.sentMessage(message);
        emailService.sentMessage(message);
    }

}
