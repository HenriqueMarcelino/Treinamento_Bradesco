package br.com.stefanini.entity;

public class Produto {

	private Long id;
	private String nome;
	private Double pre�o;

	public Produto() {

	}

	public Produto(Long id, String nome, Double pre�o) {
		super();
		this.id = id;
		this.nome = nome;
		this.pre�o = pre�o;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", pre�o=" + pre�o + "]";
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

	public Double getPre�o() {
		return pre�o;
	}

	public void setPre�o(Double pre�o) {
		this.pre�o = pre�o;
	}

}
