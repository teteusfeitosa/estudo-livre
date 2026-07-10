package arrays;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

//Alunos e notas ao mesmo tempo
public class MatrizDesafio {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos alunos serão?");
		int qtdalunos = sc.nextInt();

		System.out.println("Quantas notas serão?");
		int qtdnotas = sc.nextInt();
		
		double alunoNota [][] = new double[qtdalunos][qtdnotas];
		
		for(int i = 0; i < qtdalunos; i++) {
			for(int j = 0; j < qtdnotas; j++) {
				System.out.printf("Coloque a nota [%d] do aluno [%d]\n",j,i+1);
				alunoNota[i][j] = sc.nextDouble();
			}	
		}

		double médiaParcial = 0;
		
		System.out.println("-------------------------------");
		
		for(int i = 0; i < qtdalunos; i++) {
			for(int j = 0; j < qtdnotas; j++) {
				médiaParcial += alunoNota[i][j];
			}
			System.out.printf("A média do aluno [%d] é %.2f\n",i+1,(double)médiaParcial/qtdnotas);
			médiaParcial = 0;
		}
		sc.close();
	}
}
