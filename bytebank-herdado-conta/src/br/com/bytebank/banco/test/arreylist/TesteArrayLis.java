package br.com.bytebank.banco.test.arreylist;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayLis {

	public static void main(String[] args) {
		ArrayList<Conta> lista = new ArrayList<Conta>();
		
		Cliente t = new Cliente("","","");
		Conta cc = new ContaCorrente(t, 22, 11);
        lista.add(cc);

        Cliente t1 = new Cliente("","","");
        Conta cc2 = new ContaCorrente(t1, 22, 22);
        lista.add(cc2);

        System.out.println("Tamanho: " + lista.size());

        Conta ref = (Conta) lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);
        System.out.println("Tamanho: " + lista.size());

        Cliente t2 = new Cliente("","","");
        Conta cc3 = new ContaCorrente(t2, 33, 311);
        lista.add(cc3);
        
        Cliente t3 = new Cliente("","","");
        Conta cc4 = new ContaCorrente(t3, 33, 322);
        lista.add(cc4);

        for(int i = 0; i < lista.size(); i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("----------");

        for(Conta oRef : lista) {
            System.out.println(oRef);
        }

	}

}
