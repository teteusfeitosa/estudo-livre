package controle.exercicios;

import java.util.Scanner;

// ache os números primos 
public class Questao06 {
	static void main(String...args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Até que número quer verificar que é primo?");
		n = sc.nextInt();
		
		for(int i = 2; i <= n; i++) {
			int primo = 1;
			
			for(int j = 2; j * j <= i; j++) {
				if(i % j == 0) {
					primo = 0;
					break;
				}
			}
			if(primo == 1) {
				System.out.printf("O primo é %d\n",i);
			}	
			
		}
		
		sc.close();
	}
}
