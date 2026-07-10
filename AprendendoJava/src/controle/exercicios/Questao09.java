package controle.exercicios;

import java.util.Scanner;

//Imprima o enesimo termo de fibonnaci
public class Questao09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Coloque quantos termos você vai querer");
		int qtdTermos = sc.nextInt();
		
		int inicio = 1;
		int meio = 0;
		int resultado = 0;
		
		for(int i = 0; i < qtdTermos; i++) {
			resultado = inicio + meio;
			inicio = meio;
			meio = resultado;
			System.out.println(resultado);
		}
		
		
		
		
		
		
		
		sc.close();
	}
}
