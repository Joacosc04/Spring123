package com.example;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    NotificationService notification = new NotificationService();
}
