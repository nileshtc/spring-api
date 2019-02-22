package com.nileshchakraborty.api.complex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplConfig.class);
        Notification notification = context.getBean(Notification.class);
        notification.sendNotification("reason", "Message");
        context.close();
    }
}
