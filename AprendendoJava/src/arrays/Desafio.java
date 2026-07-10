package arrays;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double total = 0;
		
		System.out.println("Quantas notas você quer?");
		int qtd = sc.nextInt();
		
		double notas [] = new double[qtd];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Coloque uma nota do índice [" + i + "]");
			notas[i] = sc.nextDouble();		
		}
		for(double nota: notas) {
			total += nota;
		}
		
		System.out.println("A média é " +  total/qtd);
		
		sc.close();
		
	}
}
