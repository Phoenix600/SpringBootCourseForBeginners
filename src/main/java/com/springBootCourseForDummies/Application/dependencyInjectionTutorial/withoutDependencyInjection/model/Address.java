package com.springBootCourseForDummies.Application.dependencyInjectionTutorial.withoutDependencyInjection.model;

import org.springframework.stereotype.Component;

@Component("address")
public class Address {
    String city;
    String block;
    String state;
    String zipcode;
}
