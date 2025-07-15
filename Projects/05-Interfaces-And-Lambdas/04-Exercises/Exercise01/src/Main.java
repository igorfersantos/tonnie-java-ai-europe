import interfaces.MessageService;
import services.EmailService;
import services.SMSService;
import services.SocialsService;
import services.WhatsappService;

public class Main {
    public static void main(String[] args) {
        MessageService sms = new SMSService();
        MessageService email = new EmailService();
        MessageService socials = new SocialsService();
        MessageService whatsapp = new WhatsappService();

        sms.sendMessage("Digite 5502 com o texto AMOR para receber as melhores cantadas de 2008!");
        email.sendMessage("Quer receber as melhores ofertas via e-mail?");
        socials.sendMessage("Olha só quem ta de campanha de marketing nova 💖😊😊🚀🚀🚀🔊🎵🎵🎶");
        whatsapp.sendMessage("Veja o nosso whatsapp para as melhores ofertas!");
    }

}