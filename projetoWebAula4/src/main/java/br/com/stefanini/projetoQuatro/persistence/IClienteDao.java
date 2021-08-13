package br.com.stefanini.projetoQuatro.persistence;

import br.com.stefanini.projetoQuatro.dto.request.RequestCliente;
import br.com.stefanini.projetoQuatro.model.Cliente;

public interface IClienteDao {
	
	public Cliente findByCode(int code) throws Exception;
	public Integer createClienteTelefone(RequestCliente c) throws Exception;

}
