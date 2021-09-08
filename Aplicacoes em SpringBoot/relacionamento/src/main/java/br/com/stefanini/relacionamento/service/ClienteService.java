package br.com.stefanini.relacionamento.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.stefanini.relacionamento.entity.Cliente;
import br.com.stefanini.relacionamento.interfaces.IClienteService;
import br.com.stefanini.relacionamento.repository.ClienteRepository;

@Service
public class ClienteService implements IClienteService {

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Transactional(rollbackOn = Exception.class)
	@Override
	public Cliente gravar(Cliente cliente) throws Exception {
		
		List<String> telefones = cliente.getTelefones();
		
		for(int i=0; i<telefones.size();i++) {
			telefones.set(i, "11 " + telefones.get(i));
		}
		cliente.setTelefones(telefones);
		
		Cliente cli = clienteRepository.save(cliente);
		return cli;
	}

}
