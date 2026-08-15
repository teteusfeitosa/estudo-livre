package poo.composicao.desafio;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Lucas");
        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta",10D,100);
        compra1.adicionarItem("Notebook",5000D,2);
        //compra.adicionarItem(new Produto("notebook",5000D),2); outra forma quando muda metodo

        Compra compra2 = new Compra();
        compra2.adicionarItem("caderno",10D,100);
        compra2.adicionarItem("papel",5000D,5);

        c1.compras.add(compra1);
        c1.compras.add(compra2);

        System.out.println(c1.getValorTotal());


    }

}
