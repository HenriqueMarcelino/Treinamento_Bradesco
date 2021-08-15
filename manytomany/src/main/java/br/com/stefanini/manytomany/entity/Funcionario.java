package br.com.stefanini.manytomany.entity;

import java.util.List;

public class Funcionario implements java.io.Serializable {
	
//mappeBy Funcionario 
	private static final long serialVersionUID = 1L;
	private Integer idFuncionario;
	private String nomeFuncionario;
	private List<Tarefa> tarefa;

	public Funcionario() {
	}

	public Funcionario(Integer idFuncionario, String nomeFuncionario) {
		super();
		this.idFuncionario = idFuncionario;
		this.nomeFuncionario = nomeFuncionario;
	}

	public Funcionario(Integer idFuncionario, String nomeFuncionario, List<Tarefa> tarefa) {
		super();
		this.idFuncionario = idFuncionario;
		this.nomeFuncionario = nomeFuncionario;
		this.tarefa = tarefa;
	}

	public Funcionario(Integer idFuncionario) {
		super();
		this.idFuncionario = idFuncionario;
	}
	
	

	@Override
	public String toString() {
		return "Funcionario (idFuncionario=" + idFuncionario + ", "
				+ "nomeFuncionario=" + nomeFuncionario + ")";
	}

	public Integer getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public List<Tarefa> getTarefa() {
		return tarefa;
	}

	public void setTarefa(List<Tarefa> tarefa) {
		this.tarefa = tarefa;
	}

}
