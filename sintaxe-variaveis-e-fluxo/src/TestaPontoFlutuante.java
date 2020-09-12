
public class TestaPontoFlutuante {

	public static void main(String[] args) {
		
		double salario = 1250.70;
		
		System.out.println("Isso é seu salario " + salario);
		
		// Se a divisão quebrada tiver com variável tipo inteiro, mostra resultato errado.
		
		int divisao = 5/2;
		
		System.out.println("valor errado: " + divisao);
		
		// declarar sempre variável correta(sempre indique número com ".", se não o resutado fica errado:
		
		double divisao2 = 5.0/2;
		
		System.out.println("valor correto: " + divisao2);
	}
	
}
