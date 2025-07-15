package services;

import interfaces.MessageService;

public class SocialsService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.printf("Sending message to Socials \n\"(%s)\"", message);
    }
}
