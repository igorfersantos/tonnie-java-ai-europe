package subsystem02;

public class CepAPI {
    private static CepAPI instance = new CepAPI();

    private CepAPI() {
    }

    public static CepAPI getInstance() {
        return instance;
    }

    public String searchCity(String cep) {
        return "São Paulo";
    }

    public String searchState(String cep) {
        return "São Paulo";
    }
}
