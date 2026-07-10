package classe.exercicios;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto a = new Produto("Cigarro",10,100);
		
		Produto b = new Produto("Água",2,1000);
		
		System.out.println(a.valorEstoque());
		System.out.println(b.valorEstoque());
		
	}
}
