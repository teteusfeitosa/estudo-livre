package fundamentos.exercicios;

import java.util.Scanner;

/*
 * Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
 * */

public class Questao04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Coloque os parêmetros a,b e c da equação do segundo grau");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		double delta = Math.pow( b , 2) - 4*a*c;
		
		System.out.println(delta);
		
		sc.close();
	}
}
