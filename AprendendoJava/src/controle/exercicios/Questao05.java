package controle.exercicios;

import java.util.Scanner;

//eceba dois tempos em minutos. O programa deve calcular a
//diferença absoluta em segundos entre eles
public class Questao05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int min1, min2;
		
		System.out.println("Coloque os 2 tempos");
		min1 = sc.nextInt();
		min2 = sc.nextInt();
		
		min1 *= 60;
		min2 *= 60;
		
		int diferenca = min1 - min2;
		
		if(diferenca < 0) {
			diferenca = -(diferenca);
		}
		
		System.out.println("A diferença em segundos é de: " + diferenca);
		
		
		
		
		
		sc.close();
	}
}
