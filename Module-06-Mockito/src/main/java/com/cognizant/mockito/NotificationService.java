package com.cognizant.mockito;

public class NotificationService {
    private EmailSender emailSender;

    public NotificationService(EmailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void notifyUser(String email, String message) {
        emailSender.send(email, message);
    }
}
