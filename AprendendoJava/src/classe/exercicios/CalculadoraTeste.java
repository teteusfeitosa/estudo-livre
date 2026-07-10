package classe.exercicios;

import java.util.Scanner;

public class CalculadoraTeste {
	public static void main(String[] args) {
		double resultado;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Colque o primeiro número");
		double num1 = sc.nextDouble();
		
		System.out.println("Colque o segundo número");
		double num2 = sc.nextDouble();
		
		System.out.println("somar aperte 1,subtrair aperte 2,multiplicar 3 e dividir 4");
		int opcao = sc.nextInt();
	
		
		switch(opcao) {
		case 1:
			resultado = Calculadora.somar(num1,num2);
			break;
			
		case 2:
			resultado = Calculadora.subtrair(num1,num2);
			break;
			
		case 3:
			resultado = Calculadora.multiplicar(num1,num2);
			break;
			
		case 4:
			resultado = Calculadora.dividir(num1,num2);
			break;
			
		default:
			resultado = 0D;
		}
		
		System.out.println("Resultado da sua operação foi " + resultado);
		
		sc.close();
	}

	
}
