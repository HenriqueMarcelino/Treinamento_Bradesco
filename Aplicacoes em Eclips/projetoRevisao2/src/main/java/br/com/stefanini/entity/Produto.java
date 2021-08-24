package br.com.stefanini.entity;

public class Produto {

	private Long id;
	private String nome;
	private Double preço;

	public Produto() {

	}

	public Produto(Long id, String nome, Double preço) {
		super();
		this.id = id;
		this.nome = nome;
		this.preço = preço;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", preço=" + preço + "]";
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

	public Double getPreço() {
		return preço;
	}

	public void setPreço(Double preço) {
		this.preço = preço;
	}

}
