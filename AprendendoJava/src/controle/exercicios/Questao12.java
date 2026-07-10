package controle.exercicios;

import java.util.Scanner;

/*
 * Escrever um programa que produza a saída abaixo na tela, para N linhas e usando um
caractere lido do teclado (no exemplo, *). Após mostrar uma vez, o programa repete o processo, só parando quando
N for zero
 * */
public class Questao12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int linhas;
		System.out.println("Quantas linhas ?");
		linhas = sc.nextInt();
		
		for(int i = 1; i <= linhas; i++ ) {
			for(int j = 0; j < 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
