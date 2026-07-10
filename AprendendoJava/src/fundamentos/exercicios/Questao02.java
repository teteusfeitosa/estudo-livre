package fundamentos.exercicios;
/*
 *Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor 
 * */
import java.util.Scanner;

public class Questao02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor;
		int valor2;
		int valor3;
		System.out.println("Coloque o valor no input");
		valor = sc.nextInt();
		
		valor2 = valor;
		
		valor2 = (int)Math.pow(valor,2);
		System.out.println(valor2);
		
		valor3 = valor;
		
		valor3 = (int)Math.pow(valor,3);
		System.out.println(valor3);
		
		sc.close();
		
	}
}
