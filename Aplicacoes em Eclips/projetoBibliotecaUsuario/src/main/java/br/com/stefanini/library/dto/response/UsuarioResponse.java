package br.com.stefanini.library.dto.response;

public class UsuarioResponse {

	private Integer idUsuario;
	private String nome;
	private String email;

	public UsuarioResponse() {
	}

	public UsuarioResponse(Integer idUsuario, String nome, String email) {
		super();
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.email = email;
	}

	@Override
	public String toString() {
		return "UsuarioResponse [idUsuario=" + idUsuario + ", nome=" + nome + ", email=" + email + "]";
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
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

}
