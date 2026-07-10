package classe.exercicios;

public class Carro {
	String marca;
	String modelo;
	double velocidade;
	
	double frear() {
		double fator_Frear = 0.75;
		velocidade = fator_Frear * velocidade;
		return velocidade;
	}
	
	void apresentaCarros() {
			
		System.out.printf("O nome do carro é %s e ele pertence a marca %s\n",modelo,marca);
	}
	
	double acelerar() {
		double fator_Acelerar = 1.25;
		velocidade = fator_Acelerar * velocidade; 
		return velocidade;
	}
	
	String velocidadeAtual() {
		return String.format("A velocidade do carro agora é %.2f",velocidade);
	}
}
