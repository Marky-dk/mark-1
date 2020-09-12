package br.com.alura.bytebank;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteBiblioteca {
	
	public static void main(String[] args) {
		ContaCorrente c = new ContaCorrente(new Cliente("","",""), 123, 1234);
		
		c.deposita(200);
		
		System.out.println(c.getSaldo());
	}
	

}
