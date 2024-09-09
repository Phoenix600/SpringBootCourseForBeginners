package com.springBootCourseForDummies.Application.looslyCoupledCode;

import com.springBootCourseForDummies.Application.looslyCoupledCode.model.*;

public class App {
    public static void main(String[] args) {

        Vehicle cycle = new Cycle();
        Traveler traveler = new Traveler(cycle);
        traveler.startJourney();

        Vehicle bike = new Bike();
        traveler = new Traveler(cycle);
        traveler.startJourney();


        Vehicle car = new Car();
        traveler = new Traveler(cycle);
        traveler.startJourney();
        

    }
}
