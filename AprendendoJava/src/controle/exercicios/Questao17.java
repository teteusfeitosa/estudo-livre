package controle.exercicios;

import java.util.Scanner;

//pirâmide de numero
public class Questao17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int linhas;
		System.out.println("Quantas linhas de pirâmide");
		linhas = sc.nextInt();
		
		for(int i = 0; i <= linhas; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.printf("%02d ",i);
			}
			System.out.println();
		}
	}
}
