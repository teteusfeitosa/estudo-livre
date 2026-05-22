#include <stdio.h>
/*
Elaborar programa que lê 10 notas (de 0 a 10, com uma casa decimal), e informa se o aluno passou na
disciplina, repetindo o ciclo até que o usuário digite S para sair. O aluno passa quando tira média igual ou maior
que 7.
*/
int main(){
    float nota,media = 0;
    char op = '\0';
    float qtd = 0;
    float soma = 0;

    do{
        for (int i = 0; i<=9; i++){
        printf ("Coloque sua nota\n");
        scanf ("%f", &nota);
        if (nota > 0){
            qtd++;
            soma += nota;
        }
        }
        media = soma/qtd;
        if (media >= 7){
            printf ("Aprovado com média %.1f\n", media);
        }
        else{
            printf ("Reprovado com média %.1f\n", media);
        }

        printf ("Coloque s para sair(opcional)\n");
        scanf (" %c", &op);

    }while (op != 's');

    return 0;
}