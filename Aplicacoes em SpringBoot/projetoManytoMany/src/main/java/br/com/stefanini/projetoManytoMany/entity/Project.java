package br.com.stefanini.projetoManytoMany.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProject;

	@Column(length = 50)
	private String nameProject;

	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name = "projectusers",joinColumns = @JoinColumn(name="idProject"),
			   inverseJoinColumns = @JoinColumn(name="id"))
	private Set<Users> users = new HashSet<Users>();

								// CONSTRUTORES

	public Project() {
	}

	@Override
	public String toString() {
		return "Project [idProject=" + idProject + ", nameProject=" + nameProject + ", users=" + users + "]";
	}

	public Project(Long idProject, String nameProject, Set<Users> users) {
		super();
		this.idProject = idProject;
		this.nameProject = nameProject;
		this.users = users;
	}

								// GETTERS AND SETTERS

	public Project(int i, String string) {
		// TODO Auto-generated constructor stub
	}

	public Long getIdProject() {
		return idProject;
	}

	public void setIdProject(Long idProject) {
		this.idProject = idProject;
	}

	public String getNameProject() {
		return nameProject;
	}

	public void setNameProject(String nameProject) {
		this.nameProject = nameProject;
	}

	public Set<Users> getUsers() {
		return users;
	}

	public void setUsers(Set<Users> users) {
		this.users = users;
	}
	
	public void add (Users user) {
		if (users == null) {
			users = new HashSet<Users>();
		}
		users.add(user);
	}

}
