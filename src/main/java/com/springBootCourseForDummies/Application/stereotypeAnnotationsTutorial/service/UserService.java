package com.springBootCourseForDummies.Application.stereotypeAnnotationsTutorial.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    public void hello()
    {
        System.out.println("Hello From UserService");
    }
}
