package controle.exercicios;

import java.util.Scanner;

//Receba um valor inteiro em segundos e converta para o
//formato HH:MM:SS.
public class Questao03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor;
		int minutos = 0, segundos = 0, horas = 0;
		
		System.out.println("Coloque um valor que estará em segundos");
		valor = sc.nextInt();
		
		if(valor > 24 * 3600) {
			return;
		}
		
		segundos = valor % 60;
		horas = valor / 3600;
		valor = valor % 3600;
		minutos = valor / 60;
		
		System.out.printf("O horário será %02d:%02d:%02d",horas,minutos,segundos);
		
		sc.close();
	}
}
