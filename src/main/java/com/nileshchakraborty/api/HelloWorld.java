package com.nileshchakraborty.api;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class HelloWorld implements Hello{

    public HelloWorld(){
        System.out.println("Construct call");
    }
    public void sayHello(){
        System.out.println("HelloWorld");
    }

    @PostConstruct
    public void postConstructCall(){
        System.out.println("Called after constructor call");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Called pre destroy.");
    }
}
