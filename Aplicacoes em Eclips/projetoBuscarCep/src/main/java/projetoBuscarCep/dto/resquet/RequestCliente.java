package projetoBuscarCep.dto.resquet;

import projetoBuscarCep.model.Cliente;
import projetoBuscarCep.model.Endereco;

public class RequestCliente {
	
	private Cliente cliente;
	
	public RequestCliente() {
		 this.cliente = new Cliente();

	}
	 public void ofCliente(String nome, String email) {
  		 cliente.setNome(nome);
  		 cliente.setEmail(email);
	 }
	 
	 public void ofEndereco(String cep, String logradouro, Integer numero, 
			 String complemento, String bairro, String cidade, String estado) {
		 cliente.adicionar(new Endereco(cep,logradouro, numero, 
				 complemento, bairro, cidade, estado, new Cliente()));
	 }
	public Cliente getCliente() {
		
		return this.cliente;
	}
	 
}
