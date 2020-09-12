package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(Cliente titular, int agencia, int numero) {
		super(titular, agencia, numero);
	}
	

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}


	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return super.saldo * 0.01;
	}
	
	@Override
	public String toString() {
		return "Conta Corrente: " + super.toString();
	}
}
