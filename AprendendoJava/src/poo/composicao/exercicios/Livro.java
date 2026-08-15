package poo.composicao.exercicios;

public class Livro {
    Autor autor;
    String titulo;

    Livro(){
        this.autor = new Autor();
    }

    public void mostrarInformacoes(){
        System.out.println("Nome do Autor: " + this.autor.nome
        + ", nacionalidade: " + this.autor.nacionalidade + ", titulo: " + this.titulo);
    }
}
