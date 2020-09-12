package bytebank;

public class TestaMetodos {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		Conta conta2 = new Conta();

		conta1.deposita(10000);
		System.out.println(conta1.saldo);
		conta1.saca(200);
		System.out.println(conta1.saldo);
		conta1.transfere(300, conta2);
		System.out.println(conta1.saldo);
		System.out.println(conta2.saldo);
	}

}
