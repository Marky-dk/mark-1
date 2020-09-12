package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TesteContas {
	
	public static void main(String[] args) throws SaldoInsuficienteException {
		
		ContaCorrente cc = new ContaCorrente(new Cliente("Ban", "789.456.123-45", "Ladrão"), 123, 12345);
		ContaPoupanca cp = new ContaPoupanca(new Cliente("King", "456.789.123-45", "Rei das Fadas"), 456, 45678);
		
		cc.deposita(20000);
		cp.deposita(50000);
		
		cc.transfere(800, cp);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
		
	}

}
