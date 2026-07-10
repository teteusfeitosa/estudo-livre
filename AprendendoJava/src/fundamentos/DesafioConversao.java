package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Coloque o primeiro salário");
		String salario1 = sc.nextLine();
		
		System.out.println("Coloque o segundo salário");
		String salario2 = sc.nextLine();
		
		System.out.println("Coloque o terceiro salário");
		String salario3 = sc.nextLine();
		
		double a = Double.parseDouble(salario1);
		double b = Double.parseDouble(salario2);
		double c = Double.parseDouble(salario3);
		
		double soma = a + b + c;
		
		System.out.println(soma + "\n");
		System.out.println(soma/3
				);
		
		
		
		
		sc.close();
		
}
}
