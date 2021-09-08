package br.com.stefanini.projetojdbc.entity;

import org.springframework.data.relational.core.mapping.Table;


public class Users implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private Integer age;

	public Users() {
	}

	public Users(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
