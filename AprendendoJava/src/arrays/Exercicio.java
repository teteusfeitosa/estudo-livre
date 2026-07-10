package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		double notas [] = new double[4];  // double [] notas = new double[3]
		double nota [] = { 2, 3, 4, 5};
		System.out.println(nota[nota.length - 1]);//último valor do array
		notas[0] = 2;
		notas[1] = 2;
		notas[2] = 2; 
		notas[3] = 3;
		System.out.println(Arrays.toString(notas));
		int total = 0;
		for(int i = 0; i < notas.length; i++) {
			total += notas[i];
		}
		System.out.println((double)total/notas.length);
	}
	
	
}
