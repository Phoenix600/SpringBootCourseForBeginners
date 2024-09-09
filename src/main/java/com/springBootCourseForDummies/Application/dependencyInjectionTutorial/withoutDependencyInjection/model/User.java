package com.springBootCourseForDummies.Application.dependencyInjectionTutorial.withoutDependencyInjection.model;

import org.springframework.stereotype.Component;

/**
 * User Class Depends On The Object Of Address Class
 */
@Component
public class User {
    public String username;
    public String password;
    Address address;
    public User(Address address)
    {
        this.address = address;
    }
}
