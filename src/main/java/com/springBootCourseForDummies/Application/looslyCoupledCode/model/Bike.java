package com.springBootCourseForDummies.Application.looslyCoupledCode.model;

public class Bike implements  Vehicle{
    @Override
    public void move()
    {
        System.out.println("Bike is moving");
    }
}
