package br.com.stefanini;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		// Estanciando os Objetos.
		Prova prova = new Prova();

		prova.setMateria("Programacao");
		prova.setSemestre("Primeiro Semestre");
		prova.setGabarito("Questao 1 Resp (B); Questao 2 Resp (A)");

		Questao questao1 = new Questao();
		questao1.setDescricaoQuestao(
				"O que um desenvolvedor faz? (A) Manutecao de computador (B) Desenvolve sistemas (C) Desenvolve qualquer tipo de manutencao em computador");
		questao1.setNumeroQuestao("1");

		Questao questao2 = new Questao();
		questao2.setDescricaoQuestao(
				" O que é POO? (A) Programacao orientada a objetos (B) Programacao Orientada a qualquer coisa (C) Nenhuma das alternativas");
		questao2.setNumeroQuestao("2");

		Aluno aluno = new Aluno();
		aluno.setProva(prova);

		Scanner ler = new Scanner(System.in);

		// Imprimindo na tela
		System.out.println();
		System.out.println("-------------PROVA-------------");

		System.out.println();
		System.out.print("Materia: ");
		System.out.println(prova.getMateria());

		System.out.println();
		System.out.print("Semestre: ");
		System.out.println(prova.getSemestre());
		System.out.println();
		
		System.out.println("Informe seu nome para iniciar a prova");
		aluno.setNome(ler.next());
		System.out.println("Informe a turma");
		aluno.setTurma(ler.next());
		
		System.out.println();
		System.out.println("-----------QUESTÕES-----------");
		System.out.println();
		System.out.print(questao1.getNumeroQuestao());
		System.out.print("- ");
		System.out.println(questao1.getDescricaoQuestao());
		System.out.println();

		System.out.print(questao2.getNumeroQuestao());
		System.out.print("- ");
		System.out.println(questao2.getDescricaoQuestao());
		System.out.println();

		System.out.println("-----------Assinale as Alternativas corretas-----------");
		System.out.println();

		System.out.println("Informe a sua resposta da pergunta N°1");
		questao1.setResposta(ler.next());

		System.out.println("Informe a sua resposta da pergunta N°2");
		questao2.setResposta(ler.next());

		System.out.println("-----------RESPOSTAS ESCOLHIDAS-----------");
		System.out.print("Resposta da 1° questão: ");
		System.out.println(questao1.getResposta());
		System.out.println();

		System.out.print("Resposta da 2° questão: ");
		System.out.println(questao2.getResposta());
		
		System.out.println();
		System.out.print("Aluno: ");
		System.out.println(aluno.getNome());
		System.out.print("Turma: ");
		System.out.println(aluno.getTurma());

		System.out.println();
		System.out.println("*********************************************");
		System.out.println("                  GABARITO                   ");
		System.out.println();
		System.out.println(prova.getGabarito());
		System.out.println("*********************************************");

	}

}
