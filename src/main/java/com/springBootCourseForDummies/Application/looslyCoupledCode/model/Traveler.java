package com.springBootCourseForDummies.Application.looslyCoupledCode.model;


public class Traveler {
    Vehicle vehicle;
    public Traveler(Vehicle vehicle)
    {
            this.vehicle = vehicle;
    }

    public void startJourney()
    {
        this.vehicle.move();
    }

}
