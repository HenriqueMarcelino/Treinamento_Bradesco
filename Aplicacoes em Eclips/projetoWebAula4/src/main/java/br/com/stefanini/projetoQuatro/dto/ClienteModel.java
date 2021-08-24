package br.com.stefanini.projetoQuatro.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClienteModel {

	// Regras

	// Inner classe é a classe de dentro.
	// Essa classe pode pegar tudo ou parte.
	// Tem a classe e a inner classe.
	// Classe e atributos (Final)
	// inner classe static
	// Primeira Classe é a saída.
	// Saída
	// Classe principal tem um construtor que alimenta a inner classe.
	// Primeira classe o construtor se preocupa em chamar a de baixo.
	// Primeira classe é a Saida.

	private final Integer id;
	private final String nome;
	private final String email;
	private final String senha;
	private final java.util.Date dataCriacao;

	// Por ter colocado "final" só tem o get não tem o set, por ser apenas saida.

	public Integer getId() {
		return id;
	}

	public ClienteModel(ClienteBuilder cliente) {
		super();
		this.id = cliente.id;
		this.nome = cliente.nome;
		this.email = cliente.email;
		this.senha = cliente.senha;
		this.dataCriacao = new Date();
	}
	
	@Override
	public String toString() {
		return "ClienteModel [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", dataCriacao="
				+ dataCriacao + new SimpleDateFormat("yyyy-MM-dd").format(dataCriacao)+" ]";
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

	public java.util.Date getDataCriacao() {
		return dataCriacao;
	}

	public static class ClienteBuilder {
		// Entrada

		private Integer id;
		private String nome;
		private String email;
		private String senha;
		private java.util.Date dataCriacao;

		// Uma alimentação obrigatoria que foi criada, ele precisa do email e senha.

		public ClienteBuilder(String email, String senha) {
			this.email = email;
			this.senha = senha;
			this.dataCriacao = new Date();
		}

		public ClienteBuilder setNome(String nome) {
			this.nome = nome;
			return this;
		}

		public ClienteBuilder setId(Integer id) {
			this.id = id;
			return this;
		}

		private void validacaoCliente() {
			if (this.id < 0) {
				throw new IllegalArgumentException("Id Invalido");
			} else if (this.nome.length() <= 1) {
				throw new IllegalArgumentException("Nome informado invalido");
			} else if (this.senha.length() <= 5) {
				throw new IllegalArgumentException("Senha fora do padrão, informe uma senha de no minimo 6 Caracteres");
			}
		}

		// É o unico metodo que esta olhando para a classe...
		public ClienteModel biuld() {
			ClienteModel model = new ClienteModel(this);
			validacaoCliente();
			return model;
		}

		public static void main(String[] args) {
			ClienteModel cli = new ClienteModel.ClienteBuilder("Henrique@gmail.com", "123456").setId(100)
					.setNome("Henrique").biuld();

			System.out.println("Cliente" + cli);
		}
	}

}
