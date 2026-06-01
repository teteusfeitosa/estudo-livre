#include <stdio.h>
/*
Faça um programa que lê uma quantidade qualquer de notas de 0 a 10 (não permitir fora
desta faixa). Se o usuário digitar a nota -1, o programa deve mostrar quantas notas foram digitadas, a média e a
quantidade com valor abaixo de 5. Para sair o usuário deve digitar S.
*/
int main(){
    int nota,qtd = 0, qtd5 = 0;
    int soma = 0;
    float media = 0;
    char op = '\0';

    do{
        printf ("Coloque a nota\n");
        scanf ("%d", &nota);

        if (nota >= 5 && nota <= 10){
            qtd++;
            soma += nota;
        }
        else if (nota <= 0 && nota < 5 ){
            qtd5++;
            soma += nota;
        }
        media = soma/(qtd + qtd5);

        if (nota == -1){
            printf ("Sua média foi de %.1f\n", media);
            printf ("A quantidade de notas abaixo de 5 foram %d\n", qtd5);
            printf ("A quantidade total de notas foi de %d\n", qtd5 + qtd);
        }

        printf ("Você deseja continuar?(S para sair)\n");
        scanf (" %c", &op);


    }while (op != 'S');

    return 0;
}