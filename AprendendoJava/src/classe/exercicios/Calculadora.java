package classe.exercicios;

public class Calculadora {
	static Double somar(double a,double b) {
		return a + b;
	}
	static Double subtrair(double a,double b) {
		return a - b;
	}
	
	static Double multiplicar(double a,double b) {
		return a * b;
	}
	
	static Double dividir(double a,double b) {
		if(b == 0) {
			return 0D;
		}
		else {
			return a / b;
		}
	}
}
