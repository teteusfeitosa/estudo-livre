package fundamentos;

import java.util.Scanner;


public class Console {
	public static void main(String[] args) {
		int idade  = 0;
		
		
		System.out.print("bom");
		System.out.println(" \ndia\n");
		System.out.printf("Megasena: = %d %d %d %d %d\n",1,2,3,4,5);// \n = %n
		
		Scanner scanner = new Scanner(System.in); // system.in aponta para o teclado;
		
		System.out.print("Coloque seu nome:");
		String name = scanner.nextLine();
		
		System.out.println("Coloque sua idade:");
		idade = scanner.nextInt();
		System.out.print("A idade é: " + idade);
		scanner.nextLine();
		
		System.out.println(" Olá"
				+ "," + name);
		
		scanner.close();
	}
}
