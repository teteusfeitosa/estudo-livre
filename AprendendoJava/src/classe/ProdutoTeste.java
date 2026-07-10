package classe;


public class ProdutoTeste {
	public static void main(String...args) {
		
		Boolean natal = false;
		
		Produto p1 = new Produto("Notebook");
		//p1.nome = "Notebook";
		p1.preço = 4356.89;
		
		var p2 = new Produto("Celular");
		p2.nome = "Celular";
		p2.preço = 3000;
		
		System.out.println(p2.nome);

		if(natal) {
			Produto.desconto = 0.3;
			System.out.println(p1.preçoComDesconto());
			System.out.println(p2.preçoComDesconto());
			System.out.println(Produto.desconto);
		}
		else {
			System.out.println(Produto.desconto);
			System.out.println(p1.preçoComDesconto());
			System.out.println(p2.preçoComDesconto());
		}
		
	}
}
