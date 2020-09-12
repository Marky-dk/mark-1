package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente titular, int agencia, int numero) {
		super(titular, agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		valor += 5.0;
		super.saca(valor);
	}
	
	@Override
	public void deposita(double valor) {
		super.saldo += valor;	
	}
	
	@Override
	public String toString() {
		return "Conta Poupança: " + super.toString();
	}

}
