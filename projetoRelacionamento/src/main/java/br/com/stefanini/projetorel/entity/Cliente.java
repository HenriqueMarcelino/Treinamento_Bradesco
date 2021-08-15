package br.com.stefanini.projetorel.entity;

import java.io.Serializable;
import java.sql.Date;

public class Cliente extends Usuario implements Serializable {

	private final long SerialVersionUID = 1L;
	private String perfil;
	private String status;

	public Cliente() {
	}

	public Cliente(long id, String nome, String email, String senha, String perfil, String status) {
		super(id, nome, email, senha);
		this.perfil = perfil;
		this.status = status;
	}

	@Override
	public String toString() {
		return "Cliente [perfil=" + perfil + ", status=" + status + ", getPerfil()=" + getPerfil() + ", getStatus()="
				+ getStatus() + ", getId()=" + getId() + ", getNome()=" + getNome() + ", getEmail()=" + getEmail()
				+ ", getSenha()=" + getSenha() + "]";
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
