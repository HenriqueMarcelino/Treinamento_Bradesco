package br.com.stefanini.manytomany.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.stefanini.manytomany.entity.Funcionario;

public class ManageBeanFuncionario {

	public static List<Funcionario> Lst = new ArrayList<>();

	static {
		Lst.add(new Funcionario(10, "Carlos"));
		Lst.add(new Funcionario(11, "Thiago"));
		Lst.add(new Funcionario(12, "Rafael"));
	}

	public static void adicionar(Funcionario f) {
		Lst.add(f);

	}

}
