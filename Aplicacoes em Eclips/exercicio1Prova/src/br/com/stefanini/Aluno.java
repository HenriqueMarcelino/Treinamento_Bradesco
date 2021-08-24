package br.com.stefanini;

public class Aluno {

	// Atributos
	private Integer idAluno;
	private String nome;
	private String turma;
	private Prova prova;

	// Contrutores
	public Aluno() {

	}

	public Aluno(Integer idAluno, String nome, String turma, Prova prova) {
		super();
		this.idAluno = idAluno;
		this.nome = nome;
		this.turma = turma;
		this.prova = prova;
	}

	@Override
	public String toString() {
		return "Aluno [idAluno=" + idAluno + ", nome=" + nome + ", turma=" + turma + ", prova=" + prova + "]";
	}

	public Integer getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Integer idAluno) {
		this.idAluno = idAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public Prova getProva() {
		return prova;
	}

	public void setProva(Prova prova) {
		this.prova = prova;
	}

}
