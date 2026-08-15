package poo.composicao.exercicios;

public class AlunoTeste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Matheus",202670);
        Curso c1 = new Curso("Computação","5 anos");
        a1.adicionarCurso(c1);
        a1.mostraCurso();

        c1.adicionaAluno(a1);
    }
}
