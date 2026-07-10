package controle.exercicios;

import java.util.Scanner;

/*
 *Faça um programa com um Menu em que o usuário possa escolher uma das
 *	quatro operações matemáticas para calcular. Receba dois números digitados pelo
 *	usuário e dependendo da opção que o usuário escolher, faça o cálculo. 
 * */
public class Questao01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double num1 , num2;
		char operador = '\0';
		double resultado = 0;
		
		System.out.println("Coloque o primeiro número");
		num1 = sc.nextDouble();
		
		System.out.println("Coloque  operação");
		operador = sc.next().charAt(0);
		
		System.out.println("Coloque o segundo número");
		num2 = sc.nextDouble();
		
		Boolean operacaoCerta = true;
		
		switch(operador) {
		case '+':
			resultado = num1 + num2;
			break;
		case '-':	
			resultado = num1 - num2;
			break;
		case '*':
			resultado = num1 * num2;
			break;
		case '/':	
			if(num2 == 0) {
				System.out.println("Não pode dividir por zero");
				resultado = 0;
			}
			else {
				resultado = num1 / num2;
			}
			break;
		default:
			System.out.println("Não foi colocado operador válido");
			operacaoCerta = false;
		}
		if(operacaoCerta) {
		System.out.println("O resultado da operação é: " + resultado);
		}
		sc.close();
	}
}
