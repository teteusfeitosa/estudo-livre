package poo.composicao.exercicios;

public class Pessoa {
    final String nome;
    Endereco endereco = new Endereco();

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public void mostrarEndereço(Endereco endereco){
        this.endereco = endereco;
        System.out.println("O " + this.nome + " mora na rua " + this.endereco.rua
        + ",de número "+ this.endereco.numeroDaRua + ",da cidade " + this.endereco.cidade);
    }
}
