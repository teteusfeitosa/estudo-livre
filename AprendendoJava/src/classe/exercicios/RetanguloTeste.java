package classe.exercicios;

import java.lang.reflect.Array;

public class RetanguloTeste {
	public static void main(String[] args) {
		Retangulo a = new Retangulo();
		a.altura = 10D;
		a.base  = 20D;
		
		Retangulo b = new Retangulo();
		b.altura = 10D;
		b.base  = 10D;
		
		System.out.println(a.calcularAreaEMostra());
		System.out.println(a.calculaPerimetroEMostra());
		
		System.out.println(b.calcularAreaEMostra());
		System.out.println(b.calculaPerimetroEMostra());
	}
}
