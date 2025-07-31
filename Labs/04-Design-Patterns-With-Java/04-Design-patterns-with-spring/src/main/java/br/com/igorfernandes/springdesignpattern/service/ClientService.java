package br.com.igorfernandes.springdesignpattern.service;


import br.com.igorfernandes.springdesignpattern.model.Client;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente. Com
 * isso, se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 *
 * This interface defines the <b>Strategy Pattern</b> on the client's domain.
 * We can have multiple implementations of this interface.
 * 
 * @author Igor
 */
public interface ClientService {

	Iterable<Client> searchAll();

	Client searchById(Long id);

	void add(Client client);

	void update(Long id, Client client);

	void delete(Long id);

}
