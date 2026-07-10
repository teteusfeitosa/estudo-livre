package controle.exercicios;

import java.util.Scanner;

/*
 * Dado um número X digitado pelo usuário, calcule o fatorial de x (x!). Exemplo: 5! é igual
a 5 . 4 . 3 . 2 . 1 que é igual a 120, assim como 4! é igual a 4 . 3 . 2 . 1 que é igual a 24, como 3! é igual
a 3 . 2 . 1 que é igual a 6 e que 2! é igual a 2 . 1 que é igual a 2
 * */
public class Questao08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double fatorial;
		
		System.out.println("Coloque um número de fatorial que vocẽ quer");
		fatorial = sc.nextDouble();
		
		double i = 1;
		double resultado = fatorial;
		
		while(i < fatorial) {
			 resultado = resultado * i;
			 i++;
		}
		
		System.out.println(resultado);
	}
}
