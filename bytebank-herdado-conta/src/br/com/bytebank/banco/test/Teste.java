package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class Teste {

	public static void main(String[] args) {
		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Cliente titular = new Cliente("","","");
        Conta cc = new ContaCorrente(titular,22, 11); 
        guardador.adiciona(cc);
        
        Cliente titular1 = new Cliente("","","");
        Conta cc2 = new ContaCorrente(titular1, 22, 22);
        guardador.adiciona(cc2);
        
        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);
        
        Conta ref = (Conta) guardador.getReferencia(0);
        System.out.println(ref.getNumero());

	}

}
