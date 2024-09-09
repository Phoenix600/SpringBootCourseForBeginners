package com.springBootCourseForDummies.Application.stereotypeAnnotationsTutorial.controller;

import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    public void hello()
    {
        System.out.println("Hello From Controller");
    }
}
