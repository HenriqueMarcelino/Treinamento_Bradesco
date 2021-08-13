package br.com.stefanini.projetoCorrentista.model;

public class Usuario {

	private Integer IdUsuario;
	private String nome;
	private String email;

	private Transacao transacao;

	public Usuario() {
	}

	public Usuario(Integer idUsuario, String nome, String email) {
		super();
		IdUsuario = idUsuario;
		this.nome = nome;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

	public Integer getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		IdUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Transacao getTransacao() {
		return transacao;
	}

	public void setTransacao(Transacao transacao) {
		this.transacao = transacao;
	}

	private void ValidacaoUsuario() {
		if (this.IdUsuario <= 0) {
			throw new IllegalArgumentException("Id Invalido");

		} else if (this.nome.length() <= 1) {
			throw new IllegalArgumentException("Informe um nome Valido");
		}

	}
}
