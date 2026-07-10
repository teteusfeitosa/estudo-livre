package controle.exercicios;

import java.util.Scanner;

/*
 * Faça um programa que leia números positivos até o usuário digitar um negativo.
Ao final mostre:

maior número
menor número
 * */
public class Questao10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int maior = 0;
		int menor = 0;
		
		
		
		while(num >= 0) {
			System.out.println("Coloque um número");
			num = sc.nextInt();
			
			
			if(num > maior) {
				maior = num;
			}
			if(num < menor) {
				menor = num;
			}
			
		}
		
		System.out.println("O maior número é: " + maior + " O menor número é: " + menor );
		
		
		
		sc.close();
	}
}
