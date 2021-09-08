package br.com.stefanini.projetoManytoMany.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "users", uniqueConstraints = { @UniqueConstraint(columnNames = { "email" }) })
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 50)
	private String nomeUsers;

	@Column(length = 50)
	private String email;

	@Column(length = 250)
	private String password;

	@ManyToMany(mappedBy = "users", cascade = { CascadeType.ALL })
	private Set<Project> projects = new HashSet<Project>();

									// CONSTRUTORES

	public Users() {
	}

	public Users(Long id, String nomeUsers, String email, String password) {
		super();
		this.id = id;
		this.nomeUsers = nomeUsers;
		this.email = email;
		this.password = password;
		
	}

	public Users(int i, String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", nomeUsers=" + nomeUsers + ", email=" + email + ", password=" + password
				+ ", projects=" + projects + "]";
	}

									// GETTERS AND SETTERS

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeUsers() {
		return nomeUsers;
	}

	public void setNomeUsers(String nomeUsers) {
		this.nomeUsers = nomeUsers;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Project> getProjects() {
		return projects;
	}

	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

	public void add(Project project) {
		if (project == null) {
			projects = new HashSet<Project>();
		}
		projects.add(project);
	}
}
