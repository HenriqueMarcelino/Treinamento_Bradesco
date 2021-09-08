package br.com.stefanini.projetorelquatro.entity;

import java.util.HashSet;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "author", uniqueConstraints = { @UniqueConstraint(columnNames = { "email" }) })
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 80)
	private String name;

	@Column(length = 80)
	private String email;

	@OneToMany(mappedBy = "author", cascade = { CascadeType.ALL })
	@JsonManagedReference(value = "post")
	private Set<Post> posts = new HashSet<>();

	public Author() {
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", email=" + email + ", posts=" + posts + "]";
	}

	public Author(Long id, String name, String email, Set<Post> posts) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.posts = posts;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Post> getPosts() {
		return posts;
	}

	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}

}
