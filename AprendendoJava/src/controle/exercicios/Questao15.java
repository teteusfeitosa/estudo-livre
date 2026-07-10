package controle.exercicios;

import java.util.Scanner;

// matriz e coluna piramide
public class Questao15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int linhas = 0;
		int colunas = 0;
		
		System.out.println("Quantas linhas vai ser?");
		linhas = sc.nextInt();
		
		System.out.println("Quantas colunas vai ser?");
		colunas = sc.nextInt();
		
		for(int i = 0; i < linhas; i++) {
			for(int j = 0; j < colunas; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();

	}

	}

