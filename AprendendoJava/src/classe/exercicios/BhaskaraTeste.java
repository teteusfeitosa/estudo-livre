package classe.exercicios;

import java.util.Scanner;

public class BhaskaraTeste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Coloque os parâmetros da equacção do segundo grau");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		
		
		if (Bhaskara.delta(a, b, c) >= 0) {
	            
			System.out.println("Raiz 1: " + Bhaskara.raiz1(a,b,c));
	            
			System.out.println("Raiz 2: " + Bhaskara.raiz2(a,b,c));
	        } else {
	          
	        System.out.println("A equação não possui raízes reais.");
	        }
	}
}
