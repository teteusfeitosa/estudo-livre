package classe.exercicios;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa a = new Pessoa();
		a.nome = "Lucas";
		a.idade = 20;
		
		Pessoa b = new Pessoa("João",22);
		
		
		a.apresentar();
		b.apresentar();
		
		System.out.print(a.fazAniversario());
		System.out.print(b.fazAniversario());
		
		a.apresentar();
		b.apresentar();
	}
}
