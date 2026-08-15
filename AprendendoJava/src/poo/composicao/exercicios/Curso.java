package poo.composicao.exercicios;

import java.util.ArrayList;

public class Curso {
    String duracao;
    final String nome;

    ArrayList <Aluno> alunos = new ArrayList<>();
    public Curso(String nome, String duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public void adicionaAluno(Aluno aluno){
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }

}
