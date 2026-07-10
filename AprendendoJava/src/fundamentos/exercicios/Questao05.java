package fundamentos.exercicios;

import java.util.Scanner;

/*
 * Inverta números de 3 casas decimais inteiros;
 * */
public class Questao05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Coloque um número de 3 casas decimais");
		int num = sc.nextInt();
		
		int invertido = num/100 + ((num % 100)/10) * 10  + num % 10 * 100;
		
		System.out.println(invertido);
		
		sc.close();
	}
}
