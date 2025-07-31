import domain.Client;
import subsystem01.CrmService;
import subsystem02.CepAPI;

public class Facade {

    /**
     * Migrate a {@link Client Client} using this Façade to retrieve the necessary information from multiple
     * "Subsystems" or
     * external resources using only Name and CEP
     *
     * @see Client Client
     */
    public void migrateClient(String name, String cep) {
        Client client = new Client(name, cep);
        String city = CepAPI.getInstance().searchCity(name);
        String state = CepAPI.getInstance().searchState(cep);
        client.setCity(city);
        client.setState(state);
        CrmService.saveClient(client);
    }
}
