package br.com.stefanini.relaciona.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "telefone")
public class Telefone implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idtelefone")
	@JsonProperty("idtelefone")
	private Integer idtelefone;

	@Column(name="numero")
	@JsonProperty("numero")
	private String numero;

	@JsonBackReference("telefones")
	@ManyToOne()
	@JoinColumn(name = "idusers", referencedColumnName = "idusers")
	@Fetch(FetchMode.JOIN)
	private Users users;

	// CONSTRUTORES
	
	public Telefone() {
	}

	public Telefone(Integer idtelefone, String numero, Users users) {
		super();
		this.idtelefone = idtelefone;
		this.numero = numero;
		this.users = users;
	}

	@Override
	public String toString() {
		return "Telefone [id=" + idtelefone + ", numero=" + numero + ", users=" + users + "]";
	}
	
		// GETTERS AND SETTERS

	public Integer getIdtelefone() {
		return idtelefone;
	}

	public void setIdtelefone(Integer idtelefone) {
		this.idtelefone = idtelefone;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
