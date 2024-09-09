package com.springBootCourseForDummies.Application.annotationBasedConfigurationTutorial.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springBootCourseForDummies.Application.annotationBasedConfigurationTutorial.model")
public class AppConfig {
}
