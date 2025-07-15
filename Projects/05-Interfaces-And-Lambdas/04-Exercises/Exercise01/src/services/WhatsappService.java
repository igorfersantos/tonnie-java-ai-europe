package services;

import interfaces.MessageService;

public class WhatsappService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.printf("Sending Whatsapp message \n\"(%s)\"", message);
    }
}
