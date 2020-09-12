
public class TesteGerente {
	
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		gerente.setNome("Ban");
		gerente.setCpf("634.785.468.75");
		gerente.setSalario(5000.00);
		gerente.setSenha(153);
		
		System.out.println(gerente.getNome());
        System.out.println(gerente.getCpf());
        System.out.println(gerente.getSalario());
        
        boolean autentica = gerente.autentica(153);
        
        System.out.println(autentica);
        System.out.println(gerente.getBonificacao());
        
        
	}
}
