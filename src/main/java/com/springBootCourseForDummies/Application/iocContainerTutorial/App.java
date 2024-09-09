package com.springBootCourseForDummies.Application.iocContainerTutorial;

import com.springBootCourseForDummies.Application.iocContainerTutorial.config.AppConfig;
import com.springBootCourseForDummies.Application.iocContainerTutorial.model.Bike;
import com.springBootCourseForDummies.Application.iocContainerTutorial.model.Car;
import com.springBootCourseForDummies.Application.iocContainerTutorial.model.Cycle;
import com.springBootCourseForDummies.Application.iocContainerTutorial.model.Traveler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Car car = context.getBean(Car.class);
        System.out.println(car);
        car.move();

        Bike bike = context.getBean(Bike.class);
        System.out.println(bike);
        bike.move();

        Cycle cycle = context.getBean(Cycle.class);
        System.out.println(cycle);
        cycle.move();

        Traveler traveler = context.getBean(Traveler.class);
        System.out.println(traveler);
        traveler.startJourney();

    }
}
