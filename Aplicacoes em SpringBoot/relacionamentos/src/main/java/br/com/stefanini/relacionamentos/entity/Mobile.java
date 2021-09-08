package br.com.stefanini.relacionamentos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Mobile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@JsonProperty("namemobile")
	private String nameMobile;
	private Double price;
	private String CustomerId;

	public Mobile() {
	}

	public Mobile(String nameMobile, Double price, String customerId) {
		super();
		this.nameMobile = nameMobile;
		this.price = price;
		CustomerId = customerId;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", nameMobile=" + nameMobile + ", price=" + price + ", CustomerId=" + CustomerId
				+ "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNameMobile() {
		return nameMobile;
	}

	public void setNameMobile(String nameMobile) {
		this.nameMobile = nameMobile;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(String customerId) {
		CustomerId = customerId;
	}

}
