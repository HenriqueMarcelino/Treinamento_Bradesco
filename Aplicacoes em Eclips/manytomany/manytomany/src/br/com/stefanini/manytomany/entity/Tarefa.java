package br.com.stefanini.manytomany.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tarefa implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private Integer idTarefa;
	private String nomeTarefa;
	private java.util.Date dataCriacao;

	private List<Funcionario> funcionarios;

	public Tarefa() {
		super();
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

	@Override
	public String toString() {
		return "Tarefa (idTarefa=" + idTarefa + ", nomeTarefa=" + nomeTarefa + ", dataAlocacao=" + dataCriacao + ")";
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public void add(Funcionario funcionario) {
		if (this.funcionarios == null) {
			this.funcionarios = new ArrayList<Funcionario>();
		}
		this.funcionarios.add(funcionario);
	}

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario(100, "rafael");
		Funcionario f2 = new Funcionario(101, "eller");

		Funcionario f3 = new Funcionario(102, "belem");
		Funcionario f4 = new Funcionario(103, "lu");

		Tarefa t1 = new Tarefa(300, "criar o programa de login", new Date("06/30/2021"));

		t1.add(f1);
		t1.add(f2);
		t1.add(f3);
		System.out.println(t1);
		System.out.println(t1.getFuncionarios());

		Tarefa t2 = new Tarefa(310, "criaras telas para o programa de login", new Date("07/01/2021"));
		t2.add(f3);
		t2.add(f4);
		System.out.println(t2);
		System.out.println(t2.getFuncionarios());

	}

}
