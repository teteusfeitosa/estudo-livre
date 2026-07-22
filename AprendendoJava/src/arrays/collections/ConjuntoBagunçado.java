package arrays.collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBagunçado {
	public static void main(String[] args) {
		Set conjunto = new HashSet();

		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // String
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho é " + conjunto.size());
		conjunto.add(true);
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.remove("Teste"));
		System.out.println("Tamanho é " + conjunto.size());
		
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); //união entre dois conjuntos;alterou conjuntos
		//conjunto.retainAll(nums); // interseçao
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
	}
}
