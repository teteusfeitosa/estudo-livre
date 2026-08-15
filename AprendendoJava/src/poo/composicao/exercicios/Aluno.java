package poo.composicao.exercicios;

import java.util.ArrayList;

public class Aluno {
    final String nome;
    final Integer matricula;


    ArrayList <Curso> cursos = new ArrayList<>();

    public Aluno(String nome, Integer matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void adicionarCurso(Curso curso){
        this.cursos.add(curso);
        curso.alunos.add(this);
    }

    public void mostraCurso() {

        if (this.cursos.isEmpty()) {
            System.out.println("O aluno " + this.nome + " não está matriculado em nenhum curso.");
            return;
        }

        for (Curso curso : this.cursos) {
            System.out.println("O meu curso é " + curso.nome +
                    " e a duração do curso é " + curso.duracao);
        }
    }

}
