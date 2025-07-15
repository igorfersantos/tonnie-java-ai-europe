package services;

import interfaces.MessageService;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.printf("Sending Email message \n\"(%s)\"", message);
    }
}
