package controle;

import java.util.Scanner;

public class DesafioRepeticao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int qtd = 0;
		double nota = 0;
		double total = 0;
		do {
			System.out.println("Coloque uma nota");
			nota = sc.nextDouble();
			
			if(nota >= 0 && nota <= 10) {
				total += nota;
				qtd++;
			}
			
			
			
		}while(nota != -1);
		
		System.out.println("A média da turma é: " + total/qtd);
		
		sc.close();
	}
}
