package classe.exercicios;

import java.util.Scanner;

public class NumeroTeste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Coloque um número");
		int num = sc.nextInt();
		
		if(Numero.par(num)) {
			System.out.println("Número par");
		}
		else {
			System.out.println("número ímpar");
		}
		if(Numero.positivo(num)) {
			System.out.println("Número positivo");
		}
		else {
			System.out.println("nulo ou negativo");
		}
		
		if(Numero.primo(num)) {
			System.out.println("primo");
		}
				
				
		
		
		
		sc.close();
	}
}
