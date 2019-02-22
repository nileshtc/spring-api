package com.nileshchakraborty.api.complex;

import org.springframework.stereotype.Component;

@Component
public class ApplEmailService implements EmailService {
    public void sendEmail(String to, String message) {
        System.out.println(to+"==="+ message);
    }
}
