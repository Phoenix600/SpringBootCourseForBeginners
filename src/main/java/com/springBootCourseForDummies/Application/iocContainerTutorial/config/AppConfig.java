package com.springBootCourseForDummies.Application.iocContainerTutorial.config;

import com.springBootCourseForDummies.Application.iocContainerTutorial.model.*;
import org.hibernate.sql.results.graph.EntityGraphTraversalState;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Car car()
    {
        return new Car();
    }

    @Bean
    public Bike bike()
    {
        return new Bike();
    }

    @Bean
    public Cycle cycle()
    {
        return new Cycle();
    }

    @Bean
    public Traveler traveler()
    {
        return new Traveler(new Bike());
    }

}
