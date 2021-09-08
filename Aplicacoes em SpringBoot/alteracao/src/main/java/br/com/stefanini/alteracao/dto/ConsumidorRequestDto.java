package br.com.stefanini.alteracao.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import br.com.stefanini.alteracao.entity.Consumidor;

public class ConsumidorRequestDto {

	@NotBlank(message = "Não e possivel nome em branco")
	@Pattern(regexp = "[a-z A-Z]{2,50}", message = "Nome invalido fora Padrao")
	private String nome;

	@NotBlank(message = "Não e possivel email em branco")
	private String email;

	public ConsumidorRequestDto() {
	}

	@Override
	public String toString() {
		return "ConsumidorRequestDto [nome=" + nome + ", email=" + email + "]";
	}

	public ConsumidorRequestDto(
			@NotBlank(message = "Não e possivel nome em branco") @Pattern(regexp = "[a-z A-Z]{2,50}", message = "Nome invalido fora Padrao") String nome,
			@NotBlank(message = "Não e possivel email em branco") String email) {
		super();
		this.nome = nome;
		this.email = email;
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
	
	public Consumidor transferConsumido() {
		Consumidor c = new Consumidor();
		c.setNome(this.getNome());
		c.setEmail(this.getEmail());
		c.setStatus("ativo");
		return c;
	}

}
