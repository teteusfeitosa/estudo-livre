package classe.exercicios;

public class Produto {
	String nome;
	Double preço;
	Integer quantidade;
	
	Produto(String nome,double preço,int quantidade){
		this.nome = nome;
		this.preço = preço;
		this.quantidade = quantidade;
	}
	
	Double valorEstoque() {
		return preço * quantidade;
	}
	
}
