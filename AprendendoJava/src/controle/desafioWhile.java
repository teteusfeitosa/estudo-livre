package controle;

import java.util.Scanner;

public class desafioWhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Você quer participar do programa?");
		String resposta = sc.next();
		
		while(resposta.equalsIgnoreCase("Sim")) {
			System.out.println("Quer continuar no programa?");
			resposta = sc.next();
		}
		
		System.out.println("Você saiu do programa");
		
		
		sc.close();
	}
}
