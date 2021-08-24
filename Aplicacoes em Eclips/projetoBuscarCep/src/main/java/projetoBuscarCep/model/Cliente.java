package projetoBuscarCep.model;

public class Cliente {

	private Integer idCliente;
	private String nome;
	private String email;
	private Endereco endereco;

	public Cliente() {
	}

	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", nome=" + nome + ", email=" + email + ", endereco=" + endereco
				+ "]";
	}

	public Cliente(Integer idCliente, String nome, String email, Endereco endereco) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void adicionar(Endereco... e) {
		if (endereco == null) {
			endereco = new Endereco();
		}
	}

}
