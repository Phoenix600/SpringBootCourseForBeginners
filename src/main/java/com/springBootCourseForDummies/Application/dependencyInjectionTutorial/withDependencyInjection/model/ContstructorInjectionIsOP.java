package com.springBootCourseForDummies.Application.dependencyInjectionTutorial.withDependencyInjection.model;


import org.springframework.stereotype.Component;


@Component
class Data1 {

}


@Component
class Data2 {

}

@Component
public class ContstructorInjectionIsOP {

    private final Data1 data1;
    private final Data2 data2;


    public ContstructorInjectionIsOP(Data1 data1, Data2 data2)
    {
        this.data1 = data1;
        this.data2 = data2;
    }

}
