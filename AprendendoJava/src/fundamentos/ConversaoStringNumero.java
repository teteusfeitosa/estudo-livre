package fundamentos;

import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.showInputDialog;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		String valor1 = showInputDialog("Digite o primeiro número");
		String valor2 = showInputDialog("Digite o segundo número");
		
		System.out.println(valor1 + valor2);//concatena
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		System.out.println(soma);
		System.out.println(soma/2);
		
	}
}
