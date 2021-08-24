package br.com.stefanini.projetorel.dto.response;

public class ClienteResponse {

	private Integer idCliente;
	private String nome;
	private String email;
	private String senha;
	private String perfil;
	private String status;

	public ClienteResponse() {
		super();
	}

	public ClienteResponse(Integer idCliente, String nome, String email, String senha, String perfil, String status) {
		super();
		this.idCliente = idCliente;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.perfil = perfil;
		this.status = status;
	}

	@Override
	public String toString() {
		return "ClienteDto [idCliente=" + idCliente + ", nome=" + nome + ", email=" + email + ", senha=" + senha
				+ ", perfil=" + perfil + ", status=" + status + "]";
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
