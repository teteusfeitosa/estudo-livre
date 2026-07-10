package classe.exercicios;

public class CarroTeste {
	public static void main(String[] args) {
		Carro a = new Carro();
		a.marca = "Ford";
		a.modelo = "Ford ka";
		a.velocidade = 70;
		
		Carro b = new Carro();
		b.marca = "Volkswagen";
		b.modelo = "Gol";
		b.velocidade = 50;
		
		a.apresentaCarros();
		b.apresentaCarros();
		
		a.acelerar();
		b.frear();
		
		System.out.println(a.velocidadeAtual());
		System.out.println(b.velocidadeAtual());
		
		
	}
}
