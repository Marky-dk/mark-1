package atividades;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Data {
	public static void main(String[] args) {
		
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate futu = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(futu);
		
		Period periodo = Period.between(hoje, futu);
		System.out.println(periodo);
		
		DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(hoje.format(formatar));
	}
}
