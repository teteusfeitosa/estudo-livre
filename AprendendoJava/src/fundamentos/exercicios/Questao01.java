package fundamentos.exercicios;
/*
 *Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC. 
 * */
import java.util.Scanner;
public class Questao01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double peso;
		double altura;
		
		System.out.println("Coloque sua altura e peso: ");
		altura = sc.nextDouble();
		peso = sc.nextDouble();

		double imc = peso/Math.pow(altura,2);
		
		System.out.printf("Seu imc é: %.2fkg/m²\n",imc );
		sc.close();
	}
}
