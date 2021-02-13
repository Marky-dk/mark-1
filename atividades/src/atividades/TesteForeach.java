package atividades;

import java.util.ArrayList;
import java.util.List;

public class TesteForeach {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do código");
		palavras.add("caelum");

		// antes
//		palavras.sort(new Comparator<String>() {
//
//			@Override
//			public int compare(String s1, String s2) {
//				if (s1.length() < s2.length())
//					return -1;
//				if (s1.length() > s2.length())
//					return 1;
//				return 0;
//			}
//		});

		// depois
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		// antes
//		palavras.forEach(new Consumer<String>(){
//		    public void accept(String palavra) {
//		        System.out.println(palavra);
//		    }
//		});

		// depois
		palavras.forEach(s -> System.out.println(s));

	}

}
