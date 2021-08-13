package br.com.stefanini.projetoQuatro.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Cliente {

	private Integer id;
	private String nome;
	private String email;
	private String senha;
	// Relacionamento one to many
	private List<Telefone> telefones;

	private java.util.Date dataCriacao;

	{
		this.dataCriacao = new Date();
	}

	public Cliente() {

	}

	public Cliente(Integer id, String nome, String email, String senha) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", telefones="
				+ telefones + ", dataCriacao=" + dataCriacao + "]";
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

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefones = telefone;
	}

	public void adicionar(Telefone ...t) {
		if (telefones == null) {
			telefones = new ArrayList<Telefone>();
		}
		this.telefones.addAll(Arrays.asList(t));
	}

	public Cliente getCliente() {

		return null;
	}

}
