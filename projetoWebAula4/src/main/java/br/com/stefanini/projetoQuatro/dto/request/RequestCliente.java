package br.com.stefanini.projetoQuatro.dto.request;

import java.sql.Date;

import br.com.stefanini.projetoQuatro.model.Cliente;
import br.com.stefanini.projetoQuatro.model.Telefone;

public class RequestCliente {
  
   
	private Cliente cliente;
 
	
	public RequestCliente() {
		 this.cliente = new Cliente();
 
	}

	 public void ofCliente(String nome, String email, String senha) {
          		 cliente.setNome(nome);
          		 cliente.setEmail(email);
          		 cliente.setSenha(senha);
          		 cliente.setDataCriacao(new Date(0));
	 }
	 
	 public void ofTelefones(String numero1, String numero2) {
		   cliente.adicionar(new Telefone(null,numero1,null), 
				             new Telefone(null, numero2,null) );
	 }
	
	
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "RequestCliente [cliente=" + cliente + "]";
	}

	 
	
}
