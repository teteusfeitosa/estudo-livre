package poo.composicao.exercicios;

public class LivroTeste {
    static void main(String[] args) {
        Livro livro = new Livro();
        livro.autor.nome = "lucas";
        livro.autor.nacionalidade = "Brasil";
        livro.titulo = "A pedra filosófica";
        livro.mostrarInformacoes();

    }
}
