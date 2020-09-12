
public class Conta {

	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int totalContas = 0; 

	public Conta(Cliente titular, int agencia, int numero) {
		Conta.totalContas ++;
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
	}

	public void deposita(double valor) {
		this.saldo += valor;
		System.out.println("Você depositou: " + valor);
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("Você sacou: " + valor);
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (saca(valor)) {
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
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
}
