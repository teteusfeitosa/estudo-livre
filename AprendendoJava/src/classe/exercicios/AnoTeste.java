package classe.exercicios;

import java.util.Scanner;

public class AnoTeste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Coloque um ano");
		int ano = sc.nextInt();
		
		if(Ano.bissexto(ano)) {	
			System.out.println("Bissexto.");
		}
		else {
			System.out.println("Não é bissexto.");
		}
		
		sc.close();
	}
}
