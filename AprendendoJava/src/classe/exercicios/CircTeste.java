package classe.exercicios;

import java.util.Scanner;

public class CircTeste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circ a = new Circ();
		a.raio = 3.0;
		
		Circ b = new Circ();
		System.out.println("Coloque o valor do raio de b");
		b.raio = sc.nextDouble();
		
		System.out.println(a.calcularArea() + "m²");
		System.out.println(a.calcularCircunferencia() + "m");
		
		System.out.println(b.calcularArea() + "m²");
		System.out.println(b.calcularCircunferencia() + "m");
		
		
		
		sc.close();
		
	}
}
