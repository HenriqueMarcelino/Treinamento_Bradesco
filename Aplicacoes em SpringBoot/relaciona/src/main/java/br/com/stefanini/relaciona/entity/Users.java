package br.com.stefanini.relaciona.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "users")
public class Users implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idusers")
	@JsonProperty("idusers")
	private Integer idUsers;

	@Column(name = "nome")
	@JsonProperty("nome")
	private String nome;

	@Column(name = "email")
	@JsonProperty("email")
	private String email;

	@Column(name = "password")
	@JsonProperty("password")
	private String password;

	@OneToMany(mappedBy = "users", cascade = { CascadeType.ALL })
	@JsonManagedReference(value = "telefones")
	private List<Telefone> telefone = new ArrayList<Telefone>();

	// CONSTRUTORES

	public Users() {
	}

	@Override
	public String toString() {
		return "Users [idUsers=" + idUsers + ", nome=" + nome + ", email=" + email + "]";
	}

	public Users(Integer idUsers, String nome, String email, String password, List<Telefone> telefone) {
		super();
		this.idUsers = idUsers;
		this.nome = nome;
		this.email = email;
		this.password = password;
		this.telefone = telefone;
	}

	// GETTERS AND SETTERS

	public Integer getIdUsers() {
		return idUsers;
	}

	public void setIdUsers(Integer idUsers) {
		this.idUsers = idUsers;
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

	public List<Telefone> getTelefone() {
		return telefone;
	}

	public void setTelefone(List<Telefone> telefone) {
		this.telefone = telefone;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
