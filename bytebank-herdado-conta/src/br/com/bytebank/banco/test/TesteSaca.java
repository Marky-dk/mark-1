package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.*;

public class TesteSaca {
	public static void main(String[] args) {
        Conta conta = new ContaCorrente(new Cliente("Ban", "789.456.123-45", "Ladrão"), 123, 12345);

        conta.deposita(200.0);

        try {
            conta.saca(210.0);
        } catch(SaldoInsuficienteException ex) {
            System.out.println("Exception: " + ex.getMessage());
            ex.printStackTrace();
        }

        System.out.println(conta.getSaldo());
    }
}
