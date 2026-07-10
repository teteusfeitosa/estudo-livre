package controle.exercicios;

import java.util.Scanner;

// Valide se um ano é bissexto ou não;
public class Questao04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ano;
		
		System.out.println("Coloque um ano");
		ano = sc.nextInt();
		
		if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
			System.out.println("O ano " + ano + " é bissexto.");
		}
		else {
			System.out.printf("O ano %d não é bissexto\n" ,ano);
		}		
	sc.close();
	}
}
