package br.com.aula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20));
		javaColecoes.adiciona(new Aula("Trabalhando com O.O Java", 22));
		javaColecoes.adiciona(new Aula("Trabalhando com O.O C#", 21));

		System.out.println(javaColecoes.getAulas());

		List<Aula> aulasImutaveis = javaColecoes.getAulas();

		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulas);
		System.out.println(aulas);

		System.out.println(javaColecoes.getTempoTotal());

		System.out.println(javaColecoes);

	}

}
