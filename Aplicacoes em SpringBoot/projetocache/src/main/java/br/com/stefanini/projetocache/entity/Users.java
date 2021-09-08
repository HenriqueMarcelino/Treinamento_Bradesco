package br.com.stefanini.projetocache.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class Users implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;

	@Column(length = 50)
	private String nome;

	@Column(length = 50)
	private String email;

	public Users() {
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}

	public Users(Long id, String nome, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
