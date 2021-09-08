package br.com.stefanini.projetoredireciona.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "vendedor")
public class Vendedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 50)
	private String nome;

	@Column
	private Double comissao;

	@Column(length = 50)
	private String email;

	@Column(length = 50)
	private String senha;

	public Vendedor() {
	}

	public Vendedor(Long id, String nome, Double comissao, String email, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.comissao = comissao;
		this.email = email;
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Vendedor [id=" + id + ", nome=" + nome + ", comissao=" + comissao + ", email=" + email + "]";
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

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
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

}
