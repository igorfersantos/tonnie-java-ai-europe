package br.com.igorfernandes.springdesignpattern.service.impl;

import java.util.Optional;

import br.com.igorfernandes.springdesignpattern.model.AddressRepository;
import br.com.igorfernandes.springdesignpattern.model.Client;
import br.com.igorfernandes.springdesignpattern.model.ClientRepository;
import br.com.igorfernandes.springdesignpattern.service.ClientService;
import br.com.igorfernandes.springdesignpattern.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Implements the <b>Strategy</b> {@link ClientService}.
 * It is possible to be injected with Spring
 * via {@link Autowired} because it's marked as a {@link Service},
 * which makes it to be treated like a <b>Singleton</b>.
 * 
 * @author Igor
 */
@Service
public class ClientServiceImpl implements ClientService {

	// Singleton: Inject Spring components with @Autowired.
	@Autowired
	private ClientRepository clienteRepository;
	@Autowired
	private AddressRepository enderecoRepository;
	@Autowired
	private ViaCepService viaCepService;
	// Strategy: Implement the methods defined in the interface
	// Facade: Abstract the dependencies with subsystems, providing a simple interface.


	@Override
	public Iterable<Client> searchAll() {
		// FIXME Search all Clients.
		return null;
	}

	@Override
	public Client searchById(Long id) {
		// FIXME Search Client by ID
		return null;
	}

	@Override
	public void add(Client client) {
		// FIXME Verify if the Client's Address already exists (with CEP)
		// FIXME If it doesn't exists, search with ViaCEP and persist to the database
		// FIXME Add a Client, tying it to the Address (new or already present in the database)
	}

	@Override
	public void update(Long id, Client client) {
		// FIXME Search Client by ID, if it exists:
		// FIXME Verify if the Client's Address already exists (with CEP)
		// FIXME If it doesn't exists, search with ViaCEP and persist to the database.
		// FIXME Change the Client, tying the address (new or already present in the database)
	}

	@Override
	public void delete(Long id) {
		// FIXME Delete Client by ID
	}
}
