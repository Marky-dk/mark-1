package atividades;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TesteForeach {

	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");
		
		Consumer<String> consumidor = new Imprime();
		
		ComparadorPorTamanho comparador = new ComparadorPorTamanho();

		palavras.sort(comparador);
		
		palavras.forEach(consumidor);

	}

}

class ComparadorPorTamanho implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length())
            return -1;
        if (s1.length() > s2.length())
            return 1;
        return 0;
    }
}

class Imprime<T> implements Consumer<T>{

	@Override
	public void accept(T p) {
		System.out.println(p);
		
	}
	
}
