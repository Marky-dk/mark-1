
public class TesteMetodos {
	public static void main(String[] args) {
		Conta conta = new Conta(new Cliente("Lucas", "123.456.789-12", "Padeiro"), 1234, 123456);
		System.out.println();
		
		conta.deposita(100000);
		conta.saca(1000);
		System.out.println();
		
		Conta conta2 = new Conta(new Cliente("Bruna", "321.654.987-21", "Não tem"), 1235, 132546);
		System.out.println();
		
		conta2.deposita(100);
		System.out.println();
		
		conta.transfere(1000, conta2);
		
		System.out.println(conta.getSaldo());
		System.out.println(conta2.getSaldo());
		System.out.println(Conta.getTotalContas());
		
		
	}
}
