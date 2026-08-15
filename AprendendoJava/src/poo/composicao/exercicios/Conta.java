package poo.composicao.exercicios;

import java.math.BigDecimal;

public class Conta {
    String numero;
    Double saldo;
    Cliente cliente;
    Double sacado = 0D;

    Conta(){
        this.cliente = new Cliente();
    }

    public void mostrarDados(){
        System.out.println("Nome: " + cliente.nome + ", Possui um saldo de " + this.saldo
        + "R$\n" + "O seu id é " + this.cliente.id);
    }
    public void sacarCem(){
        if(this.saldo < 100){
            System.out.println("Saldo insuficiente para sacar");
        }
        else{
            this.saldo -= 100;
            this.sacado += 100D;
        }
    }

    public void depositarCem(){
        this.saldo += 100;
        System.out.println("Depósito feito");
    }

}
