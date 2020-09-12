
public class TesteComposto {
	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.titular=new Cliente();
		
		conta1.titular.nome="Lucas";
		conta1.titular.cpf="484848484-48";
		conta1.titular.profissao = "DJ";
		System.out.println(conta1.titular.nome);
		System.out.println(conta1.titular.cpf);		
		System.out.println(conta1.titular.profissao);
		System.out.println(conta1.saldo);
	}
}
