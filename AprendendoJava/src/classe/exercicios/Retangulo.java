package classe.exercicios;

public class Retangulo {
	Double base;
	Double altura;
	
	String calcularAreaEMostra() {
		return String.format("A área é %.2fm²",base * altura);
	}
	String calculaPerimetroEMostra() {
		return String.format("O perímetro desse retângulo é %.2fm",(2 * base + 2 * altura));
	}
}
