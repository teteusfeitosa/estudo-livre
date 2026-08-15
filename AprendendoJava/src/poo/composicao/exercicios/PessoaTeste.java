package poo.composicao.exercicios;

public class PessoaTeste {
    public static void main(String[] args) {
        Endereco e = new Endereco();
        e.cidade = "Fortaleza";
        e.numeroDaRua = 70;
        e.rua = "Rua caetano cavalcante";
        Pessoa p = new Pessoa("Matheus");
        p.mostrarEndereço(e);

        p.mostrarEndereço(e);

        System.out.println( p.endereco.rua);


    }
}
