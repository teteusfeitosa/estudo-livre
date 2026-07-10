package controle.exercicios;

import java.util.Scanner;

/*
 * Fazer um programa que leia a
quantidade de linhas e colunas de
uma matriz e a desenhe com o
caractere que o usuário escolher. A
quantidade de linhas deve ser igual a
de colunas.
 * */
public class Questao11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int linhas = 0;
		int colunas = 0;
		
		System.out.println("Quantas linhas vai ser?");
		linhas = sc.nextInt();
		
		System.out.println("Quantas colunas vai ser?");
		colunas = sc.nextInt();
		
		
		if(linhas == colunas) {
			System.out.println("Qual caractere você vai querer");
			char caractere = sc.next().charAt(0);
			
			for(int i = 0; i < linhas; i++) {
				for(int j = 0; j < colunas; j++) {
					System.out.print(caractere);
				}
				System.out.println();
			}

		}
		else {
			System.out.println("inválido");
		}
		
		sc.close();
		
		
	}
}
