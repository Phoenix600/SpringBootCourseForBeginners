package com.springBootCourseForDummies.Application.dependencyInjectionTutorial.withDependencyInjection;

import com.springBootCourseForDummies.Application.dependencyInjectionTutorial.withDependencyInjection.model.*;

import com.springBootCourseForDummies.Application.dependencyInjectionTutorial.withDependencyInjection.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.getBean(MessageSender.class).SendMessage("Stoic man once said, It's okay to be Sad");

        // Constructor Based Dependency Injection
        var object = context.getBean(ModernMessageSender.class);
        object.sendMessage("Stop Creating Fake Scenarios in your head...");

        // Setter Based Dependency Injection
        AdaptiveModernMessageSender object1 = context.getBean(AdaptiveModernMessageSender.class);
        object1.sendMessage("I love to write code in java");

        // circular Dependency Problem
        CircularDependency dependency = context.getBean(CircularDependency.class);
        System.out.println(dependency);

        // Constructor Based Injection helps to avoid NullPointerException
        ContstructorInjectionIsOP object3 = context.getBean(ContstructorInjectionIsOP.class);
        System.out.println(object3);

        // FieldBased dependency Injection
        HighTechMessageSender object4 = context.getBean(HighTechMessageSender.class);
        object4.sendMessage("This field-based Dependency injection, But you can not create immutable object, only constructor based DI can do this");

    }
}
