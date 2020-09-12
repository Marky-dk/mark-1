package atividades;

public class Fatorial {
	public static void main(String[] args) {
		for (int n = 1; n <= 10; n++) {
			System.out.print(n + "! = ");
			int fatorial = 1;
			for (int nn = n; nn >= 1; --nn) {
				fatorial *= nn;
			}
			System.out.println(fatorial);
		}
	}

}
/*
 Outra forma.
int fatorial = 1;
for (int i = 1; i < 11; i++) {
    fatorial *= i;
    System.out.println("Fatorial de " + i + " = " +fatorial);
}
*/