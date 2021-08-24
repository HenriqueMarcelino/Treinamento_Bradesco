package br.com.stefanini.projetoRelacionamento.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "user", uniqueConstraints = { @UniqueConstraint(columnNames = { "email" }) })
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUser;

	@Column(length = 50)
	@JsonProperty(value = "username")
	private String userName;

	@Column(length = 50)
	private String email;

	@OneToOne(mappedBy = "user", cascade = { CascadeType.ALL })
	private Address address;

	public User() {
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", userName=" + userName + ", email=" + email + ", address=" + address + "]";
	}

	public User(Long idUser, String userName, String email, Address address) {
		super();
		this.idUser = idUser;
		this.userName = userName;
		this.email = email;
		this.address = address;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
