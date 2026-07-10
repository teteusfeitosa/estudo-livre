package classe.exercicios;

import java.util.Scanner;

public class ConversorTeste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Coloque 1 para converter celsius em farenheit e 2 para o oposto");
		int op = sc.nextInt();
		
		if(op == 1) {
			System.out.println("Coloque o número de graus celsius");
			Double celsius = sc.nextDouble();
			System.out.println(Conversor.celsius_Farenheit(celsius));
		}
		else if(op == 2) {
			System.out.println("Coloque o número de graus farenheit");
			Double farenheit = sc.nextDouble();
			System.out.println(Conversor.farenheit_Celsius(farenheit));
		}
		else {
			System.out.println("opcão inválida");
		}
		
		
		sc.close();
	}
}
