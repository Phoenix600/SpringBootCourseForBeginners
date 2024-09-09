package com.springBootCourseForDummies.Application.annotationBasedConfigurationTutorial;

import com.springBootCourseForDummies.Application.annotationBasedConfigurationTutorial.config.AppConfig;
import com.springBootCourseForDummies.Application.annotationBasedConfigurationTutorial.model.Hiker;
import com.springBootCourseForDummies.Application.annotationBasedConfigurationTutorial.model.Traveler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Traveler traveler = (Traveler) context.getBean(Traveler.class);
        traveler.startJourney();

        Hiker hiker = context.getBean(Hiker.class);
        System.out.println(hiker);
        hiker.startTracking();

    }
}
