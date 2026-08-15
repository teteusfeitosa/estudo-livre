package poo.composicao;

import java.util.ArrayList;

public class Compra {
    String cliente;
    public ArrayList <Item> itens = new ArrayList<>();

    double getValorTotal(){
        double total = 0;

        for(Item item: itens){
            total += item.quantidade * item.preço;
        }
        return total;
    }
}
