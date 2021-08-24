package br.com.stefanini.manytomany.entity;

public class TarefaFuncionario {
 
	 private  Tarefa tarefa;
	 private  Funcionario funcionario;
	 
	 public TarefaFuncionario() {
  	}

	 
	 
	public TarefaFuncionario(Tarefa tarefa, Funcionario funcionario) {
		super();
		this.tarefa = tarefa;
		this.funcionario = funcionario;
	}



	@Override
	public String toString() {
		return "TarefaFuncionario [tarefa=" + tarefa + ", funcionario=" + funcionario + "]";
	}



	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	 
	 
}
