package br.com.aula;

import java.util.*;

public class ImprimindoAlunosSemAcentos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");    
        alunos.add("Nico");    

        System.out.println(alunos);
        
        //não é possível add o mesmo elemento em um Set.
        alunos.add("Paulo");
        
        System.out.println(alunos.size());
        
        boolean adicionou = alunos.add("Pedro");
        System.out.println("Pedro foi adicionado ao Set? " + adicionou);
        
        
       //tente imprimir os alunos usando foreach
        for(String aluno : alunos) {
        	System.out.println(aluno);
        }
    }
}
