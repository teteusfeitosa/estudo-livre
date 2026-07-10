package controle.exercicios;

import java.util.Scanner;

/*
 * Faça um programa que receba 3 números e coloque-os em ordem crescente.
 * */
public class Questao02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3;
		int permuta;
		
		System.out.println("Coloque os 3 números");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if(n1 > n2) {
			permuta = n1;
			n1 = n2;
			n2 = permuta;
		}
		if(n1 > n3) {
			permuta = n1;
			n1 = n3;
			n3 = permuta;
		}
		if(n2 > n3) {
			permuta = n2;
			n2 = n3;
			n3 = permuta;
		}
		
		System.out.println("A numeração crescente será: " + n1 + " " + n2 + " " + n3);
		
		
		
	}
}
