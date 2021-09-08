package br.com.stefanini.relacionamento.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import br.com.stefanini.relacionamento.type.Cidade;
import br.com.stefanini.relacionamento.type.Status;
import br.com.stefanini.relacionamento.type.StatusAttributeConverter;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 50)
	private String nome;

	@ElementCollection(fetch = FetchType.LAZY)
	@CollectionTable(name = "telefone", joinColumns = @JoinColumn(name = "id_cliente"))
	private List<String> telefones = new ArrayList<String>();

	@Enumerated(EnumType.STRING)
	private Cidade cidade;

	@Convert(converter = StatusAttributeConverter.class)
	private Status status;

	public Cliente() {
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", telefones=" + telefones + ", cidade=" + cidade + "]";
	}

	public Cliente(Long id, String nome, List<String> telefones) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefones = telefones;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<String> telefones) {
		this.telefones = telefones;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
