package poo.composicao.desafio;

import poo.composicao.Item;

import java.util.ArrayList;

public class Cliente {

    final String nome;

    public ArrayList<Compra> compras = new ArrayList<>();

    public Cliente(String nome) {
        this.nome = nome;
    }

    double getValorTotal(){
        double total = 0;

        for(Compra compra: compras){
            total += compra.valorTotal();
        }

        return total;
    }
}
