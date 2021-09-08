package br.com.stefanini.alteracao.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "consumidores")
public class Consumidor implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String email;
	private String Status;
	
	public Consumidor() {
	}

	@Override
	public String toString() {
		return "Consumidor [nome=" + nome + ", email=" + email + ", Status=" + Status + "]";
	}

	public Consumidor(Integer id, String nome, String email, String status) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		Status = status;
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

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

}
