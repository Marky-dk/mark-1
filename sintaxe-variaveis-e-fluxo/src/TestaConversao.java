
public class TestaConversao {
	
	public static void main (String[] args) {
		
		//Para força uma variável aceitar o valor de outra variável:
		// double valor = 1200.5;
		// int valor1 = valor;
		// isso vai dar errado.
		// forma correta:
		// double valor = 1200.5;
		// int valor1 = (int)valor;
		// assim força o valor ficar com o número inteiro.
		
		double salario = 1270.50;
        int valor = (int) salario;
        
        System.out.println(valor);
        
        // double nem sempre é a melhor opção.
        
        double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);

        // lembre de colocar (float) antes do valor ou f no final do valor.
        
        float valor3 = 0.2f;
        float valor4 = 0.1f;
        float total1 = valor3 + valor4;

        System.out.println(total1);
        
        
	}

}
