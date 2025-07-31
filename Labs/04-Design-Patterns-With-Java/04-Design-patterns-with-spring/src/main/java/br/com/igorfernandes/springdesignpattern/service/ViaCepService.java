package br.com.igorfernandes.springdesignpattern.service;

import br.com.igorfernandes.springdesignpattern.model.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


/**
 * HTTP Client created with <b>OpenFeign</b> to consume the <b>ViaCEP</b> API.
 * 
 * @see <a href="https://spring.io/projects/spring-cloud-openfeign">Spring Cloud OpenFeign</a>
 * @see <a href="https://viacep.com.br">ViaCEP</a>
 * 
 * @author Igor
 */
@FeignClient(name = "viacep", url = "https://viacep.com.br/ws")
public interface ViaCepService {

	@GetMapping("/{cep}/json/")
	Address consultarCep(@PathVariable("cep") String cep);
}
