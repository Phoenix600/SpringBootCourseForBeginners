package com.springBootCourseForDummies.Application.dependencyInjectionTutorial.withDependencyInjection.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springBootCourseForDummies.Application.dependencyInjectionTutorial.withDependencyInjection.model")
public class AppConfig {

}
