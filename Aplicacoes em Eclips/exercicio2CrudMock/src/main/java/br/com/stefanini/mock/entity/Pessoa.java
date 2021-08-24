package br.com.stefanini.mock.entity;

public class Pessoa {

	// Declarando os atributos

	private Integer id;
	private String nome;
	private String Telefone;

	// Criando os Construtores

	public Pessoa() {

	}

	public Pessoa(String nome, String telefone) {
		super();
		this.nome = nome;
		Telefone = telefone;
	}

	public Pessoa(Integer id, String nome, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		Telefone = telefone;
	}

	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", Telefone=" + Telefone + "]";
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

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

}
