package com.springBootCourseForDummies.Application.annotationBasedConfigurationTutorial.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("traveler")
public class Traveler {
    Vehicle vehicle;

    Traveler(@Qualifier("car") Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }

    public void startJourney()
    {
        vehicle.move();
    }
}
