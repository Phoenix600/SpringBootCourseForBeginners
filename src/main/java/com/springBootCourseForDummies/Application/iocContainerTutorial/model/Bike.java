package com.springBootCourseForDummies.Application.iocContainerTutorial.model;

public class Bike implements  Vehicle{
    @Override
    public void move()
    {
        System.out.println("Bike is moving");
    }
}
