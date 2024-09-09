package com.springBootCourseForDummies.Application.dependencyInjectionTutorial.withoutDependencyInjection.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("messageSender")
public class MessageSender {
    EmailService emailService;
    SMSService smsService;


    public MessageSender(SMSService smsService)
    {
        this.smsService = smsService;
    }

//    public MessageSender(EmailService emailService)
//    {
//        this.emailService = emailService;
//    }

    public void sendTextMessage(String message)
    {
        this.smsService.sendMessage(message);
    }
}
