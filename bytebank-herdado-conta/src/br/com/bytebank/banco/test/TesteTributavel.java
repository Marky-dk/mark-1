package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TesteTributavel {
	
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(new Cliente("", "", ""), 222, 333);
		
		cc.deposita(100.0);
		
		SeguroDeVida sd = new SeguroDeVida();
		
		CalculadorDeImposto ci = new CalculadorDeImposto();
		ci.registra(cc);
		ci.registra(sd);
		System.out.println(ci.getTotalImposto());
		
	}

}
