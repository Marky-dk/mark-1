package br.com.bytebank.banco.test.arreylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {
		Cliente titular1 = new Cliente("Nico", "", "");
		Conta cc1 = new ContaCorrente(titular1, 22, 33);
		cc1.deposita(333.0);

		Cliente titular2 = new Cliente("Guilherme", "", "");
		Conta cc2 = new ContaPoupanca(titular2, 22, 44);
		cc2.deposita(444.0);

		Cliente titular3 = new Cliente("Paulo", "", "");
		Conta cc3 = new ContaCorrente(titular3, 22, 11);
		cc3.deposita(111.0);

		Cliente titular4 = new Cliente("Ana", "", "");
		Conta cc4 = new ContaPoupanca(titular4, 22, 22);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		
		
		lista.sort((Conta c1, Conta c2) -> Integer.compare(c1.getNumero(), c2.getNumero()));//fim do método
		
		Comparator<Conta> comp = (Conta c1, Conta c2) -> {
		        String nomeC1 = c1.getTitular().getNome();
		        String nomeC2 = c2.getTitular().getNome();
		        return nomeC1.compareTo(nomeC2);
		};
		//for (Conta conta : lista) {
		//    System.out.println(conta);
		//}
		lista.forEach((conta) -> System.out.println(conta));
	}

}

