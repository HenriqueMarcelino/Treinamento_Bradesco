package br.com.stefanini.projetostruts.entity;

import java.io.Serializable;

@XmlRootElement
public class Pessoa implements Serializable{
	
	//Tudo que sair pode ser xml ou pode ser JSON (Rest)

	private Integer idPessoa;
	private String  nome;
	private Integer idade;

	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(Integer idPessoa, String nome, Integer idade) {
		super();
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Pessoa [idPessoa=" + idPessoa + ", nome=" + nome + 
				", idade=" + idade + "]";
	}

	public Integer getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

}
