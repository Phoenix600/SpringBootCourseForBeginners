package com.springBootCourseForDummies.Application.dependencyInjectionTutorial.withDependencyInjection.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class DependencyA {

}

@Component
class DependencyB {

}

@Component
class DependencyC {

}

@Component
class DependencyD {

}

@Component
class DependencyE{
    private DependencyF dependencyF;

//    This creates the CircularDependency Problem
//    DependencyE(DependencyF dependencyF)
//    {
//        this.dependencyF = dependencyF;
//    }


    @Autowired
    void setDependencyF(DependencyF dependencyF)
    {
        this.dependencyF = dependencyF;
    }
}


@Component
class  DependencyF
{
    private DependencyE dependencyE;
//    This creates the Circular Dependency Problem
//    public DependencyF(DependencyE dependencyE)
//    {
//        this.dependencyE = dependencyE;
//    }

    void setDependencyE(DependencyE dependencyE)
    {
        this.dependencyE = dependencyE;
    }

}

@Component
public class CircularDependency {
    private DependencyA dependencyA;
    private DependencyB dependencyB;
    private DependencyC dependencyC;
    private DependencyD dependencyD;
    private DependencyE dependencyE;
    private DependencyF dependencyF;

    // Constructor Based Dependency Injection
    public CircularDependency(DependencyA dependencyA, DependencyB dependencyB, DependencyC dependencyC, DependencyD dependencyD,DependencyE dependencyE,DependencyF dependencyF) {
        this.dependencyA = dependencyA;
        this.dependencyB = dependencyB;
        this.dependencyC = dependencyC;
        this.dependencyD = dependencyD;
        this.dependencyE = dependencyE;
        this.dependencyF = dependencyF;
    }

}