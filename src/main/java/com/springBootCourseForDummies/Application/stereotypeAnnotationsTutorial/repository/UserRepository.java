package com.springBootCourseForDummies.Application.stereotypeAnnotationsTutorial.repository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    public void hello()
    {
        System.out.println("Hello From UserRepository");
    }
}
