package poo.composicao;

public class CursoTeste {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Jonas");
        Aluno a2 = new Aluno("miguel");
        Aluno a3 = new Aluno("Luis");

        Curso c1 = new Curso("Java Completo");
        Curso c2 = new Curso("Grafos");
        Curso c3 = new Curso("web");

        c1.adicionarAluno(a1);
        c2.adicionarAluno(a2);
        c2.adicionarAluno(a1);
        c2.adicionarAluno(a3);

        a1.adicionaCurso(c3);
        a2.adicionaCurso(c3);
        a3.adicionaCurso(c3);



        for(Aluno aluno: c1.alunos){
            System.out.println("Estou matriculado no curso 1....");
            System.out.println("Meu nome é " + aluno.nome);
            System.out.println();
        }

        System.out.println(a1.cursos.get(0).alunos);

        Curso cursoEncontrado = a1.getCursoPorNome("Java Completo");

        if(cursoEncontrado != null){
            System.out.println(cursoEncontrado.nome);
            System.out.println(cursoEncontrado.alunos);
        }
    }
}
