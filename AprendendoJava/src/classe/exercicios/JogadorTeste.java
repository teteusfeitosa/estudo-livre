package classe.exercicios;

import java.util.Scanner;

public class JogadorTeste {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Jogador a1 = new Jogador();
		a1.nome = "Messi";
		a1.vida = 100;
		
		Jogador a2 = new Jogador();
		a2.nome = "Cristiano";
		a2.vida = 80;
		System.out.println(a1.mostrarVida());
		System.out.println(a2.mostrarVida());
		a2.atacar(a1);
		System.out.println(a1.mostrarVida());
		a2.sofrerDano();
		System.out.println(a2.mostrarVida());
		
		
		
		sc.close();
	}
}
