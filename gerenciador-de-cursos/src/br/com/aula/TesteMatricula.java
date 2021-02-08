package br.com.aula;

import java.util.Set;

public class TesteMatricula {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20));
		javaColecoes.adiciona(new Aula("Trabalhando com O.O Java", 22));
		javaColecoes.adiciona(new Aula("Trabalhando com O.O C#", 21));

		Aluno a1 = new Aluno("Rodrigo Turini", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);

		Set<Aluno> alunos = javaColecoes.getAlunos();
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);

		javaColecoes.getAlunos().forEach(aluno -> {
			System.out.println(aluno);
		});
		
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
        System.out.println(a1.equals(turini));
	}

}
