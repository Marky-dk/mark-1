package br.com.bytebank.banco.modelo;

/**
 * Essa classe é usada para ser uma classe pai para as outras classe de conta, como a classe ContaCorrente.
 * 
 * @author Marky Santana.
 * @version 1.0
 */

public abstract class Conta implements Comparable<Conta> {

	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int totalContas = 0;

	/**
	 * Esse método construtor é usado para que o objeto seja iniciado com os dados necessarios.
	 * 
	 * @param titular
	 * @param agencia
	 * @param numero
	 */
	public Conta(Cliente titular, int agencia, int numero) {
		Conta.totalContas++;
		this.titular = titular;
		this.agencia = agencia;
		this.numero = numero;

		System.out.println("Nome: " + titular.getNome());
		System.out.println("CPF: " + titular.getCpf());
		System.out.println("Profissão: " + titular.getProfissao());
		System.out.println("Agencia: " + agencia);
		System.out.println("Número da conta: " + numero);
		System.out.println();
		System.out.println("Total de contas criadas: " + Conta.totalContas);
		System.out.println();
	}

	public abstract void deposita(double valor);
	
	/**
	 * O método saca é para tirar o valor do saque do saldo e para lançar uma exceção caso a conta não tenha o valor do saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	public void saca(double valor) throws SaldoInsuficienteException {

		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}

		this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException{
	    this.saca(valor);
	    destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public int getNumero() {
		return numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotalContas() {
		return Conta.totalContas;
	}
	
	@Override
	public String toString() {
		return "Número: " + this.numero + " Agencia: " + this.agencia + " Nome: " + this.titular.getNome();
	}
	
	@Override
	public boolean equals(Object ref){
		
		Conta outra = (Conta) ref;

	    if(this.agencia != outra.agencia){
	        return false;
	    }

	    if(this.numero != outra.numero){
	        return false;
	    }

	    return true;
	}
	
	public int compareTo(Conta outra) {
        return Double.compare(this.saldo, outra.saldo);
}
}
