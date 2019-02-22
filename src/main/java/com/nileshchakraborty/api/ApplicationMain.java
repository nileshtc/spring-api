package com.nileshchakraborty.api;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
        Hello hello = context.getBean(HelloWorld.class);
        hello.sayHello();
        context.close();
    }
}
