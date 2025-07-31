package subsystem01;

import domain.Client;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void saveClient(Client client) {
        if (client.getState() == null || client.getCity() == null) {
            System.out.println("The client can't be saved without State or City");
            return;
        }
        System.out.printf("Client %s saved in the CRM system.\n", client);
    }
}
