package br.com.stefanini.projetoum.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCustomer;

	@Column(length = 80)
	@JsonProperty(value = "name")
	private String nameCustomer;

	@Column(length = 80)
	@JsonProperty(value = "name")
	private String email;

	public Customer() {
	}

	@Override
	public String toString() {
		return "Customer [idCustomer=" + idCustomer + ", nameCustomer=" + nameCustomer + ", email=" + email + "]";
	}

	public Customer(Long idCustomer, String nameCustomer, String email) {
		super();
		this.idCustomer = idCustomer;
		this.nameCustomer = nameCustomer;
		this.email = email;
	}

	public Long getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(Long idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getNameCustomer() {
		return nameCustomer;
	}

	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
