package projetoBuscarCep.persistence;

import projetoBuscarCep.model.Cliente;

public interface IClienteDao {

	public Cliente findByNome(String nome) throws Exception;
	//public Integer createCliente(RequestCliente c) throws Exception;

}
