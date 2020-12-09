package br.com.aula;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
        List<Aula> aulas = javaColecoes.getAulas();
        System.out.println(aulas);

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Trabalhando com Java", 21));
        javaColecoes.adiciona(new Aula("Trabalhando com O.O", 21));
        
        System.out.println(aulas);

        
	}

}
