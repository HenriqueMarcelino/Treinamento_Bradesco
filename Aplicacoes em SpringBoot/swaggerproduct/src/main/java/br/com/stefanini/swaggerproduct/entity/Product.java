package br.com.stefanini.swaggerproduct.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;

import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "products", uniqueConstraints = { @UniqueConstraint(columnNames = { "name" }) })
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id", length = 50)
	@JsonProperty(value = "id")
	@ApiModelProperty(name = "id", notes = "Id Produtc", value = "100")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	@Column(length = 50, nullable = true)
	@ApiModelProperty(name = "name", notes = "name Produtc", value = "abcproduct", required = true)
	private String name;

	@ApiModelProperty(name = "price", notes = "price Produtc", value = "10.89", required = true)
	private Double price;

	@ApiModelProperty(name = "stock", notes = "name stock", value = "estoque001", required = true)
	private String stock;

	@ApiModelProperty(name = "quality", notes = "quality Produtc", value = "3", required = true)
	private Integer quality;

	public Product() {
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", stock=" + stock + ", quality=" + quality
				+ "]";
	}

	public Product(Long id, String name, Double price, String stock, Integer quality) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.quality = quality;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public Integer getQuality() {
		return quality;
	}

	public void setQuality(Integer quality) {
		this.quality = quality;
	}

}
