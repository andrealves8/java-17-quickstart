package exercicio;

import java.util.HashMap;
import java.util.Map;

public class Alfabeto2 {

	public static void main(String[] args) {
		Map<Character, Integer> map = new HashMap<>();
		
		char l1 = 'A';
		char l2 = 'Z';
		
		
		while (l1 <= l2) {
			map.put(l1, String.valueOf(l1).charAt(0) + 1);
			l1++;
		}
		
		System.out.println(map);

	}

}
