package classe;

public class Jantar {
	public static void main(String[] args) {
		Comida a = new Comida();
		a.nomeDaComida = "Feijão";
		a.pesoDaComida = 0.200;
		
		Comida b = new Comida();
		b.nomeDaComida = "Arroz";
		b.pesoDaComida = 0.150;
		
		Pessoa a1 = new Pessoa();
		a1.nome = "Lucas";
		a1.peso = 60;
		
		Pessoa b1 = new Pessoa();
		b1.nome = "joão";
		b1.peso = 67;
		
		System.out.printf("Peso do %s antes de comer = %.2f\n",a1.nome,a1.peso);
		System.out.printf("Peso do %s antes de comer = %.2f\n",b1.nome,b1.peso);
		
		a1.comer(a);
		b1.comer(b);
		
		System.out.printf("Peso do %s depois de comer = %.2f\n",a1.nome,a1.peso);
		System.out.printf("Peso do %s depois de comer = %.2f\n",b1.nome,b1.peso);
	}
}
