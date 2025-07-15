import dao.ClientDAO;
import dao.GenericDAO;
import dao.UserDAO;
import domain.ClientDomain;
import domain.UserDomain;

public class Main {
    private static GenericDAO<Integer, UserDomain> userDAO = new UserDAO();
    private static GenericDAO<String, ClientDomain> clientDAO = new ClientDAO();
    public static void main(String[] args) {
        System.out.println("=====UserDAO=====");
        var user = new UserDomain(1,"João", 18);
        System.out.println(userDAO.count());
        System.out.println(userDAO.save(user));
        System.out.println(userDAO.save(new UserDomain(2, "Aba", 90), new UserDomain(3, "Ava", 30)));
        System.out.println(userDAO.findAll());
        System.out.println(userDAO.find(d -> d.getId().equals(user.getId())));
        System.out.println(userDAO.find(d -> d.getId().equals(2)));
        System.out.println(userDAO.count());
        userDAO.delete(user);
        System.out.println(userDAO.findAll());
        System.out.println(userDAO.count());
        System.out.println("=====UserDAO=====");
        System.out.println("=====ClientDAO=====");
        var client = new ClientDomain("A","João", 18);
        System.out.println(clientDAO.count());
        System.out.println(clientDAO.save(client));
        System.out.println(clientDAO.save(new ClientDomain("B", "Ava",5), new ClientDomain("C", "Aba", 14)));
        System.out.println(clientDAO.findAll());
        System.out.println(clientDAO.find(d -> d.getId().equals(client.getId())));
        System.out.println(clientDAO.find(d -> d.getId().equals(2)));
        System.out.println(clientDAO.count());
        clientDAO.delete(client);
        System.out.println(clientDAO.findAll());
        System.out.println(clientDAO.count());
        System.out.println("=====ClientDAO=====");

    }
}