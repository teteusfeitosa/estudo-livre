package fundamentos.exercicios;
/*
 * Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
 * */
import java.util.Scanner;
public class Questao03 {
	public static void main(String[] args) {
		double area = 0;
		double base;
		double altura;
		Scanner sc = new Scanner(System.in);
		System.out.println("Coloque o valor da base e altura de um triângulo: ");
		base = sc.nextDouble();
		altura = sc.nextDouble();
		
		area = base * altura/2;
		
		System.out.println("A área é de: " + area + "m²");
		
		sc.close();
		
	}
}
