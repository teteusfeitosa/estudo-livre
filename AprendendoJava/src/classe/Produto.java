package classe;

public class Produto {
	String nome;
	double preço;
	static double desconto = 0.25; 
	
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	
	Produto(){
		
	}
	
	double preçoComDesconto(){
		double resultado = preço * (1 - desconto);
		return resultado;
	}
}
