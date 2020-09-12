package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		
		Cliente titularCorrente = new Cliente ("","","");
		Cliente titularpoupanca = new Cliente ("","","");
		
        Object cc = new ContaCorrente(titularCorrente, 22, 33);
        Object cp = new ContaPoupanca(titularpoupanca,33, 22);

        System.out.println(cc);
        System.out.println(cp);
    }
}
