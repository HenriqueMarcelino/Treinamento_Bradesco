package br.com.stefanini.projetoseguranca.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="books")
public class Book implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length=100)
	@Pattern(regexp = "[a-z A-Z0-9] {3,50}", message = "Nome do Livro invalido")
	private String name;

	@Min(value = 5, message="Valor inferior ao valor minimo do livro")
	@Column(length=100)
	private Double price;
	
	@NotBlank(message = "É necessario o nome do autor do livro")
	@Column(length=100)
	private String author;
	
	// Construtores

	public Book() {
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + ", author=" + author + "]";
	}

	public Book(Long id, String name, Double price, String author) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.author = author;
	}
	
	// Getters and Setters

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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
