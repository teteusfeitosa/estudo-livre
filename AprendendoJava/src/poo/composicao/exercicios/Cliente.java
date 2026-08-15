package poo.composicao.exercicios;

import java.util.ArrayList;

public class Cliente {
    String id;
    String nome;

    Endereco endereco;

    Cliente(){
        this.endereco = new Endereco();
    }

    Cliente(Endereco endereco){
        this.endereco = endereco;
    }
    ArrayList<Pedido> pedidos = new ArrayList <>();

    public void valorDoPedido() {
        double total = 0;
        for (Pedido pedido : pedidos) {
            total += pedido.preço * pedido.quantidade;
        }
    }


}
