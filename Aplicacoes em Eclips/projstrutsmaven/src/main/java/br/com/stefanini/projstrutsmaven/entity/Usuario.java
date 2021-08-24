package br.com.stefanini.projstrutsmaven.entity;

public class Usuario {

	private Integer idUsuario;
	private String email;
	private String senha;
	private String perfil;

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(Integer idUsuario, String email, String senha, String perfil) {
		super();
		this.idUsuario = idUsuario;
		this.email = email;
		this.senha = senha;
		this.perfil = perfil;
	}

	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", email=" + email 
				+ ", senha=" + senha + ", perfil=" + perfil + "]";
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
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
