package classe.exercicios;

public class Bhaskara {

	static double delta(int a,int b,int c) {
		return  Math.pow(b,2) - 4 * a * c;
	}
	static double raiz1(int a,int b,int c) {
		
		return (Math.sqrt(delta(a,b,c)) - b)/(2*a); 
	}
	
	
	static double raiz2(int a,int b,int c) {
		
		return (-Math.sqrt(delta(a,b,c)) - b)/(2*a); 
	}
}
