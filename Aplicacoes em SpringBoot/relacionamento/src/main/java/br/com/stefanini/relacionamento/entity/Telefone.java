package br.com.stefanini.relacionamento.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Telefone implements Serializable{
	
	private static final long SerialVersionUID = 1L;

	private String numero;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
