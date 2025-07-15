package services;

import interfaces.MessageService;

public class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.printf("Sending SMS message \n\"(%s)\"", message);
    }
}
