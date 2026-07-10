package controle.exercicios;

import java.util.Scanner;

public class Questao18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int linhas = 0;
		System.out.println("Quantas linhas terá sua pirâmide?");
		linhas = sc.nextInt();
		
		for(int k = 1; k <= linhas; k++) {	
			for(int i = 1; i <= k; i++) {
				for(int j = 0; j < i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println();
		}
	
	}

}
