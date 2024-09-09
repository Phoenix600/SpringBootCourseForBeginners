package com.springBootCourseForDummies.Application.looslyCoupledCode.model;

public class Car implements  Vehicle{

    @Override
    public void move()
    {
        System.out.println("Car is moving");
    }
}
