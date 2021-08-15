package br.com.stefanini.manytomany.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tarefa implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer idTarefa;
	private String nomeTarefa;
	private java.util.Date dataCriacao;

	private List<Funcionario> funcionario;

	public Tarefa() {
	}

	public Tarefa(Integer idTarefa, String nomeTarefa, Date dataCriacao) {
		super();
		this.idTarefa = idTarefa;
		this.nomeTarefa = nomeTarefa;
		this.dataCriacao = dataCriacao;
	}


	public Integer getIdTarefa() {
		return idTarefa;
	}

	public void setIdTarefa(Integer idTarefa) {
		this.idTarefa = idTarefa;
	}

	public String getNomeTarefa() {
		return nomeTarefa;
	}

	public void setNomeTarefa(String nomeTarefa) {
		this.nomeTarefa = nomeTarefa;
	}

	public java.util.Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(java.util.Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public void setFuncionario(List<Funcionario> funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public String toString() {
		return "Tarefa (idTarefa=" + idTarefa + ", nomeTarefa=" + nomeTarefa + ", dataAlocacao=" + dataCriacao + ")";
	}

	public List<Funcionario> getFuncionario() {
		return funcionario;
	}

	public void add(Funcionario funcionario) {
		if (this.funcionario == null) {
			this.funcionario = new ArrayList<Funcionario>();
		}
		this.funcionario.add(funcionario);
	}

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario(100, "rafael");
		Funcionario f2 = new Funcionario(101, "jose");
		
		Funcionario f3 = new Funcionario(102, "jose");
		Funcionario f4 = new Funcionario(103, "Maria");

		Tarefa t1 = new Tarefa(300, "Criar o programa de login", new Date("08/13/2021"));

		t1.add(f1);
		t1.add(f2);
		t1.add(f3);

		System.out.println(t1);
		System.out.println(t1.getFuncionario());

		Tarefa t2 = new Tarefa(301, "Criar as telas para o programa login", new Date("08/14/2021"));

		t2.add(f3);
		t2.add(f4);
		
		System.out.println(t2);
		System.out.println(t2.getFuncionario());

	}

}
