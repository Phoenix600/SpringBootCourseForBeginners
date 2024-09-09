package com.springBootCourseForDummies.Application.stereotypeAnnotationsTutorial.model;

import org.springframework.stereotype.Component;

@Component
public class User {
    public void hello()
    {
        System.out.println("Hello User Model");
    }
}
