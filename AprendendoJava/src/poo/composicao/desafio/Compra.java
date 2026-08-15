package poo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

    final ArrayList<Item> itens = new ArrayList<>();

    void adicionarItem(String nome,Double preço,int quantidade){
        Produto produto = new Produto(nome,preço);
        this.itens.add(new Item(produto, quantidade));
    }
    Double valorTotal(){
        double total = 0;

        for(Item item: itens){
            total += item.quantidade * item.produto.preço;
        }
        return total;
    }
}
