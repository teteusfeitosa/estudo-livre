package classe.exercicios;

import java.util.Scanner;

public class Lampada {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Lampada.mostrarEstado();
		Lampada.ligar();
		Lampada.mostrarEstado();
		Lampada.desligar();
		Lampada.mostrarEstado();
		
		
		sc.close();
	}
	
	
	static Boolean ligada = false;
	
	Lampada(Boolean ligada){
		Lampada.ligada = ligada;
	}
	
	static void mostrarEstado() {
		if(ligada) {
			System.out.println("Está ligada");
		}
		else {
			System.out.println("Desligada");
		}
		
	}
	static void ligar() {
		if(ligada) {
			System.out.println("Já está ligada");
		}
		else {
			ligada = true;
			System.out.println("Agora está ligada");
		}
	}
	
	static void desligar() {
		if(!ligada) {
			System.out.println("Já está desligada");
		}
		else {
			ligada = false;
			System.out.println("Agora está desligada");
		}
		
		
	}
	
	
}
