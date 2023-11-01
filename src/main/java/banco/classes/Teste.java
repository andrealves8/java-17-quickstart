package banco.classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Teste {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println(ld.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

	}

}
