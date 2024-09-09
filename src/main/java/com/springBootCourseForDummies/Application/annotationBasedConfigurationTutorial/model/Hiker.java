package com.springBootCourseForDummies.Application.annotationBasedConfigurationTutorial.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("hiker")
public class Hiker {

    Vehicle vehicle;

    @Autowired
    public Hiker(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }

    public void startTracking()
    {
        vehicle.move();
    }

}
