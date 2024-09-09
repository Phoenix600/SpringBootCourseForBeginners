package com.springBootCourseForDummies.Application.dependencyInjectionTutorial.withoutDependencyInjection;

import com.springBootCourseForDummies.Application.dependencyInjectionTutorial.withoutDependencyInjection.model.MessageSender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.springBootCourseForDummies.Application.dependencyInjectionTutorial.withoutDependencyInjection.config.AppConfig;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MessageSender messageSender = context.getBean(MessageSender.class);
        messageSender.sendTextMessage("Stoic Thoughts are Good For Mental Health");
    }
}
