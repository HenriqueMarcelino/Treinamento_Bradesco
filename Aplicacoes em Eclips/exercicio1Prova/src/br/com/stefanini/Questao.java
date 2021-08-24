package br.com.stefanini;

public class Questao {

	// Atributos
	private String descricaoQuestao;
	private String numeroQuestao;
	private String resposta;

	// Construtores
	public Questao() {
	}

	@Override
	public String toString() {
		return "Questao [descricaoQuestao=" + descricaoQuestao + ", numeroQuestao=" + numeroQuestao + ", resposta="
				+ resposta + "]";
	}

	public Questao(String descricaoQuestao, String numeroQuestao, String resposta) {
		super();
		this.descricaoQuestao = descricaoQuestao;
		this.numeroQuestao = numeroQuestao;
		this.resposta = resposta;
	}

	public String getDescricaoQuestao() {
		return descricaoQuestao;
	}

	public void setDescricaoQuestao(String descricaoQuestao) {
		this.descricaoQuestao = descricaoQuestao;
	}

	public String getNumeroQuestao() {
		return numeroQuestao;
	}

	public void setNumeroQuestao(String numeroQuestao) {
		this.numeroQuestao = numeroQuestao;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

}
