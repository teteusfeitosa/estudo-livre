package fundamentos;

public class DesafioOperador {
	public static void main(String[] args) {
		double num6 = 6;
		double num3 = 3;
		double num2 = 2;
		double num7 = 7;
		double num5 = 5;
		double num1 = 1;
		double num10AoCubo = Math.pow(10,3);
		
		double parte1 = (num6 *(num3 + num2));
		double parte2 = Math.pow(parte1 , 2);
		double parte3 = parte2/(num3 * num2);
		
		double parte4 = ((num1 - num5) * (num2 - num7))/num2;
		double parte5 = Math.pow (parte4 , 2);
		
		double subtracao = parte3 - parte5;
		double eleva = Math.pow(subtracao, 3);
		
		double resultado = eleva/num10AoCubo;
		
		System.out.println("O resultado da op	eração aritmética é: " + resultado);
	}
}
