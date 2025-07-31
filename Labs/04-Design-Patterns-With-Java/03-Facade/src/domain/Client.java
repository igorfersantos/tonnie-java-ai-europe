package domain;

import java.util.Objects;

/**
 * Class that represents a Client with name, cep, state and city.
 */
public class Client {
    private String name;
    /**
     * Brazillian 8 character long identifier for a region of Brazil.
     * @see <a href="https://en.wikipedia.org/wiki/C%C3%B3digo_de_Endere%C3%A7amento_Postal#:~:text=C%C3%B3digo%20de%20Endere%C3%A7amento%20Postal%20(Postal,followed%20by%20the%20suffix%20%2D000.">More about it</a>
     */
    private String cep;
    private String state;
    private String city;

    public Client(String name, String cep, String state, String city) {
        this.name = name;
        this.cep = cep;
        this.state = state;
        this.city = city;
    }

    public Client(String name, String cep) {
        this.name = name;
        this.cep = cep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Client client)) return false;
        return Objects.equals(name, client.name) && Objects.equals(cep, client.cep) &&
                Objects.equals(state, client.state) && Objects.equals(city, client.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cep, state, city);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", cep='" + cep + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
