package br.com.stefanini.projetorel.entity;

import java.io.Serializable;

public class Vendendor extends Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	private String perfil;
	private Double comissao;

	public Vendendor() {
	}

	public Vendendor(String perfil, Double comissao) {
		super();
		this.perfil = perfil;
		this.comissao = comissao;
	}

	@Override
	public String toString() {
		return "Vendendor [perfil=" + perfil + ", comissao=" + comissao + ", getId()=" + getId() + ", getNome()="
				+ getNome() + ", getEmail()=" + getEmail() + ", getSenha()=" + getSenha() + "]";
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

}
