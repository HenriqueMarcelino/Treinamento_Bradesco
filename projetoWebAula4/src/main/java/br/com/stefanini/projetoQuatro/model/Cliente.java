package br.com.stefanini.projetoQuatro.model;

import java.util.Date;

public class Cliente {

	private Integer id;
	private String nome;
	private String email;
	private String senha;
	private java.util.Date dataCriacao;

	public Cliente() {

	}

	public Cliente(Integer id, String nome, String email, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		{
			this.dataCriacao = new Date();
		}
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", dataCriacao="
				+ dataCriacao + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public java.util.Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(java.util.Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

}
