package br.com.bytebank.banco.modelo.especial;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.Cliente;

public class ContaEspecial extends Conta {
	
	public ContaEspecial(Cliente titular, int agencia, int numero) {
		super(titular,agencia,numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;

	}

}
