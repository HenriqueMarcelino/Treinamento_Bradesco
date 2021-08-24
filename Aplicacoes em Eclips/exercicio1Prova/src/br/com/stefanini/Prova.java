package br.com.stefanini;

public class Prova {

	// Atributos
	private Integer idProva;
	private String materia;
	private String semestre;
	private String gabarito;
	private Questao questao;

	// Construtores
	public Prova() {

	}

	@Override
	public String toString() {
		return "Prova [idProva=" + idProva + ", materia=" + materia + ", semestre=" + semestre + ", gabarito="
				+ gabarito + ", questao=" + questao + "]";
	}

	public Prova(Integer idProva, String materia, String semestre, String gabarito, Questao questao) {
		super();
		this.idProva = idProva;
		this.materia = materia;
		this.semestre = semestre;
		this.gabarito = gabarito;
		this.questao = questao;
	}

	public Integer getIdProva() {
		return idProva;
	}

	public void setIdProva(Integer idProva) {
		this.idProva = idProva;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public String getGabarito() {
		return gabarito;
	}

	public void setGabarito(String gabarito) {
		this.gabarito = gabarito;
	}

	public Questao getQuestao() {
		return questao;
	}

	public void setQuestao(Questao questao) {
		this.questao = questao;
	}

}
