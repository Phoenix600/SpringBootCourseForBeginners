package com.springBootCourseForDummies.Application.iocContainerTutorial.model;

import org.hibernate.sql.results.graph.EntityGraphTraversalState;

public class Traveler {
    Vehicle vehicle = null;
    public Traveler(Vehicle vehicle)
    {
        this.vehicle = vehicle;
    }
    public void startJourney()
    {
        this.vehicle.move();
    }
}
