package atividades;

public class AtividadeDeMutiplicar {
	public static void main(String[] args) {
	
		System.out.println("Múltiplos de 3:");
		for(int multiplo=1; multiplo<=100; ++multiplo) {
			if(multiplo % 3 == 0) {
				System.out.print(multiplo + " ");
			}		
		}
		
	}
}
/*
 Outra forma:
 for (int i = 3; i < 100; i += 3 ){
            System.out.println(i);
        }
*/
