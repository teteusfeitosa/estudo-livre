package poo.composicao;
//Compra tem vários itens
public class CompraTeste {
    static void main(String[] args) {
        Compra c1 = new Compra();
        c1.cliente = "João Pedro";
        c1.itens.add(new Item("Caneta",20, 7.45));
        c1.itens.add(new Item("borracha",25, 10));
        c1.itens.add(new Item("caderno",10, 11));

        System.out.println(c1.itens);
        System.out.println(c1.itens.size());
        System.out.println(c1.getValorTotal());
    }
}
