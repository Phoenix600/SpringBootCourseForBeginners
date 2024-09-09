package com.springBootCourseForDummies.Application.dependencyInjectionTutorial.withoutDependencyInjection.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springBootCourseForDummies.Application.dependencyInjectionTutorial.withoutDependencyInjection.model")
public class AppConfig {
}
