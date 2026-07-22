package controle.exercicios;

import java.util.Scanner;

//Apresentar os resultados de uma tabuada para um número qualquer a ser fornecido pelo usuário.
public class Questao07 {
	public static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Coloque um número para fazer tabuada");
		num = sc.nextInt();

		String s = String.format("");

		
		for(int i = 1; i <= 10; i++) {
			System.out.printf("%d X %d = %d\n", i, num,i * num);		
		}
		
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.printf("%d X %d = %d\n" ,i, j, i * j );
			}
			System.out.println();
		}
		
		
		
		
		sc.close();

	}	
}
