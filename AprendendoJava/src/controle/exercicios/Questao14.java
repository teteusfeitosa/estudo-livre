package controle.exercicios;

import java.util.Scanner;

//meia piramide
public class Questao14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int linhas = 0;
		System.out.println("Quantas linhas terá sua pirâmide?");
		linhas = sc.nextInt();
		
		for(int i = 1; i <= linhas; i++) {
			for(int j = 0; j < (2 * i -1); j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
