package projetoBuscarCep.dto;

public class ClienteModel {

	private final Integer idCliente;
	private final String nome;
	private final String email;

	public Integer getIdCliente() {
		return idCliente;
	}

	public ClienteModel(ClienteBuilder cliente) {
		super();
		this.idCliente = cliente.idCliente;
		this.nome = cliente.nome;
		this.email = cliente.email;
	}

	@Override
	public String toString() {
		return "ClienteModel [idCliente=" + idCliente + ", nome=" + nome + ", email=" + email + "]";
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public static class ClienteBuilder {
		// Entrada de dados

		private Integer idCliente;
		private String nome;
		private String email;

		public ClienteBuilder(String nome, String email) {
			this.nome = nome;
			this.email = email;
		}

		public ClienteBuilder setNome(String nome) {
			this.nome = nome;
			return this;
		}

		public ClienteBuilder setEmail(String email) {
			this.email = email;
			return this;
		}

		public ClienteBuilder setIdCliente(Integer IdCliente) {
			this.idCliente = IdCliente;
			return this;
		}

		private void validacaoCliente() {
			if (this.nome.length() <= 1) {
				throw new IllegalArgumentException("Nome informado invalido");
			} else if (this.email.length() <= 1) {
				throw new IllegalArgumentException("Email informado invalido");
			}
		}

		public ClienteModel biuld() {
			ClienteModel model = new ClienteModel(this);
			validacaoCliente();
			return model;
		}

		public static void main(String[] args) {
			ClienteModel cli = new ClienteModel.ClienteBuilder("Henrique","Henrique@gmail.com").setIdCliente(100)
					.setNome("Henrique").biuld();

			System.out.println("Cliente" + cli);
		}

	}

}
