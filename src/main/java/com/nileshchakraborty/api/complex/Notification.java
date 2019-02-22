package com.nileshchakraborty.api.complex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Notification {
    @Autowired
    private EmailService emailService;
    /*public Notification(EmailService emailService){
        this.emailService = emailService;
    }*/

    public void sendNotification(String to, String message){
        this.emailService.sendEmail(to, message);
    }
}
