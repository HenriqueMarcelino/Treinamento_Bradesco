package br.com.stefanini.projetoQuatro.model;

public class Telefone {

	private Integer idTelefone;
	private String telefone;
	
	// Relacionamento One To One
	private Cliente cliente;

	public Telefone() {
	}

	public Telefone(Object object, String numero1, Object numero2) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Telefone [idTelefone=" + idTelefone + ", telefone=" + telefone + ", cliente=" + cliente + "]";
	}

	public Integer getIdTelefone() {
		return idTelefone;
	}

	public void setIdTelefone(Integer idTelefone) {
		this.idTelefone = idTelefone;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setNumero(String parameter) {
		// TODO Auto-generated method stub
		
	}

	public String getNumero() {
		// TODO Auto-generated method stub
		return null;
	}

}
