package com.springBootCourseForDummies.Application.tightlyCoupledCode;

import com.springBootCourseForDummies.Application.tightlyCoupledCode.model.Traveler;

public class App {
    public static void main(String[] args) {
        Traveler traveler = new Traveler();
        traveler.startJourney();
    }
}
