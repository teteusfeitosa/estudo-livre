package poo.composicao.exercicios;

import java.math.BigDecimal;
import java.util.ArrayList;

public class ClienteTeste {
    static void main(String[] args) {
        Conta conta = new Conta();
        conta.cliente.nome = "joão";
        conta.cliente.id = "123";
        conta.numero = "8899693451";
        conta.saldo = 1000D;

        conta.mostrarDados();
        conta.depositarCem();
        conta.depositarCem();
        conta.depositarCem();
        conta.depositarCem();

        conta.sacarCem();
        conta.sacarCem();
        conta.sacarCem();
        conta.sacarCem();

        System.out.println(conta.sacado);

        conta.mostrarDados();

        Endereco endereco = new Endereco();
        endereco.rua = "Rua caetano cavalcante";
        endereco.cidade = "Fortaleza";
        endereco.numeroDaRua = 2957;

        Cliente cliente = new Cliente(endereco);

        Pedido pedido = new Pedido();
        pedido.preço = 100D;
        pedido.quantidade = 200D;
        pedido.nomeDoProduto = "Pasta de dente";







    }
}
