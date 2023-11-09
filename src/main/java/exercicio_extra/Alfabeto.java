package exercicio_extra;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Alfabeto {

	public static void main(String[] args) {
		char primeiraLetra = 'A';
		char ultimaLetra = 'Z';
		
		List<Character> alfabeto = new ArrayList<Character>();

		while (primeiraLetra <= ultimaLetra) {
			alfabeto.add(primeiraLetra);
			primeiraLetra++;
		}
		
		String buscaPosLetra = null;
		
		do {
			buscaPosLetra = JOptionPane.showInputDialog("DIGITE UMA LETRA");
			JOptionPane.showMessageDialog(null, " Digite apenas uma letra do alfabeto ");
		} 	
		
		while(buscaPosLetra.length() != 1);
		
		//String buscaPosLetra = "c".toUpperCase();
		int pos = alfabeto.indexOf(buscaPosLetra.charAt(0)) + 1;

		//JOptionPane.showMessageDialog(null, "A letra " + buscaPosLetra + " está na posição: " + pos);
		System.out.println("A letra " + buscaPosLetra + " está na posição: " + pos);

	}
}
