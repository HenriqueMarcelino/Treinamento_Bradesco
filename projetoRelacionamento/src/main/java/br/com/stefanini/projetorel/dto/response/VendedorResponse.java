package br.com.stefanini.projetorel.dto.response;

public class VendedorResponse {

	private Integer IdVendedor;
	private String nome;
	private String email;
	private String senha;
	private String perfil;

	public VendedorResponse() {
	}

	@Override
	public String toString() {
		return "VendedorResponse [IdVendedor=" + IdVendedor + ", nome=" + nome + ", email=" + email + ", senha=" + senha
				+ ", perfil=" + perfil + "]";
	}

	public VendedorResponse(Integer idVendedor, String nome, String email, String senha, String perfil) {
		super();
		IdVendedor = idVendedor;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.perfil = perfil;
	}

	public Integer getIdVendedor() {
		return IdVendedor;
	}

	public void setIdVendedor(Integer idVendedor) {
		IdVendedor = idVendedor;
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

}
