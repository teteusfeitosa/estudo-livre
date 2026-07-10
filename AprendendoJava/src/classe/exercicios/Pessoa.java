package classe.exercicios;

public class Pessoa {
	String nome;
	int idade;
	
	void apresentar() {
		System.out.printf("Olá,meu nome é %s e tenho %d anos\n",nome,idade);
	}
	
	Pessoa(){
		
	}
	
	Pessoa(String nomeInicial,int idadeInicial){
		nome = nomeInicial;
		idade = idadeInicial;
	}
	
	
	String fazAniversario() {
		idade++;
		return String.format("O %s Agora tem %d anos\n",nome,idade);
	}
}
